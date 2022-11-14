package BaiTapinterface_Resizeable;

public class TestResizeable {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle(4.6, 5.0);
        Square square = new Square(2.0);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());

        int random  = (int) (Math.random() * 100);
        System.out.println(random);
        circle.resize(random);
        rectangle.resize(random);
        square.resize(random);
        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());

    }
}
