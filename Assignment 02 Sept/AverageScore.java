public class AverageScore{
	
	static double getAverageScore(int a[])
	{
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++)
			sum += a[i];
	
		return (double)sum / a.length;
	}
	

	public static void main (String[] args)
	{
		
		int arr[] = {76, 82, 69, 43, 31};
	
		System.out.println("Average of scores " + getAverageScore(arr));
		System.out.println("Percentage of scores " +getAverageScore(arr));
	}
}
