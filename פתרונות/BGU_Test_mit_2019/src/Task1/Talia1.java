package Task1;

public class Talia1
{
	public static boolean isSphenic(int n) {
		for (int i = 2; i < n; i++) 
		{
			for (int j = 2; j < n; j++)
			{
				for (int k = 2; k< n; k++)
				{
					if (i!=k && i!=j && j!=k && isPrime(j) && isPrime(k) && isPrime(i))
					{
						if(j*k*i==n)
						{
							return (true);
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean isPrime(int n)
	{
		if(n == 1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) 
			if (n % i==0) return false;

		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isSphenic(30));  //true
		System.out.println(isSphenic(60));  //false
		System.out.println(isSphenic(15));  //false
		System.out.println(isSphenic(98));  //false
	}
	
	
}
