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
	
	public static int BubbleSort(int[] someArray)
	{
		
	}

}
