import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DemoCode {

	public static File fileName;
	public static Scanner input;
	public static String[][] Marks = new String[10][4];
	public static String[] firstNames = new String[10];
	public static String [] secondNames = new String [10];
	public static int[] halfTermMarks = new int[10]; //1D Arrays to store individual data

	
	public static void main(String[] args) throws FileNotFoundException {
		
		

		
		String nameOfFile = "src//studentMarks.txt";
		fileName = new File(nameOfFile);
		input = new Scanner(fileName);
		while (input.hasNextLine()) {
			for (int i = 0; i < Marks.length; i++) { 
				String[] line = input.nextLine().split(" "); 
				for (int j = 0; j < line.length; j++) 
				{
					Marks[i][j] = line[j];                
					}            
				}        
			}
		
		System.out.println("Students Grades: " + "\n" + Arrays.deepToString(Marks)+"\n");
		for (int i = 0; i < halfTermMarks.length; i++) {
			halfTermMarks[i] = Integer.parseInt(Marks[i][2]);
			secondNames[i] = Marks[i][1];
			firstNames[i] = Marks[i][0];        
			}
		System.out.println("First Names are: " + Arrays.toString(firstNames)+"\n");
		System.out.println("Second Names are: " + Arrays.toString(secondNames)+"\n");
		System.out.println("Course Grades are: " + Arrays.toString(halfTermMarks)); 
		
	}
		
}

