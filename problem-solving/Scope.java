import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {

        List<Integer> elementList = new ArrayList<Integer>();

        for (int i = 0; i < elements.length; i++) {
            elementList.add(elements[i]);
        }

        Collections.sort(elementList);
        maximumDifference = elementList.get(elementList.size() - 1) - elementList.get(0);

    }


    // Add your code here

} // End of Difference class

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}