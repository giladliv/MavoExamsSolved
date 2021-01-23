package Task2;

public class Task2
{
	public static boolean absoluteSorted(int[][] mat)
	{
		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat[i].length; j++)
			{
				int iNew = i + 1;
				int jNew = j + 1;
				if (0 <= iNew && iNew < mat.length && 0 <= jNew && jNew < mat[i].length)
				{
					if (mat[i][j] > mat[iNew][j] ||mat[i][j] > mat[i][jNew])
					{
						return (false);
					}
				}
			}
		}
		
		return (true);
	}
	
	public static void main(String[] args)
	{
		int[][] mat = {{-5, 0, 5}, {-2, 9, 12}, {9, 10, 20}, {41, 55, 101}};
		int[][] mat2 = {{1, 3, 7}, {0, 5, 4}, {8, 2, 6}};
		
		System.out.println(absoluteSorted(mat));
		System.out.println(absoluteSorted(mat2));
	}
}
