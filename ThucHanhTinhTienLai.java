import java.util.Scanner;

public class ThucHanhTinhTienLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money;
        int month;
        double rate;
        double totalMoney = 0;
        System.out.println("Nhập số tiền gửi: ");
        money = sc.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        month = sc.nextInt();
        System.out.println("Nhập số lãi suất: ");
        rate = sc.nextDouble();
        for ( int i=0 ; i < month ; i++){
            totalMoney += (money * rate / 100) / 12 * month;
        }
        System.out.println("Tổng số tiền nhận được là : " + totalMoney);
    }
}
