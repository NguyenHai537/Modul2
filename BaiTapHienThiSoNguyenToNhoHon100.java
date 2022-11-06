public class BaiTapHienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int count = 0;
        int n = 0;
        System.out.println("Các số nguyên tố nhỏ hơn 100: ");
        for ( int i =0; i <100; i++){
                for ( int j=1; j <= i ; j++){
                    if ( i % j ==0){
                        count++;
                    }
                }
                if ( count == 2){
                    n++;
                    System.out.println("Số nguyên tố thứ " + n + " là : " + i);
                }
                count = 0;
        }

    }
}
