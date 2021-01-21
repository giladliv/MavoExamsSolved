package Task3;

public class Task3
{
	public static void switchDiags(int[][] arr)
	{
		int len = arr.length;
		int temp = 0;
		
		for (int i = 0; i < len; i++)
		{
			int j = len - 1 - i;
			if (i != j)
			{
				temp = arr[i][i];
				arr[i][i] = arr[i][j];
				arr[i][j] = temp;
			}
		}
	}
	
	public static void print(int arr[][])
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
		switchDiags(a);
		print(a);
		
		
	}
}
