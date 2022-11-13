package BtClassPointAndMoveablePoint;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(2.0f);
        point.setY(3.0f);
        point.getXY();
        System.out.println(point);
        System.out.println(point.getXY()[0] + " " + point.getXY()[1]);


        point.setXY(4.0f , 5.0f);
        System.out.println(point);
        System.out.println(point.getXY()[0] + " " + point.getXY()[1]);

    }
}
