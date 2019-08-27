import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.LinkedList;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumbers {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        LinkedList<Integer> binaryList = new LinkedList<Integer>();

        int totalConsecutiveOnes = 0;
        while(n > 0){
            int remainder = n % 2;
            n = n / 2;
            binaryList.addFirst(remainder);
        }

        int totalConsecutiveOneTemp = 0;
        for (int i = 0; i < binaryList.size(); i++) {
            if(binaryList.get(i) == 1){
                totalConsecutiveOneTemp ++;
            }else {
                if(totalConsecutiveOneTemp > totalConsecutiveOnes){
                    totalConsecutiveOnes = totalConsecutiveOneTemp;
                    totalConsecutiveOneTemp = 0;
                }else{
                    totalConsecutiveOneTemp = 0;
                }
            }
        }

        if(totalConsecutiveOneTemp > totalConsecutiveOnes) totalConsecutiveOnes = totalConsecutiveOneTemp;


        System.out.println(binaryList.toString());
        System.out.println(totalConsecutiveOnes);


        scanner.close();
    }
}
