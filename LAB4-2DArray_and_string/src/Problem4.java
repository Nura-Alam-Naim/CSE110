import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int num = inp.nextInt();
        inp.nextLine();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = inp.nextLine();
        }
        for(int i=0;i<num-1;i++)
        {
            for(int j=i+1;j<num;j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.println("Lexicographical order of strings: ");
        for(int i=0;i<num;i++)
        {
            System.out.println(str[i]);
        }

    }
}
