package Task3;

public class Task3
{
	private static boolean isPrime(int num)
	{
		if (num < 2) return false;
		
		for (int i = 2; i <= Math.sqrt(num); i++)
		{
			if (num % i == 0)
			{
				return (false);
			}
		}
		
		return (true);
	}
	
	public static int firstPrimesInFibonacci(int n)
	{
		int count = 0;
		int a = 1;
		int b = 1;
		
		for (int i = 0; i < n - 2; i++)
		{
			int tempF = a + b;
			
			if (isPrime(tempF))
			{
				count += 1;
			}
			
			a = b;
			b = tempF;
		}
		
		return (count);
	}
	
	public static void main(String[] args)
	{
		System.out.println(firstPrimesInFibonacci(7));
	}
}
