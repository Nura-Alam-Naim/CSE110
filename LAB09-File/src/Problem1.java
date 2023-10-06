import java.io.*;
public class Problem1 {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter input = new PrintWriter(new FileOutputStream(new File("Lab08_01.txt"), true)))
        {
            for (int i = 0; i < 100; i++)
                input.print((int)(Math.random() * 100) + " "+"\n");
        }

    }
}