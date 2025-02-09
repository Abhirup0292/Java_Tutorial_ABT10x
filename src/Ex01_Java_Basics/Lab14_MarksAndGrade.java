package Ex01_Java_Basics;

import java.util.Scanner;

public class Lab14_MarksAndGrade {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks obtained : ");
        int marks = Integer.parseInt(scanner.nextLine());

        if (marks >= 90 && marks<= 100) {
            System.out.println("Your Grade is : A+");
        }
        else if (marks >= 80 && marks<= 89) {
            System.out.println("Your Grade is : A");
        }
        else if (marks >= 70 && marks<= 79) {
            System.out.println("Your Grade is : B");
        }
        else if (marks >= 60 && marks<= 69) {
            System.out.println("Your Grade is : C");
        }
        else if (marks >= 50 && marks<= 59) {
            System.out.println("Your Grade is : C");
        }
        else if (marks >= 40 && marks<= 49) {
            System.out.println("Your Grade is : D");
        }
        else if (marks< 40) {
            System.out.println("Your Grade is less than D - FAIL");
        }


    }

}
