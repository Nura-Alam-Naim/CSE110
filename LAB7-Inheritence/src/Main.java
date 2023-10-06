import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Account{
	private int id=0;
	private double balance =0.0;
	private double annualInterestRate=0.0;
	private Calendar date_Created=Calendar.getInstance();
	Account(){}
	Account(int id, double balance,double annualInterestRate)
	{
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
		date_Created= Calendar.getInstance();
	}
	public void setId(int id) { this.id=id;}
	public void setBalance(double balance){this.balance=balance;}
	public void setAnnualInterestRate(double annualInterestRate){this.annualInterestRate=annualInterestRate;}
	public int getId(){return id;}
	public double getBalance(){return balance;}
	public double getAnnualInterestRate(){return annualInterestRate;}
	public double getMonthlyInterestRate(){return (annualInterestRate/12)*100f;}
	public Date dateCreated(){return date_Created.getTime();}
	public double getMonthlyInterestAmount(){return (balance*getMonthlyInterestRate());}
	public void withdraw(double amount)
	{
		if(amount<=balance) balance-=amount;
		else
			System.out.println("Balance Insufficient");
	}
	public void deposit(double amount)
	{
		balance+=amount;
	}
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Date created: "+date_Created.getTime());
		System.out.println("Balance: "+balance);
		System.out.println("Annual Interest Rate: "+annualInterestRate);
		System.out.println("Monthly Interest Rate: "+getMonthlyInterestRate());
		System.out.println("Monthly Interest amount: "+getMonthlyInterestAmount());


	}
}
class CheckingAccount extends Account{
	private double overdraft;
	CheckingAccount(int id, double bal, double ir, double over)
	{
		super.setId(id);
		super.setBalance(bal);
		super.setAnnualInterestRate(ir);
		this.overdraft=over;
	}
	public void setOverDraft(double draft){this.overdraft=draft;}
	public void deposit(double amount)
	{
		setBalance(amount);
		System.out.println("DEPOSIT successful");
	}
	public void withdraw(double balance)
	{
		if(balance<=overdraft && balance<=super.getBalance())
		{
			overdraft -= balance;
			super.setBalance(super.getBalance()-balance);
			System.out.println("Withdraw successful");
		}
		else
			System.out.println("Limit Exceed");
	}
	public void display()
	{
		System.out.println("This is Checking Account");
		System.out.println("Id: "+getId());
		System.out.println("Date created: "+dateCreated());
		System.out.println("Current Balance: "+getBalance());
		System.out.println("Annual Interest Rate: "+(float)getAnnualInterestRate()+"%");
		System.out.println("Monthly Interest Rate: "+(float)getMonthlyInterestRate()+"%");
		System.out.println("Monthly Interest Amount: "+(float)getMonthlyInterestAmount());
		System.out.println("Overdraft Limit: "+overdraft);
	}
	public void setOverdraft(double overdraft){this.overdraft=overdraft;}
}
class SavingsAccount extends Account{
	private final long card;
	private Calendar expireDate;
	SavingsAccount(int id, double bal, double ir, long cid, int dd, int mm, int yy) {
		super.setId(id);
		super.setBalance(bal);
		super.setAnnualInterestRate(ir);
		this.card = cid;
		this.expireDate = Calendar.getInstance();
		this.expireDate.set(Calendar.DATE, dd);
		this.expireDate.set(Calendar.MONTH, mm-1);
		this.expireDate.set(Calendar.YEAR, yy);
	}

	private final double creditBalance=3*super.getBalance();
	public void setExpireDate(int dd,int mm,int yy)
	{
		this.expireDate = Calendar.getInstance();
		this.expireDate.set(Calendar.DATE, dd);
		this.expireDate.set(Calendar.MONTH, mm-1);
		this.expireDate.set(Calendar.YEAR, yy);
	}
	public void deposit(double amount)
	{
		setBalance(amount);
		System.out.println("DEPOSIT successful");
	}
	public void withdraw(double amount)
	{
		Calendar date=Calendar.getInstance();
		if(expireDate.compareTo(date) > 0 && amount<=super.getBalance())
		{
			super.setBalance(super.getBalance()-amount);
			System.out.println("Withdraw successful");
		}
		else
			System.out.println("Unsuccessful Attempt");
	}
	public void display() {
		System.out.println("This is Saving Account ");
		System.out.println("Id: " + getId());
		System.out.println("Date created: " + dateCreated());
		System.out.println("Balance: " + getBalance());
		System.out.println("Annual Interest Rate: " + (float)getAnnualInterestRate()+"%");
		System.out.println("Monthly Interest Rate: " + (float) getMonthlyInterestRate()+"%");
		System.out.println("Monthly Interest Amount: " + (float)getMonthlyInterestAmount());
		System.out.println("Credit Card Number: " + card);
		System.out.println("Card Expire Date: " + expireDate.get(Calendar.DATE) + "-" + (expireDate.get(Calendar.MONTH) + 1) + "-" + expireDate.get(Calendar.YEAR));
		System.out.println("Credit Balance: " + 3*super.getBalance());
	}


}
public class Main {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
//		Account acc=new Account(1122,20000,4.5);
//		acc.display();
//		acc.withdraw(2500);
//		acc.deposit(3000);
//		System.out.println("Updated: ");
//		acc.display();

