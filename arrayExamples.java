
public class MainArrayClass {

	private int [] marks = {70, 75 ,70 ,96 , 70};
	private String [] names = {"Bilge", "Gokhan", "Kuniko", "Shuichi"};
	private int max;
	private int min;
	private int total=0;
	private double average;
	
	
	public static void main(String[] args) {
		
		MainArrayClass m = new MainArrayClass();
		m.arrayOne();
		//m.findMax();
		//m.findMin();
		//m.findAverage();
		//m.findEven();
		//m.findOdd();
		//m.countOccurrences();
	}
	
	//method prints names 
	public void arrayOne()
	{
		for (int i = 0; i < names.length; i++)
		{
			System.out.println(names[i]);
		}
	}
	
	// method finds maximum
	public void findMax()
	{
		max = marks[0];
		for (int i = 0 ; i < marks.length ; i++)
		{
			if (max < marks[i])
			{
				max = marks[i];
			}
		}
		System.out.println(max);
		
	} 
	
	// method finds minimum 
	public void findMin()
	{
		min = marks[0];
		for (int i = 0 ; i < marks.length ; i++)
		{
			if (min > marks[i])
			{
				min = marks[i];
			}
		}
		System.out.println(min);
		
	} 
	
	// method finds average
	public void findAverage()
	{
		for (int i = 0;i<marks.length; i++ )
		{
			total = total + marks[i];
		}
		
		average = total/marks.length;
		System.out.println(average);
		
		
		
	} 
	
	// method finds even numbers
	public void findEven()
	{
		for (int i = 0 ; i < marks.length ; i++)
		{
			if (marks [i] %2 == 0)
			{
				
				System.out.println(marks[i]);
			}
		}
		
		
	} 
	
	
	// method finds odd numbers
	public void findOdd()
	{
		for (int i = 0; i < marks.length; i++)
		{
			if (marks[i] %2!=0)
			{
				System.out.println(marks[i]);
			}
		}
	} 
	
	// method finds occurrence
	public void countOccurrences()
	{
		int count = 0;
		int mark = 70;
		for (int i =0; i<marks.length; i++)
		{
			if (mark == marks[i])
			{
				count = count+1;
			}
		}
		System.out.println(count);
	}
	
} // end of class
