package bankProject;
import java.util.*;

public class Bank 
{
	 private ArrayList<Customer> customers;
     private ArrayList<Account> Account;
     private String name;
 	String accNumber;
 	Double balance;
 	String address;
 	String temp;
	
	public Bank()
	{
		customers = new ArrayList<Customer>();
	}
	   
	public ArrayList<Customer> getCustomers() 
	{
		return customers;
	}

	public ArrayList<Account> getAccount() 
	{
		return Account;
	}
	
    public void addCustomer(String nm, String accNumber, double balance, String address)
    {
    	//System.out.println(getCustomers());
        int custID = customers.size() + 1;
        customers.add(new Customer (custID, nm, accNumber, balance, address));
     
    }

	@Override
	public String toString() 
	{
		return "Bank [customers=" + customers + ", Account=" + Account + ", name=" + name + ", accNumber=" + accNumber
				+ ", balance=" + balance + ", address=" + address + ", temp=" + temp + ", getCustomers()="
				+ getCustomers() + ", getAccount()=" + getAccount() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	

}//end of class
