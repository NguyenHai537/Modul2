public class QuadraticEquation {
    double a , b ,c;

    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b ,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }
    public double getDiscriminant(){
        double delta = Math.pow(b,2) - 4 * a * c;
        return delta;
    }
    public double getRoot1(){
        double x1 = (- getB() + Math.sqrt(getDiscriminant())) / 2* getA();
        return x1;
    }
    public double getRoot2(){
        double x2 = (- getB() - Math.sqrt(getDiscriminant())) / 2* getA();
        return x2;
    }
    public double getRoot1and2(){
        double x = -getB() / (getA() * 2);
        return x;
    }

}
