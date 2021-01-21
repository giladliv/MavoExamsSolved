package Task1;

public class Task1
{
	public static boolean countExactly(int num, int digit, int count)
	{
		if (num == 0)
			if (count == 0) return true;
			else return false;
		
		return countExactly(num / 10, digit, count - (num % 10 == digit ? 1 : 0));
	}

}
