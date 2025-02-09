package Ex01_Java_Basics;

public class Lab15_CommonElementArray {

    public static void main (String[] args) {

        int [] arr1 = {11,12,13,14,15};
        int [] arr2 = {12,23,24,35,86,15,11};

        for (int i = 0; i<arr1.length; i++){
            for (int j=0; j<arr2.length; j++) {

                if(arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);

                }
            }
        }
    }
}
