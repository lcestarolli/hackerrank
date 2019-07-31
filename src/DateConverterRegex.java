import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DateConverterRegex {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */

        Integer hour = Integer.valueOf(s.substring(0,2));

        if(s.substring(8, 10).equals("AM")){
            hour = hour == 12 ? 00 : hour;
        }else{
            hour = hour == 12 ? 12 : hour + 12;
        }

        return String.format("%02d", hour).concat(s.substring(2,8));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/cestarolli/devel/workspace/personal/out.txt"));

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
