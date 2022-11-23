package BaiTapThuatToanSapXepChen;

public class SelectionSort {
    public static void main(String[] args) {
        int [] myArray = {-3,5,12,0,-6,54};

        for (int i = 0 ; i< myArray.length ; i++){
            for (int j = 0 ; j < myArray.length -1 ; j++){
                if ( myArray[j] > myArray[j+1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }

        for (int number: myArray
             ) {
            System.out.println(number);
        };
    }
}
