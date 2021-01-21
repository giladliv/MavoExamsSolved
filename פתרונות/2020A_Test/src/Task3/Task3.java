package Task3;

public class Task3
{
	
	public static void spiral(int[][] a)
	{
		int len = a.length;
		
		for (int offset = 0; offset < len / 2 + 1; offset++)
		{
			for (int i = offset; i < len - offset; i++)
			{
				System.out.print(a[offset][i] + " ");
			}
			for (int i = offset + 1; i < len - offset; i++)
			{
				System.out.print(a[i][len - offset - 1] + " ");
			}
			
			for (int i = offset + 1; i < len - offset; i++)
			{
				System.out.print(a[len - offset - 1][len - 1 - i] + " ");
			}
			
			for (int i = offset + 1; i < len - offset - 1; i++)
			{
				System.out.print(a[len - 1 - i][offset] + " ");
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[][] a = {{1,2,3,4}, {12,13,14,5}, {11,16,15,6}, {10,9,8,7} };
		int[][] b = { {1,2,3,4,5}, {16,17,18,19,6}, {15,24,25,20,7}, {14,23,22,21,8}, {13,12,11,10,9} };
		spiral(a);
		System.out.println();
		spiral(b);
	}
}
