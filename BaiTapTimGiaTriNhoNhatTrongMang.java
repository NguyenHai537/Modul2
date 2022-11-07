import java.util.Scanner;

public class BaiTapTimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tổng số lượng phần tử :");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập số:");
        for (int i = 0 ; i < list.length ; i++){
           list[i] = sc.nextInt();
        }
        int minValue = list[0];
        for ( int i = 1 ; i < list.length ; i ++){
            if ( list[i] < minValue){
                minValue = list[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là : " + minValue);

    }
}
