import java.util.Scanner;
public class BaitTapThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] Mang1 = {4,2,8,9,14,25,0,0,0,0,0};
        System.out.println("Nhập số cần chèn:");
        int number = sc.nextInt();
        System.out.println("Nhập vị trí cần chèn:");
        int adress = sc.nextInt();
        while ( adress >= Mang1.length -1 || adress <= 0){
            System.out.println("Vị trí bạn nhập không đúng! Vui lòng nhập lại : ");
             adress = sc.nextInt();
        }
           for ( int j =Mang1.length-1; j >= adress ; j--){
               Mang1[j] = Mang1[j - 1 ];
           }
           Mang1[adress] = number;
        for (int x: Mang1
             ) {
            System.out.print(x + " ");
        }


    }
}
