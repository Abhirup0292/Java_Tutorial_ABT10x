package Ex01_Java_Basics;

import java.util.Scanner;

public class Lab12_IsPrimeCheck {

    public static void main(String[] args) {

        boolean b = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a = Integer.parseInt(scanner.nextLine());

        if (a <= 3) {
            System.out.println("This is a Prime Number " + a);
        }
        else {

            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    b = false;
                }
                break;
            }

            if (b == false) {
                System.out.println("This is not Prime Number " + a);
            } else {
                System.out.println("This is a Prime Number " + a);
            }


        }

    }
}