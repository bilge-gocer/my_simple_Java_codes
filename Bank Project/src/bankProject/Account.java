package bankProject;
import java.util.*;

public abstract class Account 
{
	private String accountName;
	private String accountNumber;
	private ArrayList<Customer>customers;
	double balance;
	
	public Account() 
	{
		this.accountNumber  = "unknown";
		this.balance = 0.0;
	}
	
	public Account(String accountNumber, double balance) 
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public Account(String accountName, String accountNumber, ArrayList<Customer> customers, double balance) 
	{
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.customers = customers;
		this.balance = balance;
	}

	public ArrayList<Customer> getCustomers() 
	{
		return customers;
	}

	public abstract void overdraft();
	public abstract void withdrawCash();
	public abstract void depositCash();
	
}//end of class
