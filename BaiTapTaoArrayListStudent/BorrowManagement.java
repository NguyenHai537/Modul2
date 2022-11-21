package BaiTapTaoArrayListStudent;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowManagement {

    BookManagement bookManagement = BookManagement.getBookManagement();
    private ArrayList<Borrow> listBorrow;

    public BorrowManagement(){
        this.listBorrow = new ArrayList<>();
    }

    public BorrowManagement(ArrayList<Borrow> listBorrow) {
        this.listBorrow = listBorrow;
    }

    public void addBorrow (Borrow borrow){
        listBorrow.add(borrow);
    }

    public boolean removeBorrow ( String studentID , String bookID){
        for (Borrow borrow: listBorrow
             ) {
            if ( borrow.getStudentId().equals(studentID)){
                if(borrow.getBookID().equals(bookID)){
                    listBorrow.remove(borrow);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean returnBorrow(String studentID , String bookID){
        for (Borrow borrows: listBorrow
        ) {
            if ( borrows.getStudentId().equals(studentID)){
                if(borrows.getBookID().equals(bookID)){
                    borrows.setStatus(true);
                    borrows.setDateReturn(getDate());
                    return true;
                }
            }
        }
        return false;
    }

    public List<Book> unpaidBooks( ArrayList<Book> listBook){
        List<Book> unpaidBooksList = new ArrayList<>();
        for (Borrow borrows: listBorrow
             ) {
            if ( !borrows.isStatus()){
                for (Book books: listBook
                     ) {
                    if ( books.getiD().equals(borrows.getBookID())){
                        unpaidBooksList.add(books) ;
                    }
                }
            }
        }
        return unpaidBooksList;

    }

    public List<Book> unpaidBooks(){
        List<Book> listbook = new ArrayList<>();

        for (Borrow borrow: listBorrow
             ) {
            if ( !borrow.isStatus()){
                Book b = bookManagement.searchById(borrow.getBookID());
                if ( b != null){
                    listbook.add(b);
                }
            }
        }
        return listbook;
    }

    public boolean checkBorrow(){
        int count = -1;
        for (Borrow br: listBorrow
             ) {
            if ( !br.isStatus()){
                count++;
            }
        }
        if ( count != -1){
            return true;
        }else
            return false;
    }

    public List<Student> unpaidStudent ( ArrayList<Student> listStudent){
        List<Student> unpaidStudentList = new ArrayList<>();
        for (Borrow borrows: listBorrow
        ) {
            if ( !borrows.isStatus()){
                for (Student Students: listStudent
                ) {
                    if ( Students.getiD().equals(borrows.getStudentId())){
                        unpaidStudentList.add(Students);
                    }
                }
            }
        }
        return unpaidStudentList;
    }

    @Override
    public String toString() {
        String result = "";
        for (Borrow borrows : listBorrow
             ) {
            result += borrows + "\n";
        }

        return result;
    }

    public String getDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return formatter.format(date);
    }
}
