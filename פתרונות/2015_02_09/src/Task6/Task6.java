package Task6;

public class Task6
{
	public static double smallestDistance(double []arr)
	{
		double lowestDist = 0.0;
		
		for (int i = 0; i < arr.length - 1; i++)
		{
			double dist = Math.abs(arr[i] - arr[i + 1]);
			lowestDist = (i == 0) ? dist : Math.min(lowestDist, dist); 
		}
		
		return (lowestDist);
	}
	
	public static void main(String[] args)
	{
		double[] arr = {1.1, 2.5, 63.9, 1.12, 3.45, -4.4};
		
		System.out.println(smallestDistance(arr));
	}
}
