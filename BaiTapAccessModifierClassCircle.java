public class BaiTapAccessModifierClassCircle {
    private double radius = 1.0;
    private String color = "red";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BaiTapAccessModifierClassCircle(){}

    public BaiTapAccessModifierClassCircle(double r){
        this.radius = r;
    }
    public double getRadiuss(){
        return Math.PI * 2 * this.radius;

    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }


}
