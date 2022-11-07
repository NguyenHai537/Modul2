import java.util.Scanner;

public class ThucHanhChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the Fahrenheit(f)");
                float f = sc.nextFloat();
                float c;
                c = (5.0f / 9.0f) * (f - 32.0f);
                System.out.println(c +"C");
                break;
            case 2:
                System.out.println("Enter the Celsius(C)");
                float doC = sc.nextFloat();
                float doF;
                doF = doC / ( 5.0f / 9.0f) + 32.0f;
                System.out.println(doF +"F");
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("No choice!");

        }
    }
}
