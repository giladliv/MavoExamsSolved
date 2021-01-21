package Task3;

public class Task3
{
	public static String mergeStrings(String a, String b)
	{
		String retAns = "";
		String temp = "";
		for (int i = 0; i < a.length(); i++)
		{
			temp = "" + a.charAt(i);
			if (b.contains(temp) && !retAns.contains(temp))
			{
				retAns += temp;
			}
		}
		
		return (retAns);
	}

}
