package Task3;

import java.util.Arrays;

public class Task3
{
	public static int subSeqOfZeros(int arr[])
	{
		int biggestLen = 0;
		
		String strNums = Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
		String[] zerosOnly = strNums.split("1");
		for (String strZr : zerosOnly)
		{
			biggestLen = Math.max(biggestLen, strZr.length());
		}
		
		return (biggestLen);
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,0,0,0,1,0,0,1,1,0};
		
		System.out.println(subSeqOfZeros(arr));
		
	}
}
