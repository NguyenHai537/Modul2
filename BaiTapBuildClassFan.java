import java.util.Scanner;

public class BaiTapBuildClassFan {
    public static void main(String[] args) {
      Fan fan1 = new Fan();
      fan1.setSpeed(3);
      fan1.setOn(true);
      fan1.setRadius(10);
      fan1.setColor("yellow");
      Fan fan2 = new Fan();
      fan2.setSpeed(2);
      fan2.setRadius(5);
      fan2.setOn(false);
      fan2.setColor("blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}
