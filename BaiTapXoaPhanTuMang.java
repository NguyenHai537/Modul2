import java.util.Scanner;

public class BaiTapXoaPhanTuMang {
    public static void main(String[] args) {
        int [] Mang1 = {1,8,6,19,0,3,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa: ");
        int number = sc.nextInt();
        int adress = -1;
        for ( int i=0; i < Mang1.length; i++){
            if ( number == Mang1[i]){
                adress = i;
            }
        }
        if ( adress == -1){
            System.out.println("Số bạn nhập không có trong danh sách!");

        }else{
            for (int j = adress; j< Mang1.length - 1; j++){
                Mang1[j] = Mang1[j +1];

            }
            Mang1[Mang1.length - 1] = 0;
            for (int x:Mang1
            ) {
                System.out.print(x+ " ");

            }
        }


    }
}
