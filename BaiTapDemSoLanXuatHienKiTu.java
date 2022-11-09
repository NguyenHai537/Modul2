import java.util.Arrays;
import java.util.Scanner;

public class BaiTapDemSoLanXuatHienKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String text = sc.nextLine();
        System.out.println("Nhập kí tự cần đếm : ");
        String characters = sc.nextLine();
        char c = characters.charAt(0);
        int count = 0;
        for (int i = 0 ; i < text.length(); i++){
            if ( c == text.charAt(i)){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự trong chuỗi là: " + count);

    }

}
