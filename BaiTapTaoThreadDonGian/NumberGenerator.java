package BaiTapTaoThreadDonGian;

public class NumberGenerator implements Runnable {


    @Override
    public void run() {
        try {
            for (int i = 0 ; i < 10 ; i++){
                System.out.println("HashCode Generator is " + hashCode());
                System.out.println("Number is " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }




}
