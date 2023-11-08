import java.util.Scanner;

public class Encoder {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String s=inp.nextLine();
		for(int i=0;i<s.length();i++) System.out.println((int)s.charAt(i)+" ");
	}
}
