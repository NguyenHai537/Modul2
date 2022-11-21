package BaiTapTaoArrayListStudent;

import java.util.List;
import java.util.Scanner;

import static BaiTapTaoArrayListStudent.BookManagement.getListBook;
import static BaiTapTaoArrayListStudent.StudentManagement.getListStudent;


public class BorrowManagementMenu {
    Scanner sc = new Scanner(System.in);
    BorrowManagement borrowManagement = new BorrowManagement();

    public BorrowManagementMenu (){}

    public void menu(){
        display();
        int choice = sc.nextInt();
        sc.nextLine();

        while (choice !=0){
            switch (choice){
                case 1 -> {
                    addBorrow();
                    break;
                }
                case 2 ->{
                    removeBorrow();
                    break;
                }
                case 3 ->{
                    returnBorrow();
                    break;
                }
                case 4 ->{
                    unpaidBooks();
                    break;
                }
                case 5 -> {
                    unpaidStudent();
                    break;
                }
                case 6 -> {
                    displayBorrow();
                }
                default -> {
                    System.out.println("Your choice not found!");
                }
            }
            display();
            choice = sc.nextInt();
            sc.nextLine();
        }

    }

    private void displayBorrow() {
        System.out.println(borrowManagement);
    }

    private void unpaidStudent() {
        boolean check = borrowManagement.checkBorrow();
        List<Student> result  = borrowManagement.unpaidStudent(getListStudent());
        if (check){
            System.out.println(result);
        }else
            System.out.println("Không có học sinh chưa trả!");
    }

    private void unpaidBooks() {
        List<Book> result = borrowManagement.unpaidBooks(getListBook());
        boolean check = borrowManagement.checkBorrow();
       if ( check){
           System.out.println(result);
       }else
           System.out.println("Không có sách chưa trả!");
    }

    private void returnBorrow() {
        System.out.println("Enter ID student:");
        String studentId = sc.nextLine();
        System.out.println("Enter ID book:");
        String bookId = sc.nextLine();

        borrowManagement.returnBorrow(studentId, bookId);
    }

    private void removeBorrow() {
        System.out.println("Enter ID student:");
        String studentId = sc.nextLine();
        System.out.println("Enter ID book:");
        String bookId = sc.nextLine();

        borrowManagement.removeBorrow(studentId, bookId);
    }

    private void addBorrow() {
        System.out.println("Enter ID student:");
        String studentId = sc.nextLine();
        System.out.println("Enter ID book:");
        String bookId = sc.nextLine();
        System.out.println("Enter date borrow:");
        String date = sc.nextLine();

        Borrow borrow = new Borrow(studentId,bookId,date);

        borrowManagement.addBorrow(borrow);
    }

    private static void display() {
        System.out.println("Menu: ");
        System.out.println("1. Add Borrow");
        System.out.println("2. Remove Borrow");
        System.out.println("3. Return Borrow");
        System.out.println("4. List of unpaid books");
        System.out.println("5. List of unpaid students");
        System.out.println("6.Display list borrow");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
    }
}
