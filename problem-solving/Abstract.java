import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book {

    private int price;

    /**
     *   Class Constructor
     *
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.print("Price: " + this.price);

    }
}

public class Abstract {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}