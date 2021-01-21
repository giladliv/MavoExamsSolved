package Task1;

import java.util.Arrays;

public class Task1
{	
	private static int[] primeDeviders(int num)
	{
		int[] primeDevs = {};
		
		int len = (int)Math.sqrt(num);
		for (int i = 2; i <= len; i++)		// seive of eristophanes
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
	
	public static boolean sphenic(int n)
	{
		int[] primeDevs = primeDeviders(n);
		
		if (primeDevs.length != 3) { return false; }
		
		return (n == (primeDevs[0] * primeDevs[1] * primeDevs[2]));
	}
	
	public static void main(String[] args) {
		System.out.println(sphenic(30));  //true
		System.out.println(sphenic(60));  //false
		System.out.println(sphenic(15));  //false
		System.out.println(sphenic(98));  //false
	}
	
}
