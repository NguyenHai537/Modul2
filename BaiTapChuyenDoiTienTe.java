import java.util.Scanner;

public class BaiTapChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000d;
        double usd ;
        System.out.println("Nhập số lượng USD cần chuyển: ");
        usd = sc.nextDouble();
        double result = usd * vnd;
        System.out.println("Số tiền VND là: " + result +"VND");
    }
}
