package Task1;

public class Task1
{
	public static int countInStr(char ch, String s)
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (ch == s.charAt(i))
			{
				count += 1;
			}
		}
		
		return (count);
	}
	
	public static char firstNonRepeated(String s)
	{
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if (countInStr(ch, s) == 1)
			{
				return (ch);
			}
		}
		
		return ('?');
	}
	
	public static char firstNonRepeatedNew(String s)
	{
		while (s.length() > 0)
		{
			char ch = s.charAt(0);
			if (s.substring(1).indexOf(ch) < 0)
			{
				return ch;
			}
			s = s.replaceAll("" + ch, "");
		}
		
		return ('?');
	}
	
	public static void main(String[] args)
	{
		String str = "0123456789";
		System.out.println(str.indexOf('q'));
		System.out.println(str.substring(0, 0) + str.substring(0+1));
		
		System.out.println(firstNonRepeated("abcaccbdef"));
		System.out.println(firstNonRepeatedNew("abcaccbdef"));
		System.out.println(firstNonRepeated("abdcaccbd"));
		System.out.println(firstNonRepeatedNew("abdcaccbd"));
		
	}
}
