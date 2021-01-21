package Task1;

import java.util.Arrays;

public class Task1
{
	private static int[] getAllPrimeDevs(int num)
	{
		int[] primeDevs = {};
		
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
			{
				
				primeDevs = Arrays.copyOf(primeDevs, primeDevs.length + 1);
				primeDevs[primeDevs.length - 1] = i;
			}
			while (num % i == 0)
			{
				num /= i;
			}
		}
		return (primeDevs);
	}
	
	public static boolean powerful(int n)
	{
		int[] primeDevs = getAllPrimeDevs(n);
		if (primeDevs.length == 0) { return (false); }
		
		for (int i = 0; i < primeDevs.length; i++)
		{
			int sqrPrime = primeDevs[i] * primeDevs[i];
			if (n % sqrPrime != 0)
			{
				return (false);
			}
		}
		
		return (true);
	}
}
