import java.io.*;
import java.util.Scanner;

public class Copy{
    public static void main(String[] args) throws IOException {
        if(args.length!=2)
        {
            System.out.println("Usage: java copy SourceFile TargetFile");
            System.exit(1);
        }
        File SourceFile=new File(args[0]);
        File TargetFile=new File(args[1]);
        if(!SourceFile.exists())
        {
            System.out.println("SourceFile "+args[0]+" does not exists");
            System.exit(2);
        }
        if(TargetFile.exists())
        {
            System.out.println("TargetFile "+args[1]+" already exists");
            System.exit(3);
        }
        try(
                Scanner output=new Scanner(SourceFile);
                DataOutputStream input=new DataOutputStream(new FileOutputStream(TargetFile));
        )
        {
            while (output.hasNext())
                input.writeUTF(output.nextLine());
        }
    }
}