package Task1;

import java.util.ArrayList;

public class Task1
{
	private static boolean isMersenne(int n)
	{
		if ((n + 1) % 2 != 0) { return false; }
		
		int num = n + 1;
		int power = (int)(Math.log(num) / Math.log(2));
		int numPoweredInt = (int)Math.pow(2, power);
		
		return (num == numPoweredInt);
	}
	
	private static boolean isPrime(int n)
	{
		if (n <= 1)	{ return (false); }
		
		int len = (int)Math.sqrt(n);
		for (int i = 2; i <= len; i++)
		{
			if (n % i == 0)
			{
				return (false);
			}
		}
		
		return (true);
	}
	
	public static boolean MarsennePrime(int n)
	{
		return (isMersenne(n) && isPrime(n));
	}
	
	public static void main(String[] args)
	{
		int run = 10;
		ArrayList<Integer> mersenNum = new ArrayList<Integer>();
		ArrayList<Integer> notMersen = new ArrayList<Integer>();
		for (int i = 1; i <= run; i++)
		{
			int num = (int)Math.pow(2, i) - 1;
			boolean isCurrMar = MarsennePrime(num);
			if (isCurrMar) {mersenNum.add(num);}
			else { notMersen.add(num); } 
					
		}
		
		System.out.println(mersenNum);
		System.out.println(notMersen);
	}
}
