import java.io.*;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) throws IOException {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Source File with extension: ");
        String source=inp.nextLine();
        System.out.print("Enter Destination with extension: ");
        String target=inp.nextLine();

        File SourceFile=new File(source);
        File TargetFile=new File(target);
        if(!SourceFile.exists())
        {
            System.out.println("SourceFile "+source+" does not exists");
            System.exit(1);
        }
        if(TargetFile.exists())
        {
            System.out.println("TargetFile "+target+" already exists");
            System.exit(2);
        }
        try(
                Scanner output=new Scanner(SourceFile);
                DataOutputStream input=new DataOutputStream(new FileOutputStream(TargetFile));
        )
        {
            while (output.hasNext())
                input.writeUTF(output.next());

            System.out.println("Process Completed: Copied Successfully");
        }
    }
}