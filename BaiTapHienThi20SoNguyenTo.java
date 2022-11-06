import java.util.Scanner;

public class BaiTapHienThi20SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        int countTotal = 0;
        int n = 0;
        for ( int i =0; i <1000; i++){
            if ( countTotal <20){
                for ( int j=1; j <= i ; j++){
                    if ( i % j ==0){
                        count++;
                    }
                }
                if ( count == 2){
                    n++;
                    System.out.println("Số nguyên tố thứ " + n + " là : " + i);
                    countTotal++;
                }
                count = 0;
            }else
                break;;
        }
    }
}
