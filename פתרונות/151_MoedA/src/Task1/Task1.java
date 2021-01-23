package Task1;

public class Task1
{
	
	public static boolean isEqualSum(int[] a, String s)
	{
        int sum0 = 0;
        int sum1 = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '1')
            {
            	sum1 += a[i];
            }
            else
            {
            	sum0 += a[i];
            }
        }
        

        return (sum0==sum1);
    }
	
	public static String equalSum(int[] a)
	{
		return (equalSum(a, ""));
	}
	
	public static String equalSum(int[] a, String bitStr)
	{
		if (bitStr.length() == a.length)
		{
			if (isEqualSum(a, bitStr))
			{
				return (bitStr);
			}
		}
		else
		{
			String strbit1 = equalSum(a, bitStr + "1");
			if (strbit1 != null)
			{
				return (strbit1);
			}
			String strbit0 = equalSum(a, bitStr + "0");
			if (strbit0 != null)
			{
				return (strbit0);
			}
		}
		
		return (null);
	}
	
	public static void main(String[] args)
	{
		int a[] = {1,2,3,2};
		System.out.println(equalSum(a));
		
		int[] b = {2,5,8,4,9,3,6,1};
		System.out.println(equalSum(b));
		
	}
}
