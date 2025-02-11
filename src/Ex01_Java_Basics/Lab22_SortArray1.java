package Ex01_Java_Basics;
import java.util.Arrays;

public class Lab22_SortArray1 {

    public static void main(String[] args) {
        int[] arr1 = {11,35,10,9,34,65,12,11,34,99,100} ;

        int[] arr2 = Arrays.stream(arr1).distinct().sorted().toArray();
        System.out.println("Sorted Array without duplicates :");
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        System.out.println("Sorted Array with duplicates :");
        System.out.println(Arrays.toString(arr1));



    }

}
