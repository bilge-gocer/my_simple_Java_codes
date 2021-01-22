package bankProject;

public class CreditAccount extends Account
{
	private double interestRate;

	public CreditAccount()
	{
		super();
		interestRate = 3.4;
	}
	
	public CreditAccount(String accountNumber, double balance)
	{
		super(accountNumber, balance);
		interestRate = 3.4;
	}
	
	public double getInterestRate() 
	{
		return interestRate;
	}

	public void setInterestRate(double interestRate) 
	{
		this.interestRate = interestRate;
	}

	public void displaybalance(double balance)
	{
		balance = balance + ((balance * interestRate)/100);
		System.out.println(balance);
	}

	public void overdraft()
	{
		//enter code here
	}

	public void withdrawCash()
	{
		//enter code here
	}
	
	public void depositCash()
	{
		//enter code here
	}
	
	@Override
	public String toString() 
	{
		return "CreditAccount [interestRate=" + interestRate + ", balance=" + balance + ", getCustomers()="
				+ getCustomers() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


}//end of class
