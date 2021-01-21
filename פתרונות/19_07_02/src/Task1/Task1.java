package Task1;

import java.util.Arrays;

public class Task1
{
	public static long sortDigits(long num)
	{
		String str = Long.toString(num);
		char[] chArr =  str.toCharArray();
		
		Arrays.sort(chArr);
		return (Long.parseLong(String.valueOf(chArr)));
	}
	
	public static void main(String[] args)
	{
		long num = 3412672;
		System.out.println(sortDigits(num));
		num = 321009;
		System.out.println(sortDigits(num));
		
		
	}
}
