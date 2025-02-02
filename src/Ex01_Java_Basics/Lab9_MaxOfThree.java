package Ex01_Java_Basics;
import java.util.Scanner;

public class Lab9_MaxOfThree {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the second number : ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the third number : ");
        int c = Integer.parseInt(scanner.nextLine());

        if (a>b && a> c){
            System.out.println (a + " : is the largest of all the three entered numbers");
        }
        else if (b>a && b> c){
            System.out.println (b + " : is the largest of all the three entered numbers");
        }
        else if (c>a && c> b){
            System.out.println (c + " : is the largest of all the three entered numbers");
        }

    }
}
