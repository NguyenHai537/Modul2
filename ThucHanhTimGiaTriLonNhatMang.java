 import java.util.Scanner;
public class ThucHanhTimGiaTriLonNhatMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] list = new double[20];
        for ( int i = 0; i < 20; i++){
            System.out.println("Nhập số tiền(đơn vị: tỷ đô): ");
            list[i] = sc.nextDouble();
        }
        double maxMoney = list[0];
        int iMax = 0;
        for (int j = 1; j < list.length ; j++){
            if ( list[j] > maxMoney){
                maxMoney = list[j];
                iMax = j + 1;
            }
        }
        System.out.println("Số tiền lớn nhất là : " + maxMoney + " (tỷ đô) ở vị trí thứ " + iMax + " trong danh sách.");
    }

}
