package Ex01_Java_Basics;

public class Lab19_MaxElementArray {
    
    public static void main (String[] args) {

        int[] arr = {11, 91, 12, 13, 14, 15, 51, 24, 26, 27, 128, 28};
        int max = arr[0];

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println(max);
    }
    
}
