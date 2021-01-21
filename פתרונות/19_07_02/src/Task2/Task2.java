package Task2;

public class Task2
{
	public static boolean isSymmetricX(String str, int x)
	{
		if (x >= str.length() || str.length() == 0)
		{
			return false;
		}
		
		if (x == 0) return true;
		
		return (str.charAt(x-1) == str.charAt(str.length() - 1 - (x-1)) && isSymmetricX(str, x-1));
	}
	
	public static void main(String[] args)
	{
		System.out.println(isSymmetricX("abcwercba",3)); 
		System.out.println(isSymmetricX("abcwercba",2)); 
		System.out.println(isSymmetricX("abcwercba",4)); 
	}
}
