package Ex01_Java_Basics;

public class Lab13_AllPrimeNum {

    public static void main(String[] args) {

        System.out.println("Prime numbers between 1 and 100:");
        System.out.print("1, 2, 3, ");

        for (int number = 4; number <= 100; number++) {
                boolean p = isPrime(number);
                //System.out.println("The number is :"+number+ " and value is "+p);

                if (p == true ){
                    System.out.print(number+ ", ");
                }

        }

    }

    public static boolean isPrime(int num) {
        boolean b = true;

        for (int i=2; i<= Math.sqrt(num); i++) {

            if (num % i == 0) {
                b = false;
                return b;
            }

        }
        return b;

    }

}