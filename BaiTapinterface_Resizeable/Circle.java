package BaiTapinterface_Resizeable;

public class Circle implements Resizeable{
    private double radius = 0;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle ( double radius){
        this.radius = radius;
    }

    public double getArea (){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void resize(double percent) {
        this.radius = (getRadius() + percent);
    }
}
