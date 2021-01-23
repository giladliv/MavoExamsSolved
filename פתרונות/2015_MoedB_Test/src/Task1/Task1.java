package Task1;

import java.awt.dnd.DnDConstants;

public class Task1
{
	public static double seriesSum(int n)
	{
		double sum = 0.0;
		
		for (int i = 1; i <= n; i++)
		{
			double dNum = i;
			sum += 1.0 / (dNum * (dNum + 1));
		}
		return (sum);
	}
	
	public static void main(String[] args)
	{
		System.out.println(seriesSum(1));
		System.out.println(seriesSum(2));
		System.out.println(seriesSum(3));
	}
}
