import java.util.Scanner;

public class BaiTapTinhTongCacDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cột của Ma trận: ");
        int cols = sc.nextInt();
        System.out.println("Nhập số hàng của Ma trận: ");
        int rows = sc.nextInt();
        while (rows != cols){
            System.out.println("Số cột và hàng của Ma trận vuông phải bằng nhau! Vui lòng nhập lại: ");
            rows = sc.nextInt();
        }
        int [][] matrix = new int[rows][cols];
        for ( int i = 0; i < rows ; i++){
            System.out.println("Nhập số cho Ma trận: ");
            for (int j = 0; j < cols ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for ( int i = 0; i < rows ; i++){
            for (int j = 0; j < cols ; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        int sumDiagonalLineLeft = 0;
        int sumDiagonalLineRight = 0;
        int sumTotal;
        for ( int g= 0 ; g < rows ; g++){
                sumDiagonalLineLeft += matrix[g][g];
                sumDiagonalLineRight += matrix[g][rows- (g+1)];

        }
        sumTotal = sumDiagonalLineLeft + sumDiagonalLineRight;
        System.out.println("Tổng của 2 đường chéo là: " + sumTotal);


    }
}
