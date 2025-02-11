package Ex01_Java_Basics;

import java.util.Scanner;

public class Lab2b_FactorialNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = scanner.nextInt();

        for (int i = a-1; i > 0 ; i--) {

            a = a*i;

        }
        System.out.println(a);

    }


}
