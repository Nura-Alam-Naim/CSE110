import java.io.IOException;
import java.io.PrintWriter;

public class Write {
    public static void main(String[] args) throws IOException {
        java.io.File file=new java.io.File("All.txt");
        if(file.exists())
        {
            System.out.println("File already Exists");
            System.exit(0);
        }
        try(PrintWriter input=new PrintWriter(file))
        {
            input.print("John F kenedy");
            input.println(90);
            input.print("Admiral g Auditore");
            input.println(25);
        }
    }
}
