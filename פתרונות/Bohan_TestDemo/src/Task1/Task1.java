package Task1;

public class Task1
{
	public static String decimal2Binary(int a)
	{
		String strBin = "";
		if (a == 0) return "0";
		while (a > 0)
		{
			strBin = String.valueOf(a % 2) + strBin;
			a /= 2;
		}
		
		return (strBin);
	}
	
	public static void main(String[] args)
	{
		System.out.println(decimal2Binary(5));
	}
}
