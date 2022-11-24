package BaiTapSuDungClassIllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException {



    public void textInput() {

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập chiều dài cạnh a:");
             int numA = sc.nextInt();
            System.out.println("Nhập chiều dài cạnh b:");
             int numB = sc.nextInt();
            System.out.println("Nhập chiều dài cạnh c:");
             int numC = sc.nextInt();
            try {
                if ( numA >0 && numB > 0 && numC >0) {
                    System.out.println("Ok");
                    if (numA + numB > numC) {
                        System.out.println("1");
                    } else if (numA + numC > numB) {
                        System.out.println("2");
                    } else if (numB + numC > numA) {
                        System.out.println("3");
                    }
                }
            }catch (Exception e){
                System.err.println("loi" + e.getMessage());
            }
    }

    public static void main(String[] args) {
        IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
        illegalTriangleException.textInput();
    }
}
