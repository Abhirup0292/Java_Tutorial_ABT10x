package Ex01_Java_Basics;

import java.util.Scanner;

public class Lab8_Vowel {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a alphabet : ");
        String alpha = scanner.nextLine();

        if (alpha.equals("a") || alpha.equals("e") || alpha.equals("i") ||alpha.equals("o") || alpha.equals("u") ){
            System.out.println("The entered alphabet is a Vowel in lower case");

        }
        else if (alpha.equals("A") || alpha.equals("E") || alpha.equals("I") ||alpha.equals("O") || alpha.equals("U") ){
            System.out.println("The entered alphabet is a Vowel in upper case");

        }
        else{
            System.out.println("The entered alphabet is consonent");
        }

    }
}
