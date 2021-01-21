package Task2;

public class Task2
{
	static public String reduce(String s)
	{
		String strRet = "";
		
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			int j = i + 1;
			while (j < s.length() && ch == s.charAt(j))
			{
				j += 1;
			}
			i = j - 1;
			
			strRet += ch;
		}
		
		return (strRet);
	}
	
	public static void main(String[] args)
	{
		String str = "aaabbccccxxxyzza";
		System.out.println(str + ":\t" + reduce(str));
		
		str = "abcdeb";
		System.out.println(str + ":\t" + reduce(str));
	}
}
