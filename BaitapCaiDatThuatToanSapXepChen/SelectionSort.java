package BaitapCaiDatThuatToanSapXepChen;

import java.util.Scanner;

public class SelectionSort {
    public int [] insertionSort(int[] list){
        System.out.println("Nhập chiều dài mảng: ");
        Scanner sc = new Scanner(System.in);
        int lenghtArray = sc.nextInt();
        int [] myArray = new int[lenghtArray];
        System.out.println("Nhập phần tử mảng:");
        for (int k = 0; k < lenghtArray ; k++ ){
            int numberArray = sc.nextInt();
        }



        for (int i = 0 ; i< lenghtArray ; i++){
            for (int j = 0 ; j < lenghtArray - 1 ; j++){
                if ( myArray[j] > myArray[j+1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }

        return myArray;


    }
}
