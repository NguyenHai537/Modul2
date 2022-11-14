package BaiTapinterface_Resizeable;

public class Rectangle implements Resizeable{
    private double width = 0;
    private double heigh  =0;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }
    public Rectangle ( double width , double heigh){
        this.width = width;
        this.heigh = heigh;
    }
    public double getArea(){
        return this.heigh * this.width;
    }

    @Override
    public void resize(double percent) {
        this.width = (getWidth() + percent);
    }
}
