package BtClassPointAndMoveablePoint;

public class MoveablePoint extends Point{
    private  float xSpeed = 0.0f;
    private  float ySpeed = 0.0f;

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(){}

    public MoveablePoint ( float x , float y ,float xSpeed , float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint ( float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed (){
        float [] getSpeed = {this.xSpeed , this.ySpeed};
        return getSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "speed= " + xSpeed + "," + ySpeed;
    }
    public MoveablePoint move(){
         setX(getX() + xSpeed);
         setY(getY() + ySpeed);
        return this;
    }
}
