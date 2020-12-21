import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraysV2
{
    public static void main(String[] args) throws FileNotFoundException
    {
        int rows = 6, columns = 5;
        String[][] sales = new String[rows][columns];
        System.out.println("Here are the sales figures: ");
        String nameOfFile = "src//Sales.txt";
        File fileName = new File(nameOfFile);
        Scanner sc = new Scanner(fileName);

       while (sc.hasNext())
        {
            System.out.println("Length of Array= "+sales.length);
            for (int i = 0; i < sales.length; i++)//reading rows
            {
               // String[] line = sc.nextLine().trim().split(",");
                String[] line = sc.nextLine().split(",");
                for (int j = 0; j < line.length; j++)//reading columns
                {
                    sales[i][j] = line[j];
                }
            }
        }
        System.out.println(Arrays.deepToString(sales).replace("], ", "]\n").replace("[[", "[")
                .replace("]]", "]"));

        
        
        for (int i=0;i<sales.length;i++)
        {
            System.out.print("Year: "+ sales[i][0]+"\n");
            System.out.print("Sales (per Quarter):\t");
            for(int j=0;j<sales[i].length;j++)
            {

                if(j==0 &&j%5==0)//Insures a new line for every Year
                {
                    System.out.print("");
                }
                else
                {
                    System.out.print("\t"+sales[i][j]+"\t");
                }
            }
            System.out.println("\n========================================================================");
        }
        int[]years = new int[sales.length];//size of array=number of rows
        double[] yearsDouble= oneDimArrayGenerator(sales,0);
        //for loop to convert the double values to int.
        for(int i=0;i<yearsDouble.length;i++)
        {
            years[i]=(int)yearsDouble[i];
        }

        double [] firstQuarter= oneDimArrayGenerator(sales,1);
        double [] secondQuarter= oneDimArrayGenerator(sales,2);
        double [] thirdQuarter= oneDimArrayGenerator(sales,3);
        double [] fourthQuarter= oneDimArrayGenerator(sales,4);

        String statement="Sales per Quarter for all years";
        System.out.println("Account Years-> "+Arrays.toString(years));
        System.out.println(statement+Arrays.toString(firstQuarter));
        System.out.println(statement+Arrays.toString(secondQuarter));
        System.out.println(statement+Arrays.toString(thirdQuarter));
        System.out.println(statement+Arrays.toString(fourthQuarter));
        System.out.println("\n=============== Sales per quarter sorted from smallest to largest ==============");
        
        double largetSale;
        largetSale= sorter(firstQuarter,"First Quarter");
        System.out.print("\t Maximum Sale="+largetSale+"\n");
        largetSale=sorter(secondQuarter,"Second Quarter");
        System.out.print("\t Maximum Sale="+largetSale+"\n");
        largetSale=sorter(thirdQuarter,"Third Quarter");
        System.out.print("\t Maximum Sale="+largetSale+"\n");
        largetSale=sorter(fourthQuarter,"Fourth Quarter");
        System.out.print("\t Maximum Sale="+largetSale+"\n");
    }

    private static double[] oneDimArrayGenerator(String[][] sales, int index) //returns a 1-D array from a 2-D array
    {
        double [] myArray=new double[sales.length];
        for (int i=0; i<sales.length;i++)
        {
            myArray[i]=Double.parseDouble(sales[i][index]);
        }
        return myArray;
    }

    //sorts 1-D array from smallest to largest, it returns the largest number in an Array
    public static double sorter(double salesPerquarter[], String quarter)
    {
        int n = salesPerquarter.length;

        // One by one move boundary of unsorted sub array
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int minimum = i;
            for (int j = i+1; j < n; j++)
                if (salesPerquarter[j] < salesPerquarter[minimum])
                    minimum = j;

            // Swap the found minimum element with the first element
            int temp = (int)salesPerquarter[minimum];
            salesPerquarter[minimum] = salesPerquarter[i];
            salesPerquarter[i] = temp;

            //Having sorted the Array, the largest sale is the last element of the array salesQuarter

        }
        double largestSale=salesPerquarter[salesPerquarter.length-1];
        System.out.print(quarter+" (Sorted) "+ Arrays.toString(salesPerquarter));
        return largestSale;
    }
    
}
