package Ex01_Java_Basics;
import java.util.Scanner;

public class Lab4_userInput {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Taking user input - Name
        System.out.println("Enter your name: ");
        String Name = scanner.nextLine();

        //Taking user input -Age
        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Hello "+Name+" of age "+age);

    }


}
