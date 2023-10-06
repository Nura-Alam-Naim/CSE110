import java.util.*;

class IceCream{
	private String IceType,IceCom;
	private double price;
	IceCream()
	{
		price=0;
	}
//	IceCream( String t, String c, double p)
//	{
//		IceType=t;
//		IceCom=c;
//		price=p;
//
//		price=0;
//	}

	public String display() {
		return "Ice-cream Type: "+getType()
				+" Ice-cream: "+getCom()
				+" Ice-cream price: "+getPrice();
	}
	public void setType(String t)
	{
		IceType=t;
	}
	public void setCom(String c)
	{
		IceCom=c;
	}
	public void setPrice(double p)
	{
		price=p;
	}
	public String getCom()
	{
		return IceCom;
	}
	public String getType()
	{
		return IceType;
	}
	public double getPrice()
	{
		return price;
	}
	public boolean checkPrice(IceCream I)
	{
		return I.getPrice() == getPrice();
	}
	public int compare(IceCream I)
	{
		if(getPrice()==I.getPrice())
			return 1;
		else if(getPrice()>I.getPrice())
			return 0;
		else
			return -1;
	}

}
public class TestIceCream {
	public static int ic;
	public static IceCream[] arr= new IceCream[10];
	public static void main(String[] args) {
		Scanner inp= new Scanner(System.in);
//	IceCream i1= new IceCream();
//		String type=inp.next();
//		String com=inp.next();
//		double price=inp.nextDouble();
		//inp.nextLine();
//
//		i1.IceType=type;
//		i1.IceCom=com;
//		i1.price=price;

//		i1.IceType=inp.next();
//		i1.IceCom=inp.next();
//		i1.price=inp.nextDouble();
		//inp.nextLine();
//		System.out.println(i1.Display());



//		IceCream i2=new IceCream("nai","nai",40);
//		System.out.println(i1.Display());
//		System.out.println(i2.Display());
//		IceCream i1= new IceCream();
//		//String type = inp.next();
//		i1.setType(inp.next());
//		i1.setCom(inp.next());
//		i1.setPrice(inp.nextDouble());
//		inp.nextLine();
//		IceCream i2=new IceCream();
//		i2.setType(inp.next());
//		i2.setCom(inp.next());
//		i2.setPrice(inp.nextDouble());
//		inp.nextLine();
//
//
//
//
//
//		System.out.println("IceCream type: "+i1.getType()+" IceCream Company: "+i1.getCom()+" Price: "+i1.getPrice());
//		System.out.println("IceCream type: "+i2.getType()+" IceCream Company: "+i2.getCom()+" Price: "+i2.getPrice());
//		System.out.println("Are the prices are same?"+i2.checkPrice(i1));
//		System.out.println(i1.getType()+" has higher price? "+i1.compare(i2));


		System.out.print("Enter number of quaries: ");
		ic= inp.nextInt();
		for(int i=0;i<ic;i++)
		{
			arr[i]=new IceCream();
			arr[i].setType(inp.next());
			arr[i].setCom(inp.next());
			arr[i].setPrice(inp.nextDouble());
			inp.nextLine();
		}
		System.out.print("Name of company: ");
		search(inp.next());
		//System.out.println("Details:");

	}
	public static void search(String comName)
	{
		for(int i=0;i<ic;i++)
		{
			if(arr[i].getCom().equals(comName)) {
				//break;
				System.out.println(arr[i].display());
			}
		}

	}

}
