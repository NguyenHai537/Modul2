import java.util.Scanner;

public class ThucHanhTinhBIM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the your weight(kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Enter the your height(M): ");
        double height = scanner.nextDouble();
        double result = weight / Math.pow(height,2);
        if(result < 18.5){
            System.out.print("Underweight");
        }else if (18.5 <= result && result < 25.0){
            System.out.print("Normal");
        } else if (25.0 <= result && result < 30) {
            System.out.print("Overweight");
        }else {
            System.out.print("Obese");
        }

    }
}
