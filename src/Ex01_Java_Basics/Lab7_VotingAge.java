package Ex01_Java_Basics;

import java.util.Scanner;

public class Lab7_VotingAge {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age : ");

        int a = Integer.parseInt(scanner.nextLine());

        if(a>=18){
            System.out.println("Congratulation. You are of eligible voting age : "+a);
        }
        else{
            System.out.println("You still need to wait for : "+(18-a)+" years. Your current age is : "+a);
        }
    }
}
