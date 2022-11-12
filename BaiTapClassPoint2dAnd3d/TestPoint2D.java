package BaiTapClassPoint2dAnd3d;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D  = new Point2D(1.0f, 2.0f);
        System.out.println(point2D);

        point2D.setX(3.5f);
        point2D.setY(4.3f);
        System.out.println(point2D);

        System.out.println(point2D.getXY()[0] + " " + point2D.getXY()[1]);

        point2D.setXY(3.6f,4.6f);
        System.out.println(point2D.getXY()[0] + " " + point2D.getXY()[1]);


    }
}
