package Recursion;

public class Task13
{
	public static boolean isUpperLowwerFor(String s)
	{
		boolean retBool = true;
		for (int i = 0; i < s.length() - 1; i++)
		{
			boolean isUp = ('A' <= s.charAt(i) && s.charAt(0) <= 'Z') && ('A' <= s.charAt(i+1) && s.charAt(1) <= 'Z');
			boolean isDown = ('a' <= s.charAt(i) && s.charAt(i) <= 'z') && ('a' <= s.charAt(i+1) && s.charAt(1) <= 'z');
			
			retBool = retBool && (isUp || isDown);
		}
		return(retBool);
	}
	
	public static boolean isUpperLowwer(String s)
	{
		if (s.length() <= 1)
		{
			return (true);
		}
		
		boolean isUp = ('A' <= s.charAt(0) && s.charAt(0) <= 'Z') && ('A' <= s.charAt(1) && s.charAt(1) <= 'Z');
		boolean isDown = ('a' <= s.charAt(0) && s.charAt(0) <= 'z') && ('a' <= s.charAt(1) && s.charAt(1) <= 'z');
		
		return ((isUp || isDown) && isUpperLowwer(s.substring(1)));
		
	}
	
	public static boolean isUpperLowwerBatel(String s, int len, int index)
	{
		if (s.length() == index)
		{
			return (Math.abs(len) == s.length());
		}
		
		if ('A' <= s.charAt(index) && s.charAt(index) <= 'Z')
		{
			len += 1;
		}
		if ('a' <= s.charAt(index) && s.charAt(index) <= 'z')
		{
			len -= 1;
		}
		
		return isUpperLowwerBatel(s, len, index+1);
		
	}
	
}
