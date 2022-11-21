package BaiTapTaoArrayListStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private static ArrayList<Student> listStudent;


    public static ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public static void setListStudent(ArrayList<Student> listStudent) {
        StudentManagement.listStudent = listStudent;
    }

    public static void addStudent(Student sv) {
        listStudent.add(sv);
    }

    public static boolean isStudent(String id) {
        boolean result = false;
        for (Student studens : listStudent
        ) {
            if (studens.getiD().equals(id))
                result = true;
        }
        return result;
    }


    public static void searchById(String iDStudent) {
        if (isStudent(iDStudent)) {
            for (Student students : listStudent
            ) {
                if (students.getiD().equals(iDStudent)) {
                    System.out.println(students);
                }
            }
        } else
            System.out.println("Học sinh này không tồn tại!");
    }





    public static void removeById(String iDStudent) {



        int number = -1;
        for (Student students : listStudent
        ) {
            if (students.getiD() == iDStudent) {
                number = listStudent.indexOf(students);
            }
        }
        if (number >= 0) {
            listStudent.remove(number);
        } else
            System.out.println("Không có sinh viên này trong danh sách!");
    }


        public static void displayList() {
            for (Student students : listStudent
            ) {
                System.out.println(students);

            }
        }

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

                if (choice == 1) {
                    System.out.println("Nhập ID sinh viên: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập tên sinh viên: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập địa chỉ sinh viên: ");
                    String address = sc.nextLine();
                    Student student = new Student(id, name, address);
                    addStudent(student);
                } else if (choice == 2) {
                    System.out.println("Nhập ID sinh viên muốn xóa:");
                    String id = sc.nextLine();
                    removeById(id);

                } else if (choice == 3) {
                    System.out.println("Nhập ID sinh viên muốn tìm kiếm:");
                    String id = sc.nextLine();
                    searchById(id);
                } else if (choice == 4) {
                    displayList();
                }

            } while (choice != 0);


        }


    }

