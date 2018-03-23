//Honor Pledge:
//
//I pledge that I have neither given nor
//received any help on this assignment.
//
//jascho
import java.io.*;
import java.lang.String;
import java.util.Scanner;
public class Driver
{
	public static void main(String [] args)
	{	
		Stack<Student> container=new Stack<Student>(10);
		Scanner s=new Scanner(System.in);
		String input="0";
		while(!input.equals("3"))
		{
			System.out.println("1. Load students (from file)");
			System.out.println("2. Print stack");
			System.out.println("3. Exit program");
			System.out.print("Enter your Selection:");
			input=s.next();
			if (input.equals("1"))
			{
				try
				{
					File list = new File ("students.txt");
					Scanner a=new Scanner(list);
					while(a.hasNextLine())
					{
						String line=a.nextLine();
						container.push(new Student(line));
					}
					a.close();
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}	
			}
			else if (input.equals("2"))
			{
				while(container.isEmpty()==false)
				{
					Student a= container.pop();
					System.out.println(a.getData());
				}
			}
			else if (input.equals("3"))
			{
				System.out.println("Logged out.");
			}
			else
			{
				System.out.println("I don't know what you want me to do.");
			}
		}
	}
}
