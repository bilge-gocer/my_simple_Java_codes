package bankProject;

public class DepositAccount extends Account 
{
	private double interestRate;
	
	public DepositAccount()
	{
		super();
		interestRate = 2.5;
	}
		
    public DepositAccount(String accountNumber,double balance)
    {
		super(accountNumber, balance);
		interestRate = 3.4;
    }
	
    public void diplaybalance(double balance)
    {
    	balance = balance + ((balance * interestRate)/100);
    	System.out.println(balance);
    }
    
    
    public double getInterestRate() 
    {
		return interestRate;
	}

	public void setInterestRate(double interestRate) 
	{
		this.interestRate = interestRate;
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
		return "DepositAccount [interestRate=" + interestRate + ", balance=" + balance + ", getInterestRate()="
				+ getInterestRate() + ", getCustomers()=" + getCustomers() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
    

}//end of class
