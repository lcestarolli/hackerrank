import java.util.Scanner;

public class LetsReview {

    public static void spliStrings(String s){

        String evenLetters = "";
        String oddLetters = "";
        char[] sArray = s.toCharArray();

        for(int i = 0; i < sArray.length; i++){
            if((i % 2) == 0){
                evenLetters = evenLetters + sArray[i];
            }else{
                oddLetters = oddLetters + sArray[i];
            }
        }

        System.out.println(evenLetters);
        System.out.println(oddLetters);

    }


    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();

        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i = 0; i < lines; i++){
            String s = scan.nextLine();
            spliStrings(s);
        }

        scan.close();
    }
}
