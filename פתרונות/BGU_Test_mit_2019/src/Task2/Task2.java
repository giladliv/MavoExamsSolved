package Task2;

public class Task2
{
	public static int NonCalcSumDiag(int[][] arr)
	{
		int count = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			count += arr[i][i];
		}
		
		return (count);
	}
	
	
	
	
	
	private static int recursiveAdder(int i, int[][] arr)
	{
		if (i == arr.length)
		{
			return (0);
		}
			
		return (arr[i][i] + recursiveAdder(i + 1, arr));
	}
	
	public static int calcSumDiag(int[][] arr)
	{
		return (recursiveAdder(0, arr));
	}
	
	public static void main(String[] args)
	{
		int[][] a = {{1,2,3}, {4,5,6}, {-1,-1,-2}};
		
		System.out.println(calcSumDiag(a));
	}
}
