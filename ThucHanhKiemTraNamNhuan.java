import java.util.Scanner;
public class ThucHanhKiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập số năm :");
        year = scanner.nextInt();
        boolean namnhuan = false;

        boolean chiahetcho4 = year % 4 ==0;
        if(chiahetcho4){
            boolean chiahetcho100 = year % 100==0;
            if(chiahetcho100){
                boolean chiahetcho400 = year % 400 ==0;
                if(chiahetcho400){
                    namnhuan = true;
                }
            }else{
                namnhuan = true;
            }
        }
        if(namnhuan){
            System.out.printf("%d là năm nhuận",year);
        }else{
            System.out.printf("%d không phải là năm nhuận", year);
        }
    }
}
