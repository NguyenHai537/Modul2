import java.util.Scanner;

public class ThucHanhTinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tháng bạn muốn kiểm tra: ");
        int number = scanner.nextInt();
        if (number < 13) {
            switch (number) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.print("Tháng này có 31 ngày ");
                    break;
                case 2:
                    System.out.print("Tháng này có 28 hoặc 29 ngày ");
                    break;
                default:
                    System.out.print("Tháng này có 30 ngày");
            }
        }else {
            System.out.print("Số tháng bạn nhập không đúng!");
        }
    }
}
