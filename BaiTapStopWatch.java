import java.util.Scanner;

public class BaiTapStopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StopWatch watch = new StopWatch();

        System.out.println("Nhập số 1 để bắt đầu:");
        int start = sc.nextInt();
        if ( start ==1){
            watch.start();
        }while(start !=1) {

            System.out.println("Số bạn nhập không đúng! Xin hãy nhập lại: ");
            start = sc.nextInt();

        }
        System.out.println("Nhập số 2 để kết thúc: ");
        int end = sc.nextInt();
        if (end == 2 ){
            watch.stop();
        }
        System.out.println("Thời gian chênh lệch là: " + watch.getElapsedTime());
    }
}
