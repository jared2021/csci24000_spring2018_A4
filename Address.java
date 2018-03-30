//Honor Pledge:
//
//I pledge that I have neither given nor
//received any help on this assignment.
//
//jascho
import java.lang.String;
public class Address
{

	//attributes of a Address
	private String Line1;
	private String Line2;
	private String City;
	private String State;
	private String ZipCode;

	//a overloaded constructor that will give the Address it's respective attributes
	public Address(String data)
	{
		String[] array=data.split(",");
		Line1=array[2];
		Line2=array[3];
		City=array[4];
		State=array[5];
		ZipCode=array[6];
	}

	//returns the Address depending on if the Student has a second address or not
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
