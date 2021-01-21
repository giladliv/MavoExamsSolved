package Task4;

public class line
{
	// Section A
	private int _x1, _y1;
	private int _x2, _y2;
	
	//Section B
	public line(int x1, int y1, int x2, int y2)
	{
		_x1 = x1;
		_y1 = y1;
		_x2 = x2;
		_y2 = y2;
	}
	
	public line(line other)
	{
		this (other._x1, other._y1, other._x2, other._y2);
	}
	
	//Section C
	public double length()
	{
		double a = Math.pow((_x2 - _x1), 2.0);
		double b = Math.pow((_y2 - _y1), 2.0);
		
		return (Math.sqrt(a+b));
	}
	
	//Section D
	public boolean on(int x, int y)
	{
//		if (_x1 == _x2)
//		{
//			return ((x == _x1) && ((_y1 <= y && y <= _y2) || (_y2 <= y && y <= _y1)));
//		}
//		else
//		{
//			
//		}
		
		line l1 = new line(_x1, _y1, x, y);
		line l2 = new line(x, y, _x2, _y2);
		
		return (this.length() == (l1.length() + l2.length()));
	}
	
	public static void main(String[] args)
	{
		line ln = new line(2,8,100,302);
		
		System.out.println(ln.on(8, 26));
	}
}
