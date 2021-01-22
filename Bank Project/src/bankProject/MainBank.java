package bankProject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;



public class MainBank 
{	
		private static Bank bank;
		private static MainBank m;

	    private ArrayList arr = new ArrayList();
	 	private String name;
	 	private String accNumber;
	 	private Double balance;
	 	private String address;
	 	private String temp;
		
		public static void main(String[] args) throws IOException
		{
			bank = new Bank();
			m = new MainBank();
			m.testingBank1();	
			m.testingBank2();
			m.testingBank3();
		}

		//test harness 1	
		public void testingBank1()
		{

			//Adding customers to the bank
	       bank.addCustomer("Nicola Clark", "12345", 440.00, "East Kilbride");
	       bank.addCustomer("Bobby Clark", "32145", 240.00, "East Kilbride");
	       bank.addCustomer("Tommy Clark", "6543", 440.00, "Glasgow");
	       bank.addCustomer("Molly Ringwald", "7575", 140.00, "Paisley");  
	       System.out.println(bank.getCustomers());
		}
		
		public void testingBank2()
		{
			Customer c1 = new Customer();
			Account a1 = new DepositAccount();
			Account a2 = new CreditAccount();	
			Customer c2 = new Customer("Adam Smith","1234");
			Customer c3 = new Customer("Judy Forest","4321");
			Customer c4 = new Customer("Brithney Robin","7237");
			Customer c5 = new Customer("James Robin","6321");
			
			System.out.println("Customer number "+ c5.getInitialBalance ());
			System.out.println("Account Type "+ c5.getName());
			System.out.println("Customer number "+ c3.getInitialBalance ());
		}
		
		public void testingBank3() throws IOException
		{
			m.readInCustomer();
			m.createCustomer();
			m.writeCustomer();
		}
		
		public void  readInCustomer() throws IOException
		{					
			FileReader freader = new FileReader("src/bankProject/CustomerDB.txt");
			BufferedReader br = new BufferedReader(freader);

			while((temp = br.readLine()) != null) 
			{	
				arr.add(temp);			
			}
			
			System.out.println(arr);
			freader.close();
		}
		
		public void createCustomer() 
		{
			for(int i =0; i<arr.size(); i=i+4)
			{
				  name = arr.get(0).toString();
				  accNumber  = 	arr.get(1).toString();
				  balance = Double.parseDouble(arr.get(2).toString());
				  address = arr.get(3).toString();
				  bank.addCustomer(name, accNumber, balance, address);			  
			}	
			
		}
		
		public  void writeCustomer() throws IOException 
		{
			arr.add("This a new File");
			
			FileWriter writer = new FileWriter("output2.txt");	    
			for(int i =0; i<arr.size(); i++) 
			{
				String str = arr.get(i).toString();
				writer.write(str);
				if(i < arr.size()-1)//This prevent creating a blank like at the end of the file**
	            writer.write("\n");
			}
				writer.close();
		}
		
		
}//end of class
