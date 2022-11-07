import java.util.Scanner;

public class BaiTapGopMang {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] Mang1 = new int[10];
    int [] Mang2 = new int[5] ;
    int [] Mang3 = new int[Mang1.length + Mang2.length];
    for( int i = 0; i< Mang1.length; i++){
        System.out.println("Nhập giá trị mảng 1: ");
        Mang1[i] = sc.nextInt();
    }
    for ( int j= 0 ; j < Mang2.length ; j++){
        System.out.println("Nhập giá trị mảng 2: ");
        Mang2[j] = sc.nextInt();
    }
    System.arraycopy(Mang1,0,Mang3,0,Mang1.length);
    System.arraycopy(Mang2,0,Mang3,Mang1.length,Mang2.length);
        for (int x: Mang1
             ) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int y: Mang2
             ) {
            System.out.print(y + " ");
        }
        System.out.println();
        for (int z: Mang3
             ) {
            System.out.print(z +" ");
        }

}
}
