import java.util.Scanner;

public class Decoder {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String s="";
		int t;
		int n=inp.nextInt();
		for(int i=0;i<n;i++)
		{
			t=inp.nextInt();
			s+=(char)t;
		}
		System.out.println(s);
	}
}
