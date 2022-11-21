package BaiTapTaoArrayListStudent;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementMenu studentManagementMenu = new StudentManagementMenu();
        BookManagenmentMenu bookManagenmentMenu = new BookManagenmentMenu();
        BorrowManagementMenu borrowManagementMenu = new BorrowManagementMenu();

        display();
        int choice = sc.nextInt();
        sc.nextLine();
        while (choice != 0){
            switch (choice) {
                case 1 -> studentManagementMenu.menu();
                case 2 -> bookManagenmentMenu.menu();
                case 3 -> borrowManagementMenu.menu();
                default -> System.out.println("Your choice not found!");
            }
            display();
             choice = sc.nextInt();
            sc.nextLine();
        }


    }

    private static void display() {
        System.out.println("Menu: ");
        System.out.println("1.Student Menu");
        System.out.println("2.Book Menu");
        System.out.println("3.Borrow Menu");
        System.out.println("0.Exit");
        System.out.println("Enter your choice: ");
    }
}
