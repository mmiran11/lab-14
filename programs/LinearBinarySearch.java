package programs;

public class LinearBinarySearch {

	public static void main(String[] args) {
		

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
	}

}
