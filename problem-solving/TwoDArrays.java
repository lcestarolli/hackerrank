import org.omg.CORBA.INTERNAL;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDArrays {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        List<Integer> maxHourglassSumList = new ArrayList<Integer>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                sum += arr[i][j];
                sum += arr[i][j + 1];
                sum += arr[i][j + 2];
                sum += arr[i + 1][j + 1];
                sum += arr[i + 2][j];
                sum += arr[i + 2][j + 1];
                sum += arr[i + 2][j + 2];
                maxHourglassSumList.add(sum);
            }
        }

        Collections.sort(maxHourglassSumList);
        System.out.println(maxHourglassSumList.get(15));

        scanner.close();
    }
}
