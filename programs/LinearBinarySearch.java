package programs;

public class LinearBinarySearch {

	public static void main(String[] args) {
		

	}
	
	public static void LinearSearch(int[] someArray, int target)
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

}
