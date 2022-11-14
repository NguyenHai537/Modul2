package BaiTapinterface_Resizeable;

public class Square implements Resizeable {
    private double size = 0;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Square(double size) {
        this.size = size;
    }
    public double getArea(){
        return this.size * this.size;
    }

    @Override
    public void resize(double percent) {
        this.size = (getSize() + percent);
    }


}
