package Ex01_Java_Basics;

import java.util.Scanner;

public class Lab6_EvenOdd {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int a = Integer.parseInt(scanner.nextLine());

        if (a%2 == 0){
            System.out.println("The entered number is EVEN : "+a);
        }
        else{
            System.out.println("The entered number is ODD : "+a);

        }

    }
}
