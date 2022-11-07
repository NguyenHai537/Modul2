import  java.util.Scanner;

public class BaiTapTimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] list = {"Hai", "Long", "Quang", "Vinh", "Cuong", "Phu"};
        System.out.println("Nhập tên cần tìm kiếm: ");
        String name = sc.nextLine();
        int i = -1;
        for ( int j = 0; j < list.length; j++){
            if (list[j].equals(name)){
                i = j;
            }
        }
        if ( i == -1){
            System.out.println("Tên bạn nhập không có trong danh sách!");
        }else
            System.out.println("Tên bạn nhập ở vị trí thứ " + (i+1) + " trong danh sách");

    }
}
