package BaiTapClassPoint2dAnd3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public  float getX(){
        return  x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return  y;
    }
    public  void setY(float y) {
        this.y = y;
    }
    public Point2D(){}

    public Point2D(float x , float y){
        this.x = x;
        this.y = y;
    }
    public  void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] getXY = {this.x , this.y};
        return getXY;
    }
    public String toString(){
        return "x= " + x + " y= " + y ;
    }
}
