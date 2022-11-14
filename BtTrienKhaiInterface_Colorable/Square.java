package BtTrienKhaiInterface_Colorable;

import Colorable.Colorable;

public class Square extends  Shape implements Colorable {
    private double size = 0;

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea(){
        return this.size * this.size;
    }

    @Override
    public String toString() {
        return "A square with "
                +"Area is: "
                + getArea()
                +" Colorable: " + howToColor()
                +
                super.toString();
    }

    @Override
    public String howToColor() {
        return " Color all four sides..";
    }
}
