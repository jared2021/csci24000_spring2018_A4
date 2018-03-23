//Honor Pledge:
//
//I pledge that I have neither given nor
//received any help on this assignment.
//
//jascho
import java.lang.String;
public class Address
{
	private String Line1;
	private String Line2;
	private String City;
	private String State;
	private String ZipCode;
	public Address()
	{
			
	}
	public void setLine1(String Line1)
	{
		Line1=Line1;
	}
	public String getLine1()
	{
		return Line1;
	}
	public void setLine2(String Line2)
	{
		Line2=Line2;
	}
	public String getLine2()
	{
		return Line2;
	}
	public void setCity(String City)
	{
		City=City;
	}
	public String getCity()
	{
		return City;
	}
	public void setState(String State)
	{
		State=State;
	}
	public String getState()
	{
		return State;
	}
	public void setZipCode(String ZipCode)
	{
		ZipCode=ZipCode;
	}
	public String getZipCode()
	{
		return ZipCode;
	}
	public String getData()
	{
		if(Line2!="")
		{
			String s="|%-20s|%-7s|%-15s|%-2s|%-5s|";
			return String.format(s,Line1,Line2,City,State,ZipCode);
		
		}
		else
		{
			String s="|%-20s|%-15s|%-2s|%-5s|";
			return String.format(s,Line1,City,State,ZipCode);
		}

	}
}
