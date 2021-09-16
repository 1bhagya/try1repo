package javaday2;

class Bank
{
	double interestRate;
	void setInterest()
	{
		interestRate=10.5;
	}
	void deposit()
	{
		System.out.println("Bank Accepts Deposit with Interest: "+interestRate);
	}
}

class SBI extends Bank
{
	void setInterest()
	{
		interestRate=7.5;
	}
}
class ICICI extends Bank
{
	double iciciPerLoanRate=13.99;
	void iciciPerLoanRate()
	{
		System.out.println("new interest"+iciciPerLoanRate);
	}
}

public class App 
{
	public static void main(String args[])
	{
		SBI sb = new SBI();
		sb.setInterest();
		sb.deposit();
		ICICI ic = new ICICI();
		ic.setInterest();
		ic.deposit();
		ic.iciciPerLoanRate();
	}
}