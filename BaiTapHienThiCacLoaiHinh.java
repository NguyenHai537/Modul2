import java.util.Scanner;

public class BaiTapHienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square triangle");
        System.out.println("3.  Draw isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                int width;
                int height;
                System.out.println("Enter the width: ");
                width = sc.nextInt();
                System.out.println("Enter the height: ");
                height = sc.nextInt();
                for ( int i = 0; i < height; i++){
                    for ( int j = 0; j < width ; j++){
                        System.out.print("*" + " ");
                    }
                    System.out.println("\n");
                }
                break;
            case 2:
                System.out.println("The square triangle botton-left");
                for ( int i = 1 ; i <=5; i++){
                    for ( int j = 1; j <= i; j++){
                        System.out.print("*" + " ");
                    }
                    System.out.println("\n");
                }
                System.out.println("The square triangle top-left");
                for ( int i = 5 ; i >=1; i--){
                    for ( int j = 1; j <= i; j++){
                        System.out.print("*" + " ");
                    }
                    System.out.println("\n");
                }
                System.out.println("The square triangle botton-right");
                for ( int i = 1 ; i <=5; i++){
                    for ( int j = 5; j >= i; j--){
                        System.out.print("  ");
                        if ( j == i){
                            for ( int k = 0; k < j; k++){
                                System.out.print("*"+ " ");
                            }
                        }
                    }
                    System.out.println("\n");
                }
                System.out.println("The square triangle top-right");
                for ( int i = 5 ; i >=1; i--){
                    for ( int j = 5; j >= 1; j--){
                        System.out.print("  ");
                        if ( j == i){
                            for ( int k = 0; k < j; k++){
                                System.out.print("*"+ " ");
                            }
                        }
                    }
                    System.out.println("\n");
                }
                break;
            case 3:
                System.out.println("Draw isosceles triangle");
                for ( int i = 1 ; i <=7; i++){
                    for ( int j = 7; j >= i; j--){
                        System.out.print(" ");
                        if ( j == i){
                            for ( int k = 0; k < j; k++){
                                System.out.print("*"+ " ");
                            }
                        }
                    }
                    System.out.println("\n");
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("No Choice!");

        }
    }
}
