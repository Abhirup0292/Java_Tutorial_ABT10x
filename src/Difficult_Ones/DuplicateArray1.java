package Difficult_Ones;

public class DuplicateArray1 {

    public static void main(String[] args) {

        int[] arr1 = {11,12,131,14,15,131,141,151,161,14,15};

        for (int i = 0; i < arr1.length - 1 ; i++) {
            for (int j = i+1 ; j < arr1.length; j++) {

                if (arr1[i] == arr1[j]) {

                    System.out.println(arr1[i]);

                }

            }

        }

    }

}
