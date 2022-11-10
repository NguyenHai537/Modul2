public class ClassStudent {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    ClassStudent ( int r, String n){
        rollno = r;
        name = n;
    }

    static void change(){
        college = "CODEGYM";
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
