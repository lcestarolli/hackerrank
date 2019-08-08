import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringReduction {

    // Complete the stringReduction function below.
    static int stringReduction(String s) {

        s = s.trim();

        char[] characters = s.toCharArray();

        //0 = a ; 1 = b; 2 = c
        int[] letters = new int[3];

        for (int i = 0; i < characters.length; i++) {
            if(characters[i] == 97) letters[0] ++;
            if(characters[i] == 98) letters[1] ++;
            if(characters[i] == 99) letters[2] ++;
        }

        Arrays.sort(letters);

        while (letters[0] != 0 || letters[1] != 0){

            letters[2] --;
            letters [1] --;
            letters[0] ++;

            Arrays.sort(letters);

        }

        int result = letters[0] + letters[1] + letters[2];
        System.out.println(result);
        return result;

    }

    static String selectNewCharacter(String firstCharacter, String secondCharacter) {

        List<String> characterList = new ArrayList<String>();

        characterList.add(firstCharacter);
        characterList.add(secondCharacter);

        if (characterList.contains("a") && characterList.contains("b")) {
            return "c";
        } else if (characterList.contains("a") && characterList.contains("c")) {
            return "b";
        } else if (characterList.contains("b") && characterList.contains("c")) {
            return "a";
        } else {
            return "";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            int result = stringReduction(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
