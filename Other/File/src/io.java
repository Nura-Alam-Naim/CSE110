import java.io.File;
import java.util.Scanner;

public class io {
    public static void main(String[] args) throws Exception {
        //File file = new File("All.txt");
        Scanner input = new Scanner(new File("All.txt"));

        if (input.hasNext()) {
            String fn = input.next();
            String mn = input.next();
            String ln = input.next();
            int s = input.nextInt();

            System.out.println("First Name: " + fn);
            System.out.println("Middle Name: " + mn);
            System.out.println("Last Name: " + ln);
            System.out.println("Score: " + s);
        } else {
            System.out.println("No data available in the file.");
        }

        input.close(); // Don't forget to close the Scanner.
    }
}
