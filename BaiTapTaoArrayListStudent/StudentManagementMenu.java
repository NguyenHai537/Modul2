package BaiTapTaoArrayListStudent;

import java.util.Scanner;

public class StudentManagementMenu {
    public Scanner sc = new Scanner(System.in);

    StudentManagement studentManagement = new StudentManagement();

    public StudentManagementMenu(){};

    public void menu(){
        int choice = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1.Add  new  student" + "\n" +
                    " 2. Remove  a student" + "\n" +
                    " 3. Search  Student" + "\n" +
                    "4. Display List" + "\n" +
                    "0.Out");
            System.out.println("Xin nhập chức năng cần thực hiện:");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Nhập ID sinh viên: ");String id = sc.nextLine();
                System.out.println("Nhập tên sinh viên: "); String name = sc.nextLine();
                System.out.println("Nhập địa chỉ sinh viên: "); String address = sc.nextLine();
                Student student = new Student(id, name, address);
                StudentManagement.addStudent(student);
            } else if (choice == 2) {
                System.out.println("Nhập ID sinh viên muốn xóa:");String id = sc.nextLine();
                StudentManagement.removeById(id);
            } else if (choice == 3) {
                System.out.println("Nhập ID sinh viên muốn tìm kiếm:");String id = sc.nextLine();
                StudentManagement.searchById(id);
            } else if (choice == 4) {
                StudentManagement.displayList();
            }
        } while (choice != 0);

    }


}
