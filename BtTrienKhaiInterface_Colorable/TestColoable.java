package BtTrienKhaiInterface_Colorable;
import Colorable.Colorable;
public class TestColoable {
    public static void main(String[] args) {
        Shape [] shapes = {new Circle(2.0), new Rectangle(3.2,4.5), new Square(4.0)};

        for (Shape shape: shapes
             ) {
            System.out.println(shape.toString());

        }
    }

}
