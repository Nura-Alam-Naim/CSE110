import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        Book[] books=new Book[5];
        for(int i=0;i<2;i++)
        {
            System.out.print("\u000C");
            System.out.print("ISBN number: ");
            int isbn=inp.nextInt();
            inp.nextLine();
            System.out.print("Book title: ");
            String title=inp.nextLine();
            System.out.print("Number of page: ");
            int page=inp.nextInt();
            inp.nextLine();
            books[i]=new Book(isbn,title,page);
        }
        DisplayAll(books);
    }
    public static void DisplayAll(Book[] books)
    {
        System.out.print("\u000C");
        for(int i=0;i<2;i++)
        {
            System.out.println(books[1].getCount());
            System.out.println("ISBN number: "+books[i].getISBN());
            System.out.println("Name: "+books[i].toString());
            System.out.println("Number of pages: "+books[i].getNumberOfPages());
            System.out.println();
        }
    }
    public static boolean Heavier(Book b)
    {
        return b.getNumberOfPages()>500;
    }
}
class Book {
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    static private int count=0;

    Book() {
    }

    Book(int isbn, String title, int pages) {
        ISBN = isbn;
        bookTitle = title;
        numberOfPages = pages;
        count++;
    }
    public int getISBN() {
        return ISBN;
    }

    public String toString() {
        return bookTitle;
    }

    public int compareTo(Book b) {
        return Integer.compare(getNumberOfPages(), b.getNumberOfPages());
    }

    public int getCount() {
        return count;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}