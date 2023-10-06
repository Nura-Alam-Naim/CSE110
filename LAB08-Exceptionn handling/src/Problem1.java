import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String a=inp.next();
		String b=inp.next();
		try{
			int aa = Integer.parseInt(a);
			int bb = Integer.parseInt(b);
			Calculator abc = new Calculator(aa,bb);
			abc.Add();
			Calculator sub=new Calculator(aa,bb);
			sub.Substract();
			Calculator multi=new Calculator(aa,bb);
			multi.Multiply();
			Calculator div=new Calculator(aa,bb);
			div.Divide();

		}catch(NumberFormatException e){
			System.out.println(e+" Number must be Integer.");
		}
	}
}
class Calculator{
	private int a;
	private int b;
	public Calculator(int a, int b){this.a=a;this.b=b;}
	public void Add()
	{
		try{
			if(a>=0 && b>=0) System.out.println("Addition: "+(a+b));
			else throw new ArithmeticException();
		}catch (ArithmeticException e) {
			System.out.println(e+"Error: numbers must be positive");
		}
	}
	public void Substract()
	{
		int ans;
		try{
			if(a>=0 && b>=0) System.out.println("Subtraction: "+Math.abs(a-b));
			else throw new ArithmeticException();
		}catch (ArithmeticException e) {
			System.out.println(e+"Error: numbers must be positive");
		}
	}
	public void Multiply()
	{
		try{
			if(a!=0 && b!=0) System.out.println("Multiplication: "+a*b);
			else throw new ArithmeticException();
		}catch(ArithmeticException e){
			System.out.println(e+"Error: number cannot be zero");
		}
	}
	public void Divide()
	{
		try{
			if(a!=0 && b!=0) System.out.println("Division: "+((double)a/(double) b));
			else throw new ArithmeticException();
		}catch(ArithmeticException e){
			System.out.println(e+"Error: number cannot be zero");
		}
	}
}