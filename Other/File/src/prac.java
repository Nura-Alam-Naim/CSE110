import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class prac{
    public static void main(String[] args) throws Exception {
        try(PrintWriter output= new PrintWriter(new File("temp.txt")))
        {
            output.print("java 101");
        }
        Scanner input=new Scanner(new File("tem.txt"));
        System.out.println(input.nextLine());
    }
}
