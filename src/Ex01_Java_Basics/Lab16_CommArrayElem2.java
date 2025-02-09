package Ex01_Java_Basics;

public class Lab16_CommArrayElem2 {

    public static void main (String[] args) {

        int[] arr1 = {11,11,12,13,14,15,15,24,26,27,28,28};

        for (int i=0; i<arr1.length-1; i++) {

            for (int j=i+1; j<arr1.length; j++) {

                if (arr1[i] == arr1[j]) {

                    System.out.println(arr1[i]);

                }
            }
        }
    }
}
