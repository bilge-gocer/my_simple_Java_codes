package bankProject;

public class Customer 
{
	private String name;
	private String accountNumber;
	private double initialBalance;
	private String address;
	private int custID;
	private Account acc;
	
	public Customer() 
	{
		initialBalance = 0.0;
	}

	public Customer(String name, String accountNumber) 
	{
		initialBalance  = 10.00;
		this.name = name;
		this.accountNumber = accountNumber;
	}

	public Customer(int custID, String name, String accountNumber, double initialBalance, String address) 
	{
		this.custID = custID;
		this.name = name;
		this.accountNumber = accountNumber;
		this.initialBalance = initialBalance;
		this.address = address;
		
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getInitialBalance() 
	{
		return initialBalance;
	}

	public void setInitialBalance(double initialBalance) 
	{
		this.initialBalance = initialBalance;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getAccountNumber() 
	{
		return accountNumber;
	}

	public Account getAcc() 
	{
		return acc;
	}

	@Override
	public String toString() 
	{
		return " Customer name=" + name + ", accountNumber=" + accountNumber + ", initialBalance=" + initialBalance
				+ ", address=" + address + ", custID=" + custID + ", acc=" + acc + ", getName()=" + getName()
				+ ", getInitialBalance()=" + getInitialBalance() + ", getAddress()=" + getAddress()
				+ ", getAccountNumber()=" + getAccountNumber() + ", getAcc()=" + getAcc() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
	

	
}//end of class
