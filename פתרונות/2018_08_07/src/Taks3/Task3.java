package Taks3;

import java.util.Arrays;

public class Task3
{
	public static int[][] makeArray()
	{
		return makeArray("2x7,6x3,1x0");
	}
	
	public static int[][] makeArray(String str)
	{
		String[] lines = str.split(",");
		int[][] retMat = new int[lines.length][];
		
		for (int i = 0; i < lines.length; i++)
		{
			String[] values = lines[i].split("x");
			int len = 0;
			int val = 0;
			
			if (values.length == 2)
			{
				len = Integer.parseInt(values[0]);
				val = Integer.parseInt(values[1]);
			}
			
			retMat[i] = new int[len];
			Arrays.fill(retMat[i], val);								                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            	
		}
		
		return (retMat);
	}
	
	public static void main(String[] args)
	{
		for (int[] arr : makeArray())
		{
			for (int num : arr)
			{
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
