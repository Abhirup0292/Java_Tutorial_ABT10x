package Ex01_Java_Basics;

import java.util.Arrays;

public class Lab23_SortArray2 {

    public static void main (String[] args) {

        int [] arr1 = {19, 101, 11, 12, 120, 34, 350, 65, 12, 990, 100};
        BubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void BubbleSort (int[] arr) {

        //First loop is for number of iteration needed to sort the array.
        // For Bubble sort it is always (n-1).
        for (int i = 0; i < arr.length-1; i++) {

           //check if the number 'n' is greater than 'n+1' -> then swap
            for (int j = 0; j < arr.length - 1; j++) {

                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }

}
