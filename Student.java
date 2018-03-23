//Honor Pledge:
//
//I pledge that I have neither given nor
//received any help on this assignment.
//
//jascho
import java.lang.String;
import java.util.Scanner;
public class Student
{
	private String firstname;
	private String lastname;
	private String id;
	private String gpa;
	private String data;
	private Address myAddress;
	public Student(String data)
	{
		Scanner s= new Scanner(data);
		myAddress=new Address();
		String w=s.next();
		String[] array=w.split(",");
		firstname=array[0];
		lastname=array[1];
		myAddress.setLine1(array[2]);
		myAddress.setLine2(array[3]);
		myAddress.setCity(array[4]);
		myAddress.setState(array[5]);
		myAddress.setZipCode(array[6]);
		id=array[7];
		gpa=array[8];
	}
	public String getData()
	{
		String s="|%-10s|%-10s|%-20s|%-7s|%-15s|%-2s|%-5s|%-6s|%-5s|";
		return String.format(s,firstname,lastname,myAddress.getData(),id,gpa);
	}
	public void setFirstName(String firstname)
	{
		firstname=firstname;
	}
	public String getFirstName()
	{
		return firstname;
	}
	public void setLastName(String lastname)
	{
		lastname=lastname;
	}
	public String getLastName()
	{
		return lastname;
	}
	public void setID(String id)
	{
		id=id;
	}
	public String getID()
	{
		return id;
	}
	public void setGPA(String gpa)
	{
		gpa=gpa;
	}
	public String getGPA()
	{
		return gpa;
	}
	
}
