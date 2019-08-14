//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class DictornariesAndMaps{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> phoneBooks = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here

            phoneBooks.put(name, phone);

        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here

            if(phoneBooks.containsKey(s)){
                System.out.println(s + "=" + phoneBooks.get(s));
            }else{
                System.out.println("Not Found");
            }



        }
        in.close();
    }
}

