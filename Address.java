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
		this.Line1=Line1;
	}
	public void setLine2(String Line2)
	{
		this.Line2=Line2;
	}
	public void setCity(String City)
	{
		this.City=City;
	}
	public void setState(String State)
	{
		this.State=State;
	}
	public void setZipCode(String ZipCode)
	{
		this.ZipCode=ZipCode;
	}
	public String getData()
	{
		if(!Line2.equals(""))
		{
			String s= "%s,%s,%s,%s,%s";
			return String.format(s,Line1,Line2,City,State,ZipCode);
		
		}
		else
		{
			String s="%s,%s,%s,%s";
			return String.format(s,Line1,City,State,ZipCode);
		}

	}
}
