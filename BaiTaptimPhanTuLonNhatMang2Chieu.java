import java.util.Scanner;

public class BaiTaptimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tổng số hàng: ");
        int row = sc.nextInt();
        System.out.println("Nhập tổng số phần tử trong 1 hàng: ");
        int col = sc.nextInt();
        int [][] mang1 = new int[row][col];
        for (int i = 0 ; i < row; i++){
            System.out.println("Nhập các phần tử hàng " + (i+1));
            for ( int j=0; j < col ; j++){
                mang1[i][j] = sc.nextInt();
            }
        }
        int maxValue = 0;
        int rowValue = 0;
        int colValue = 0;
        for ( int i = 0; i < mang1.length ; i++){
            for ( int j=0 ; j < mang1[mang1.length-1].length; j++){
                if ( mang1[i][j] > maxValue){
                    maxValue = mang1[i][j];
                    rowValue = i;
                    colValue = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất là : " + maxValue + " nằm ở vị trí thứ "+colValue + " trong  hàng " + rowValue);

    }
}
