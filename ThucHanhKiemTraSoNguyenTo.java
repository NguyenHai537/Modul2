import java.util.Scanner;

public class ThucHanhKiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int number = sc.nextInt();
        int count = 0;
        int i = 1;
        while (i <= number){
            if ( number % i == 0){
                count++;
            }
            i++;
        }
        if ( count == 2){
            System.out.println("Đây là số nguyên tố");
        }else{
            System.out.println("Đây không phải số nguyên tố");
        }

    }
}
