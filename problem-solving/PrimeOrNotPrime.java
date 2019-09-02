import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrimeOrNotPrime {

    public static String primeOrNotPrime(int number){


        int div =  (int) Math.ceil(Math.sqrt(number));

        if(number == 1) {
            return "Not prime";
        }

        if(number == 2) {
            return "Prime";
        }


        boolean isPrime = true;

        for (int i = 2; i <= div; i++) {
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime ? "Prime" : "Not prime";

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amountNumbers = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] numbers = new int[amountNumbers];



        for (int i = 0; i < amountNumbers; i++) {
            int number = scanner.nextInt();
            numbers[i] = number;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(primeOrNotPrime(numbers[i]));
        }

        scanner.close();
    }

}



