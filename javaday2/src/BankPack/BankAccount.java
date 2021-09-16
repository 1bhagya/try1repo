package BankPack;

public class BankAccount 
{
	double withdrawAmount,depositAmount,balance;
	double interestRate=9.5;
	
	void depositMoney(double dep)
	{
		this.depositAmount=dep;
		System.out.println("Deposit Amount is:"+depositAmount);
	}
	void withdrawMoney(double wit)
	{
		this.withdrawAmount=wit;
		System.out.println("Withdrawal Amount is:"+withdrawAmount);
		balance=depositAmount-withdrawAmount;
		System.out.println("Balance After withdrawal is"+balance);
	}
}
