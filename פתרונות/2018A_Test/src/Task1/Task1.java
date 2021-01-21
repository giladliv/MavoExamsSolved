package Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1
{
	private int[] getAllDeviders(int num)
	{
		//ArrayList<Integer> devidersList = new ArrayList<Integer>();
		//devidersList = Arrays.copyOf(original, newLength);
		int[] devidersList = {};
		int len = 0;
		
		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0) // if devided then add to array
			{
				len = devidersList.length;
				devidersList = Arrays.copyOf(devidersList, len + 1);
				devidersList[len] = i;
			}
		}
		
		return (devidersList);
	}
	
	public boolean square(int a)
	{
		
		int[] devidersList = getAllDeviders(a);
		int intRoot = 0, sumSequare = 0;
		
		for (int i = 0; i < devidersList.length; i++)
		{
			sumSequare += devidersList[i] * devidersList[i];
		}
		intRoot = (int)Math.sqrt(sumSequare);
		
		return ((sumSequare == intRoot * intRoot));
	}
	
	public static void main(String[] args)
	{
		Task1 tsk1 = new Task1();
		System.out.println(246 + ": " + tsk1.square(246));
	}
}
