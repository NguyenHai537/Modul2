import java.util.Scanner;

public class BaitapBuildClassQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = sc.nextDouble();
        System.out.println("Enter number b: ");
        double b = sc.nextDouble();
        System.out.println("Enter number c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadra = new QuadraticEquation(a ,b,c);
        double delta = quadra.getDiscriminant();

        if ( delta > 0){
            System.out.println("Phương trình có nghiệm 1 là: " + quadra.getRoot1());
            System.out.println("Phương trình có nghiệm 2 là:" + quadra.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép là: " + quadra.getRoot1and2());
        }else
            System.out.println("Phương trình vô nghiệm");


    }
}
