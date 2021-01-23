package Task2;

import java.util.Arrays;

public class Task2
{
	public static void transpose(int[][]mat)
	{
		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0 + i; j < mat.length; j++)
			{
				if (i != j)
				{
					int temp = mat[i][j];
					mat[i][j] = mat[j][i];
					mat[j][i] = temp;
				}
			}		
		}
	}
	
	public static void main(String[] args)
	{
		int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};

		transpose(mat);
		
		String str = Arrays.deepToString(mat);
		System.out.println(str);
	}
}
