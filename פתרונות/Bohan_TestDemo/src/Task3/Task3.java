package Task3;

import java.util.Arrays;

public class Task3
{
	public static int isIn(int[]a, int b[])
	{
		int count = 0;
		int aLen = a.length;
		for (int i = 0; i < b.length - aLen + 1; i++)
		{
			int[] temp = Arrays.copyOfRange(b, i, i + aLen);
			if (Arrays.equals(a, temp))
			{
				count += 1;
			}
			
		}
		
		return (count);
	}
	
	public static void main(String[] args)
	{
		int[] a = {2, 1, 2};
		int[] b = {5, 1, 2, 3, 2, 1, 2, 1, 2};
		
		System.out.println(isIn(a,b)); 
	}
}
