import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class MyCalculator implements AdvancedArithmetic {
    public int divisorSum(int n) {

        int result = 0;
        for (int i = n; i > 0; i--) {
            if((n % i) == 0) result += i;
        }
        return result;
    }
}

class Interfaces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new MyCalculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}