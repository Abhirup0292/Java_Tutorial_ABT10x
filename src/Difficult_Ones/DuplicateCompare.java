package Difficult_Ones;

public class DuplicateCompare {

    public static void main(String[] args) {

        int[] arr1 = {11, 12, 131, 14, 15, 131, 141, 151, 161, 14, 15};
        int[] arr2 = {151, 16, 141, 15, 99, 92};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
