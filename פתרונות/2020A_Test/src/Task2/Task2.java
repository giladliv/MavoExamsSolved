package Task2;

import java.util.ArrayList;

public class Task2
{
	private static ArrayList<String> getPrefixSubString(String str)
	{
		ArrayList<String> subList = new ArrayList<String>();
		
		for (int i = 1; i < str.length(); i++)
		{
			subList.add(str.substring(0, i));
		}
		
		return (subList);
	}
	
	private static int countCharInStr(char ch, String str)
	{
		int count = 0;
		
		for (int i = 0; i < str.length(); i++)
		{
			if (ch == str.charAt(i))
			{
				count += 1;
			}
		}
		
		return (count);
	}
	
	public static int balanced(String s)
	{
		int count = 0;
		ArrayList<String> subList = getPrefixSubString(s);
		
		for (String str : subList)
		{
			if (countCharInStr('S', str) == countCharInStr('R', str))
			{
				count += 1;
				System.out.println(str);
			}
		}
		
		return (count);
	}
	
	public static void main(String[] args)
	{
		System.out.println(balanced("SRSR"));
		System.out.println(balanced("RSSRS"));
	}
}
