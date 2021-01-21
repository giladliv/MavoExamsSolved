package Task4;

public class LocalTime
{
	private String _localName;
	private int _utc;
	private Clock _time;
	
	LocalTime(String localName, int utc, Clock time)
	{
		_localName = localName;
		_time = new Clock(time);
		_utc = utc;
		
		if (_utc < -12 || _utc > 12)
		{
			throw new IllegalArgumentException("UTC cannot be over then 12 or less then -12, was: " + _utc);
		}
	}
	
	LocalTime(LocalTime other)
	{
		this (other._localName, other._utc, other._time);
	}
	
	public String getLocalName()
	{
		return (_localName);
	}
	
	public void setLocalName(String localName)
	{
		_localName = localName;
	}
	
	public int getUTC()
	{
		return (_utc);
	}
	
	public void setUTC(int utc)
	{
		_utc = utc;
	}
	
	public Clock getTime()
	{
		return new Clock(_time);
	}
	
	public void setTime(Clock time)
	{
		_time = new Clock(time);
	}
	
	public String toString()
	{
		String retStr = _localName + " (" + (_utc < 0 ? "-" : "+") + _utc + ") " + _time;
		return (retStr);
	}
	
	public boolean equlas(Object obj)
	{
		if (obj == null || !(obj instanceof LocalTime)) return false;
		
		LocalTime other = (LocalTime)obj;
		return (this.toString().equals(other.toString()));
	}
	
	public static void main(String[] args)
	{
		new LocalTime("", -13, new Clock(0,0));
		System.out.println("hello");
	}
}
