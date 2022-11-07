import java.util.Scanner;

public class BaiTapTinhTongCacSoMotCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cột: ");
        int cols = sc.nextInt();
        System.out.println("Nhập số hàng: ");
        int rows = sc.nextInt();
        int[][] table = new int[cols][rows];
        for (int i = 0 ; i < cols ; i++){
            System.out.println("Nhập số vào cột " + (i+ 1));
            for ( int j = 0 ; j < rows ; j++){
                table[i][j] = sc.nextInt();
            }
        }
        System.out.println("Nhập cột muốn tính: ");
        int colNumber = sc.nextInt();
        while (colNumber > cols){
            System.out.println("Số cột chưa đúng! Xin nhập lại:");
            colNumber = sc.nextInt();
        }
        int sumCols = 0;
        for (int i =0 ; i < rows ; i++){
            sumCols += table[colNumber-1][i];
        }

        System.out.println("Tổng của cột là : " + sumCols);
    }
}
