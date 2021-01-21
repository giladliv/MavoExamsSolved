package Task5;

public class MoedB {
	public static void main(String[] args)
	{
		int x=3,y=7;
		swap(x,y);
		System.out.println(x+" "+y);
		
		int[] array={6,4,2,0,5,1};
		swap(array,0,1);
		System.out.println(array[0]+" "+array[1]);
		swap(array[0],array[1]);
		System.out.println(array[0]+" "+array[1]);
		
		String a="ABC";
		String b="wxz";
		swap(a,b);
		System.out.println(a+" "+b);
		
		int cell=3;
		while(cell>=0 && cell<=5)
		{
			System.out.print(cell + " ");
			cell= array[cell];
		}
		System.out.println();
	}
	
	public static void swap(int x,int y)
	{
		int help=x;
		x=y;
		y=help;
	}
	
	public static void swap(int[] arr,int i,int j)
	{
		int help=arr[i];
		arr[i]=arr[j];
		arr[j]=help;
	}
	
	public static void swap(String a,String b)
	{
		String help=a;
		a=b;
		b=help;
	}
}
