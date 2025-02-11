package Difficult_Ones;

public class PrimeNum1 {

    static boolean isPrime (int number) {
        boolean b = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                b = false;
                return b;
            }
        }
        return b;
    }

    public static void main (String [] args) {

        System.out.println ("List of Pirme Numbers are : ");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        for (int j = 4; j <= 10; j++) {

            boolean b1 = isPrime(j);

            if (b1 == true) {

                System.out.println(j);
            }
        }


    }



}



