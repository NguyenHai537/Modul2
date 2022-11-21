package BaiTapTaoArrayListStudent;

import java.util.List;
import java.util.Scanner;

public class BookManagenmentMenu {
    public Scanner sc = new Scanner(System.in);

    BookManagement bookManagement = BookManagement.getBookManagement();

    public BookManagenmentMenu(){}

    public void menu (){
        display();
        int choice = sc.nextInt();
        sc.nextLine();

        while (choice !=0){
            switch (choice){
                case 1 -> {
                    addBook();
                }
                case 2 ->{
                    removeBook();
                }
                case 3 ->{
                    searchById();
                }
                case 4 ->{
                    searchByName();
                }
                case 5 -> {
                    searchByStyle();
                }
                case 6 -> {
                    displayListBook();
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

    private void displayListBook() {
        System.out.println(bookManagement);
    }

    private static void display() {
        System.out.println("Menu:");
        System.out.println("1. Add book");
        System.out.println("2. Remove book by ID");
        System.out.println("3. Search book by ID");
        System.out.println("4. Search book by Name");
        System.out.println("5. Search book by Style");
        System.out.println("6. Display List Book");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
    }

    private void searchByStyle() {
        System.out.println("Enter book Style:");
        String bookStyle = sc.nextLine();
        List result = bookManagement.searchByStyle(bookStyle);
        if ( result != null){
            System.out.println(result);
        }else
            System.out.println("Book style not found!");


    }

    private void searchByName() {
        System.out.println("Enter book Name:");
        String bookName = sc.nextLine();
        List<Book> result =  bookManagement.searchByName(bookName);
        if ( result != null ){
            System.out.println(result);
        }else
            System.out.println("Book name not found!");



    }

    private void searchById() {
        System.out.println("Enter book ID:");
        String bookID = sc.nextLine();
        Book result =  bookManagement.searchById(bookID);
        if ( result != null){
            System.out.println(result);
        }else
            System.out.println("Book ID not found!");


    }

    private void removeBook() {
        System.out.println("Enter book ID:");
        String bookID = sc.nextLine();
        boolean result =  bookManagement.removeBook(bookID);
        if (result){
            System.out.println("Book is removed");
        }else
            System.out.println("Book ID not found!");


    }

    private void addBook() {
        System.out.println("Enter book ID:");
        String bookID = sc.nextLine();
        System.out.println("Enter book Name:");
        String bookName = sc.nextLine();
        System.out.println("Enter book Style:");
        String bookStyle = sc.nextLine();

        Book book = new Book(bookID,bookName,bookStyle);
        bookManagement.addBook(book);
    }
}
