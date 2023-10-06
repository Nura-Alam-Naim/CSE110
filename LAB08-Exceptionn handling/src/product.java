import java.util.Scanner;

public class product {
	public double weight;
	product(double weight) {
		this.weight=weight;
	}

	public static void main(String[] args) throws MyExpception {
		Scanner inp=new Scanner(System.in);
		product p1=new product(inp.nextDouble());
		p1.productCheck();

	}
	public void productCheck() throws MyExpception {
		try {
			if (weight < 100)
				throw new MyExpception("Product is invalid");
			else System.out.println("Weight"+weight);;
		}catch (MyExpception e)
		{
			System.out.println(e);
		}
	}
}
class MyExpception extends Exception{
	public MyExpception(String str)
	{
		super(str);
	}
}



