package programs;

import java.util.Scanner;
public class LinearBinarySearch {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//part 1
		int[] myArray = new int [5];
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.print ("Enter a number: ");
			myArray[i] = scan.nextInt();
		}
		
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.print (myAray[i] + " | ");
		}
		
		System.out.println();
		int compCount = LinearSearch(myArray, 5);
		System.out.println("Found 5 after"  + compCount + " comparisons");
		int binCompCount5 = BinarySearch(myArray, 5);
		System.out.println("Found 1 after " + binCompCount5 + " comparisons");
	}
	
	public static int LinearSearch(int[] someArray, int target)
	{
		int comparisons = 0;
		for(int i = 0; i < someArray.length; i++) 
		{
			comparisons++;
			if(someArray[i] == target)
			{
				return comparisons;
			}
		}
	}
	
	public static int BinarySearch(int[] someArray, int target)
	{
		int comparisons = 0;
		int highIndex = someArray.length;
		int lowIndex = 0;
		int midIndex = (highIndex + lowIndex) / 2;
		boolean found = false; 
		while (!found) 
		{
			comparisons++;
			if(someArray[midIndex] == target)
			{
				found = true;
			}
			else if (someArray[midIndex] > target)
			{
				highIndex = midIndex;
				
			}
			else if (someArray[midIndex] < target) 
			{
				lowIndex = midIndex;
			}
			midIndex = (highIndex + lowIndex / 2);
		}
		return comparisons;
	}
	
	public static int BubbleSort(int[] someArray) //for exercise 2
	{
		for(int i = 0; i < someArray.length; i++)
		{
			int comparisons = 0;
			int swaps = 0;
			for(int i = 0; i < someArray.length - 1; i++)
			{
				if(someArray[i] > someArray[i + 1])
				{
					int temp = someArray[i + 1];
					someArray[i] = someArray[i + 1];
					someArray[i  + 1] = temp;
					swaps++;
				}
				comparisons++;
			}
		}
		return swaps;
	}

}
