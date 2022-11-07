import java.util.Scanner;

public class ThucHanhTimMinMaxTrongMang {
    public static void main(String[] args) {
        int [] Mang1 = {6,5,4,19,4,25,1,0};
        int x = minNumber(Mang1);
        System.out.println("Min number is: " + x);
        int y = maxNumber(Mang1);
        System.out.println("Max number is: " +y);
    }
    public static int minNumber(int [] a){
        int minNum = a[0];
        for (int i =1; i < a.length; i++){
            if ( a [i] < minNum){
                minNum = a[i];
            }
        }
        return minNum;
    }
    public static int maxNumber( int [] a){
        int maxNum = a[0];
        for ( int i=1 ; i < a.length; i++){
            if ( a[i] > maxNum){
                maxNum = a[i];
            }
        }
        return maxNum;
    }
}

