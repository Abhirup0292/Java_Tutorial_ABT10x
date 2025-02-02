package Ex01_Java_Basics;

public class Lab10_LeapYear
{
    public static void main(String[] args)
    {
        int year = 2025;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println("this is a leap year :"+year);
        }
        else{
        System.out.println("this is not a leap year :"+year);
    }

    }

}
