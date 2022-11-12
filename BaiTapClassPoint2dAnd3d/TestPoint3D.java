package BaiTapClassPoint2dAnd3d;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(2.0f, 3.5f, 4.6f);
        System.out.println(point3D);
        System.out.println(point3D.getXYZ()[0] +" " + point3D.getXYZ()[1] +" " +  point3D.getXYZ()[2]);

        point3D.setZ(4.0f);
        point3D.setY(2.5f);
        point3D.setX(3.0f);
        System.out.println(point3D);
        System.out.println(point3D.getXYZ()[0] +" " + point3D.getXYZ()[1] +" " +  point3D.getXYZ()[2]);

        point3D.setXYZ(1.0f,1.0f,1.0f);
        System.out.println(point3D);
        System.out.println(point3D.getXYZ()[0] +" " + point3D.getXYZ()[1] +" " +  point3D.getXYZ()[2]);


    }
}
