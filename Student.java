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

	//attributes of a student
	private String firstname;
	private String lastname;
	private String id;
	private String gpa;
	private String data;
	private Address myAddress;

	//a overloaded constructor that will give each student it's respective attributes
	public Student(String data)
	{
		myAddress=new Address(data);
		String[] array=data.split(",");
		firstname=array[0];
		lastname=array[1];
		id=array[7];
		gpa=array[8];
	}

	//returns the attributes of the Student
	public String getData()
	{
		String s="Name: %-9s,%-11s Address: %-50s Student ID: %-6s GPA: %-5s";
		return String.format(s,firstname,lastname,myAddress.getData(),id,gpa);
	}
}