		ArrayList<Account> Accounts1=new ArrayList<Account>();
		Account c = new CheckingAccount(12345, 1000000, 1.3, 50000);
		Accounts1.add(c);
		ArrayList<Account> Accounts2=new ArrayList<Account>();
		Account s = new SavingsAccount(123, 200000, 4.2, 23454524, 12, 12, 2025);
		Accounts2.add(s);

		boolean ret=true;
		while(ret)
		{
			System.out.println("Press (1) for creating a Checking Account");
			System.out.println("Press (2) for creating a Saving Account");
			System.out.println("Press (3) for printing Checking Accounts");
			System.out.println("Press (4) for printing Saving Accounts");
			System.out.println("Press (5) for WITHDRAW from Checking Accounts");
			System.out.println("Press (6) for WITHDRAW from Saving Accounts");
			System.out.println("Press (7) for DEPOSIT from Checking Accounts");
			System.out.println("Press (8) for DEPOSIT from Saving Accounts");

			System.out.print("Press any key to EXIT: ");
			int i=inp.nextInt();
			switch (i) {
				case (1) -> {
					System.out.println("This is a Checking Account");
					System.out.print("Account Id: ");
					int id = inp.nextInt();
					System.out.print("Balance: ");
					double bal = inp.nextDouble();
					System.out.print("Annual Interest Rate: ");
					double ir = inp.nextDouble();
					System.out.print("Overdraft Limit: ");
					double li = inp.nextDouble();
					Account c1 = new CheckingAccount(id, bal, ir, li);
					Accounts1.add(c1);
				}
				case (2) -> {
					System.out.println("This is a Saving Account");
					System.out.print("Account Id: ");
					int id = inp.nextInt();
					System.out.print("Balance: ");
					double bal = inp.nextDouble();
					System.out.print("Annual Interest Rate: ");
					double ir = inp.nextDouble();
					System.out.print("Credit Card Id: ");
					long cid = inp.nextLong();
					System.out.print("Expire day: ");
					int dd = inp.nextInt();
					System.out.print("Expire month: ");
					int mm = inp.nextInt();
					System.out.print("Expire year: ");
					int yy = inp.nextInt();
					Account s1 = new SavingsAccount(id, bal, ir, cid, dd, mm, yy);
					Accounts2.add(s1);
				}
				case (3) -> {
					for (Account account : Accounts1) account.display();
				}
				case (4) -> {
					for (Account account : Accounts2) account.display();
				}
				case(5)-> {
					System.out.print("Enter Account ID: ");
					int ii=inp.nextInt();
					for(int p=0;p<Accounts1.size();p++)
					{
						if(ii==Accounts1.get(p).getId())
						{
							System.out.print("Enter Amount: ");
							double aa=inp.nextInt();
							Accounts1.get(p).withdraw(aa);
							break;
						}
					}
				}
				case(6) ->
				{
					System.out.print("Enter Account ID: ");
					int oo=inp.nextInt();
					for(int p=0;p<Accounts2.size();p++)
					{
						if(oo==Accounts2.get(p).getId())
						{
							System.out.print("Enter Amount: ");
							double bb=inp.nextInt();
							Accounts1.get(p).withdraw(bb);
							break;
						}
					}
				}
				case(7)-> {
					System.out.print("Enter Account ID: ");
					int ii=inp.nextInt();
					for(int p=0;p<Accounts1.size();p++)
					{
						if(ii==Accounts1.get(p).getId())
						{
							System.out.print("Enter Amount: ");
							double aa=inp.nextInt();
							Accounts1.get(p).deposit(aa);
							break;
						}
					}
				}
				case(8) ->
				{
					System.out.print("Enter Account ID: ");
					int oo=inp.nextInt();
					for(int p=0;p<Accounts2.size();p++)
					{
						if(oo==Accounts1.get(p).getId())
						{
							System.out.print("Enter Amount: ");
							double aa=inp.nextInt();
							Accounts1.get(p).deposit(aa);
							break;
						}
					}
				}
				default -> {
					ret = false;
				}
			}
		}
	}
}