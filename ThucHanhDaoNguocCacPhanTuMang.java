import java.util.Scanner;

public class ThucHanhDaoNguocCacPhanTuMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] mang1;
        int size;
        System.out.println("Nhập tổng số phần tử trong mảng: ");
        size = sc.nextInt();
        mang1 = new int[size];
        for ( int i = 0; i< size ; i++){
            System.out.println("Nhập phần tử thứ " + (i+1) + ":");
            mang1[i] = sc.nextInt();
        }
        int [] mang2 = new int[mang1.length];
        for (int i =0 ; i < mang2.length ; i++){
            mang2[i] = mang1[mang1.length - (i+1)];
        }
        System.out.println("Mảng 1: ");
        for (int i=0 ; i < mang1.length ; i++){
            System.out.print( mang1[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Mảng 2: ");
        for (int i=0 ; i < mang2.length ; i++){
            System.out.print( mang2[i] + " ");
        }


    }
}
