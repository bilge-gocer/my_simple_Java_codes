import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantsWriter

{
	public static void main(String[] args) throws IOException    
	{        
		File myFile=new File("src//Restaurants.txt");
		FileReader myFileReader=new FileReader(myFile);
		//create a BufferedReader object to read a stream of characters from the specified 
		BufferedReader input=new BufferedReader(myFileReader);
		ArrayList<String> restaurants=new ArrayList<String>();
		//create a String and assign it to the first line of the file
		String line;
		while ((line=input.readLine())!=null)       
		{            
			restaurants.add(line);
			} 
		input.close();
		menu(restaurants);
		}
	//main()
	public static void menu(ArrayList<String> restaurants) throws IOException  
	{        
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while (choice!=20) 
		{        
			System.out.println("\n**************MENU**************");   
			System.out.println("1-  List all restaurants. ");     
			System.out.println("2-  Add a new restaurant");       
			System.out.println("3-  Remove a restaurant");  
			System.out.println("4-  Exit ");         
			System.out.print("\nPlease choose an option from the above:");   
			
			choice = sc.nextInt();
			
			if (choice == 1)  
			{
				for (int i = 0; i < restaurants.size(); i++)
                { 
					System.out.println(restaurants.get(i));   
					}       
				} 
			else if (choice == 2)            
			{    
				String nameOfRestaurant; 
				String addressOfRestaurant; 
				sc.nextLine();      
				System.out.println("Adding a restaurant");     
				System.out.print("Please add the name of the restaurant: "); 
				nameOfRestaurant = sc.nextLine();   
				System.out.print("Please add the address of the restaurant: ");  
				addressOfRestaurant = sc.nextLine();     
				String newRestaurant=nameOfRestaurant+", "+addressOfRestaurant;  
				restaurants.add(newRestaurant);
				}
			else if (choice == 3)            
				{
					System.out.println("Removing a restaurant");    
					String nameOfRestaurant;              
					sc.nextLine();                
					System.out.print("Please enter the name of the restaurant: ");   
					nameOfRestaurant=sc.nextLine();
					int i;
					for(i=0;i<restaurants.size();i++)  
					{
						if(restaurants.get(i).toLowerCase().contains(nameOfRestaurant.toLowerCase()))  
						{
							break;                   
							}                
						}              
					System.out.println(restaurants.get(i)+" is now removed"); 
					restaurants.remove(i);       
					}
					else if (choice == 4)            
					{ 
						System.out.println("Exiting the program");
						writeFile(restaurants);  
						} 
			}
    }
	public static void writeFile(ArrayList<String> restaurants) throws IOException   
	{     
		FileWriter write=new FileWriter("src//output.txt");
		BufferedWriter bw=new BufferedWriter(write);   
		PrintWriter outFile=new PrintWriter(bw);
		for(int i=0;i<restaurants.size();i++)
		{ 
			outFile.println(restaurants.get(i).toString());  
			}  
		outFile.close();  
		System.exit(0);   
		}
	}
