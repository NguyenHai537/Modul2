import java.sql.SQLOutput;
import java.util.Scanner;

public class ThucHanhGiaiPTBN {

    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Give a qquation as 'a * x + b = c',please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a : ");
        double a = scanner.nextDouble();

        System.out.println("Enter number b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter number c: ");
        double c = scanner.nextDouble();
        if (a != 0){
            double result = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", result);
        }else{
            if ( b==c){
                System.out.print("The solution is all x!");
            }else{
                System.out.print("No solution!");
            }
        }
    }
}
