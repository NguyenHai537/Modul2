import java.util.Scanner;

public class ThucHanhDemSoSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tổng số sinh viên : ");
        size = sc.nextInt();
        double [] list = new double[size];
        while ( size > 30){
            System.out.println("Số lượng sinh viên vượt mức tối đa! Xin hãy nhập lại: ");
            size = sc.nextInt();;
        }
        System.out.println("Nhập điểm cho sinh viên");
        for ( int i = 0 ; i < size; i++){
            System.out.println("Sinh viên " + (i+1)+ " là:");
            list[i] = sc.nextDouble();
            while (list[i] < 0 || list[i] >10){
                System.out.println("Số điểm nhập chưa đúng! Xin nhập lại: ");
                list[i] = sc.nextDouble();
            }
        }
        int count = 0;
        for (int j = 0; j < list.length ; j++){
            if (list[j] >= 5 ){
                count++;
            }
        }
        System.out.println("Tổng số sinh viên thi đỗ là : " + count);
    }
}
