package BankPack;

public class InheritanceDemo {

	public static void main(String[] args) 
	{
		NRIAccount obj1 = new NRIAccount();
		obj1.depositMoney(1000.0);
		obj1.withdrawMoney(500.0);
		obj1.applyFixedDeposit();
		SeniorCitizen obj2 = new SeniorCitizen();
		obj2.depositMoney(2000.0);
		obj2.withdrawMoney(1000.);
		obj2.applyFixedDeposit();
	}

}
