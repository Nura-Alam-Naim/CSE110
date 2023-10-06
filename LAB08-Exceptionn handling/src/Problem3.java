import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int a[]=new int[100];
		for(int i=0;i<100;i++)
			a[i]=(int)(Math.random()*100);
		int indx=inp.nextInt();
		try{
			System.out.println(a[indx]);
		}catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Out of Bounds");
		}
	}
}
