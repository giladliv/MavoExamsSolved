package Task2;

public class Task2
{
	public static boolean sameNumbers(int[][]mat)
	{
		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat.length; j++)
			{
				int iNew = i - 1;
				int jNew = j - 1;
				if (0 <= iNew && iNew < mat.length && 0 <= jNew && jNew < mat.length)
				{
					if (mat[iNew][jNew] != mat[i][j])
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
		int[][] mat = {{1,2,3,4}, {5, 1, 2, 3}, {6,5,1,2}, {7,6,5,1}};
		int[][] mat2 = {{1,2,3,4}, {5, 1, 2, 3}, {6,5,1,2}, {7,8,5,1}};
		
		System.out.println(sameNumbers(mat));
		System.out.println(sameNumbers(mat2));
	}
}
