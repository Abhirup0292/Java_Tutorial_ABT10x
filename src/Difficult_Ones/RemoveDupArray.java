package Difficult_Ones;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDupArray {

    public static void main(String[] args) {

        int[] arr1 = {11,12,131,14,15,131,141,151,161,14,15};

        int[] arr2 = Arrays.stream(arr1).distinct()
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(arr2));

    }

}
