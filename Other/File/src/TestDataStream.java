import java.io.*;

public class TestDataStream {
    public static void main(String[] args) throws IOException {
        try(DataOutputStream output=new DataOutputStream(new FileOutputStream(new File("name.txt"),true)))
        {
            output.writeUTF("John");
            output.writeDouble(45.5);
            output.writeUTF("Susan");
            output.writeDouble(154.5);
            output.writeUTF("Kim");
            output.writeDouble(105.25);
        }
        try(DataInputStream input=new DataInputStream(new FileInputStream("name.txt")))
        {
            while (true)
                System.out.println(input.readUTF()+" "+input.readDouble());
        }
        catch (EOFException e)
        {

        }
    }
}
