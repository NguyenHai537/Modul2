package ThucHanhComparator;

public class Circle {
    private double radius =0;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Radius= " + this.radius;
    }
}
