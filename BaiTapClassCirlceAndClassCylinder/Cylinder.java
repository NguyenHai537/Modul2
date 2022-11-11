package BaiTapClassCirlceAndClassCylinder;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public Cylinder (){}

    public void setHeight(double height) {
        this.height = height;
    }


    public Cylinder(double height, double radius , String color){
        super(radius ,color);

        this.height = height;
    }
    public double getVolume(){
        return Math.PI * Math.pow(getRadius(),2) * height;
    }

    @Override
    public String toString() {
        return "Height is : " + height + " Volume is: " + getVolume() + super.toString();

    }
}
