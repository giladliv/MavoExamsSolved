package Task2;

public class Task2
{
	private	static boolean isSingleCharInStr(char ch, String s)
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == ch)
			{
				count += 1;
			}
			
			if (count > 1)
			{
				return (false);
			}
		}
		
		return (count == 1);
	}
	
	public static String single(String s)
	{
		String strRet = s;
		
		for (int i = 0; i < strRet.length(); i++)
		{
			char ch = strRet.charAt(i);
			if (!isSingleCharInStr(ch, strRet))
			{
				strRet = strRet.replace(String.valueOf(ch), "");
				i -= 1;
			}
		}
		
		return (strRet);
	}
	
	public static void main(String[] args)
	{
		String str = "abcd9cb";
		System.out.println(str + ":\t\t" + single(str));
			
		str = "abracadabra";
		System.out.println(str + ":\t\t" + single(str));
		
		str = "abba";
		System.out.println(str + ":\t\t" + single(str));
		
		str = "abcdefg";
		System.out.println(str + ":\t\t" + single(str));
	}
}
