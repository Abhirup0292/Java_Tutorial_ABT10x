package Ex01_Java_Basics;

import java.util.Scanner;

public class Lab11_IsAlphabet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single byte character or a number : ");
        String data = scanner.nextLine();
        char ch = data.charAt(0);

        //Need to use Character class

        if (Character.isLetter(ch)){
            System.out.println(data + " this an alphabet");

        }
        else if (Character.isDigit(ch)) {
            System.out.println(data + " this a number");

        }

    }
}
