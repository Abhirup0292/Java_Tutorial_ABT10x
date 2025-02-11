package Ex01_Java_Basics;

import java.util.Arrays;

public class Lab18_RemoveDuplicateArr {

    public static void main(String[] args) {

        int[] arr = {11, 11, 12, 13, 14, 15, 15, 24, 26, 27, 28, 28};

        int[] newArr = Arrays.stream(arr).distinct().toArray();

        System.out.println("Distinct array is : " + Arrays.toString(newArr));

    }
}
