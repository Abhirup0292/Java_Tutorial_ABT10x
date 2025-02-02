package Ex01_Java_Basics;
import java.util.Scanner;

public class Lab5_PositiveNegetive {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int a = Integer.parseInt(scanner.nextLine());

        if (a<0) {
            System.out.println("This is a negetive integer : "+a);
        }
        else{
            System.out.println("This is a positive integer : "+a);
        }




    }

}
