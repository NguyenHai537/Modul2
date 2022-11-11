public class RectangleTest {
    public static void main(String[] args) {
        Rectangle1 rec1 = new Rectangle1();
        System.out.println(rec1);

        rec1 = new Rectangle1(2.3, 5.8);
        System.out.println(rec1);

        rec1 = new Rectangle1(2.5, 3.8, "orange" , true);
        System.out.println(rec1);
    }
}
