package BtClassPointAndMoveablePoint;

public class TestMovePoint {
    public static void main(String[] args) {
        MoveablePoint mv = new MoveablePoint(1.0f,1.0f);
        System.out.println(mv);
        System.out.println(mv.move());
        System.out.println(mv);


        mv.setSpeed(2.0f, 2.0f);
        System.out.println(mv.getSpeed()[0] + " " + mv.getSpeed()[1]);
        System.out.println(mv.move());
        System.out.println(mv);


    }
}
