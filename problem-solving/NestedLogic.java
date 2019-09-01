import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        String arrivedDate = scanner.nextLine();
        String[] arrivedDateSplited = arrivedDate.split(" ");

        int Da = Integer.parseInt(arrivedDateSplited[0]);
        int Ma = Integer.parseInt(arrivedDateSplited[1]);
        int Ya = Integer.parseInt(arrivedDateSplited[2]);

        String estimatedDate = scanner.nextLine();
        String[] estimatedDateSplited = estimatedDate.split(" ");

        int De = Integer.parseInt(estimatedDateSplited[0]);
        int Me = Integer.parseInt(estimatedDateSplited[1]);
        int Ye = Integer.parseInt(estimatedDateSplited[2]);


        if(Ya > Ye){
            System.out.println(10000);
        }else if(Ya - Ye == 0 && Ma > Me){
            System.out.println(500 * (Ma - Me));
        }else if (Ya - Ye == 0 && Da > De) {
            System.out.println(15 * (Da - De));
        }else{
            System.out.println(0);
        }

        scanner.close();

    }
}

