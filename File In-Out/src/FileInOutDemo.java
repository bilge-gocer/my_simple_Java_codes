import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInOutDemo {
	String fileName = "FileInOut.csv";
	String [] store;
	File inputFile;
	File outPut;
	Scanner in;
	PrintWriter out;
	
	
	
	public FileInOutDemo () {
	
		inputFile = new File(fileName);
		outPut = new File("output.txt");
		
		try {
			out = new PrintWriter(outPut);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public FileInOutDemo (String fn) {
		fileName = fn;
		
	}
	
	
	public void initialiseFile() {
		
		try {
		in = new Scanner(inputFile);
		}
		catch (FileNotFoundException e) {
			
			System.out.println("File Not Found!");
			e.printStackTrace();
		}
	}
	
	
	public void processFile () throws FileNotFoundException {
		
		int highest = 0;
		String name = "";
		int numStudents = 0;
		int sum = 0;
		double average = 0;
		
		in.nextLine();
		
	
		
		while(in.hasNext()) {
			
			String input = in.nextLine();
			store = input.split(",");
			
			if(Integer.parseInt(store[1])>highest) {
			
				highest = Integer.parseInt(store[1]);
				name = store[0];
			}
			
			
		sum = sum + Integer.parseInt(store[1]);
		System.out.println(sum);
		numStudents++;
			
			
		}
		
		average = sum/numStudents;
		printOutput(name , highest , average);
		
	}
	
	
	public void printOutput (String s, int h , double ave) throws FileNotFoundException {
		
		
		
			out.write("The person with the highest grade is: " + s + " Score: "+ h +" The class average is: "+ave);
		
			closeFile();
	}
	
	public void closeFile() {
		out.flush();
		out.close();
		in.close();
	}
	
	
}
