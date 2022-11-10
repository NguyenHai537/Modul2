public class TestStaticMethod {
    public static void main(String[] args) {
        ClassStudent.change();

        ClassStudent s1 = new ClassStudent(111, "Hai");
        ClassStudent s2 = new ClassStudent(222, "Long");
        ClassStudent s3 = new ClassStudent(333, "Quang");

        s1.display();
        s2.display();
        s3.display();
    }
}
