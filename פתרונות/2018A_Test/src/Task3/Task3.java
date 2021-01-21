package Task3;

import java.util.Arrays;

public class Task3
{
	static private boolean symAxisX(int[][] a, int[][] b)
	{
		if (a.length != b.length)
		{
			return (false);
		}
		
		int len = a.length;
		for (int i = 0; i < len; i++)
		{
			if (!Arrays.equals(a[i], b[len - 1 - i]))
			{
				return (false);
			}
		}
		return (true);
		
	}
	
	static private boolean symAxisY(int[][] a, int[][] b)
	{
		if (a.length != b.length)
		{
			return (false);
		}
		
		int len = a.length;
		for (int i = 0; i < len; i++)
		{
			if (a[i].length != b[i].length)
			{
				return (false);
			}
			int lenIn = a[i].length;
			for (int j = 0; j < a[i].length; j++)
			{
				if (a[i][j] != b[i][lenIn - 1 - j])
				{
					return (false);
				}
			}
		}
		return (true);
	}
	
	static public boolean symmetric(int[][] a, int[][] b)
	{
		return (symAxisX(a, b) || symAxisY(a, b));
	}
	
	public static void main(String[] args)
	{
		int a[][] = {	{1, 2, 3, 4}, 
						{5, 6, 7},
						{8, 9, 10, 11, 12},
						{13, 14, 15, 16},
						{17, 18, 19}
					};
		int b[][] = {	{17, 18, 19}, 
						{13, 14, 15, 16},
						{8, 9, 10, 11, 12},
						{5, 6, 7},
						{1, 2, 3, 4}
					};
	
		System.out.println(symmetric(a, b));

		b = new int[][] {	{4, 3, 2, 1}, 
							{7, 6, 5},
							{12, 11, 10, 9, 8},
							{16, 15, 14, 13},
							{19, 18, 17}
						};
						
		System.out.println(symmetric(a, b));
	}
}
