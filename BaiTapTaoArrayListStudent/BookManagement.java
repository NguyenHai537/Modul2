package BaiTapTaoArrayListStudent;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {
    private static ArrayList<Book> listBook;
    private static  BookManagement bookManagement = new BookManagement();

//    private static BookManagement bookManagement2 = new BookManagement(ArrayList<Book> listBook);

    public static BookManagement getBookManagement(){
        return bookManagement;
    }

    private BookManagement(){
        listBook = new ArrayList<>();
    }
//
//    private BookManagement(ArrayList<Book> listBook){
//        BookManagement.listBook = listBook;
//    }
//    public static BookManagement getBookManagement( ArrayList<Book> listBook){
//        return
//    }

    public static ArrayList<Book> getListBook() {
        return listBook;
    }

    public static void setListBook(ArrayList<Book> listBook) {
        BookManagement.listBook = listBook;
    }

    public void addBook(Book book){
        listBook.add(book);
    }

    public Book searchById(String id){
        for (Book book: listBook
             ) {
            if  (book.getiD().equals(id)){
                return book;
            }
        }
        return null;
    }

    public boolean removeBook(String id){
        Book result  = searchById(id);
        if ( result != null){
            listBook.remove(result);
            return true;
        }else
            return false;
    }

    public List<Book> searchByName(String name){
        List<Book> list = new ArrayList<>();
        for (Book book: listBook
             ) {
            if ( book.getName().equals(name)){
                list.add(book);
            }
        }
        return list;
    }

    public List<Book> searchByStyle(String style){
        List<Book> list = new ArrayList<>();
        for (Book book: listBook
        ) {
            if ( book.getStyle().equals(style)){
                list.add(book);
            }
        }
        return list;
    }

    @Override
    public String toString() {
        String result = "";
        for (Book books: listBook
             ) {
            result += books + "\n";
        }
        return result;
    }
}
