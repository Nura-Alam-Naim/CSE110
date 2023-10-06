import java.io.*;
public class Problem2 {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream input = new DataOutputStream(new FileOutputStream("Lab08_02.dat", true));)
        {
            for (int i = 0; i < 100; i++)
                input.writeInt((int)(Math.random() * 10000));
        }
    }
}
