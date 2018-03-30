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

		//creates a Stack of students creates a scanner for input and sets the starting input to 0
		Stack<Student> container=new Stack<Student>(10);
		Scanner s=new Scanner(System.in);
		String input="0";

		//gives the user the menu and takes in their next input
		while(!input.equals("3")&&!input.equals("three"))
		{
			System.out.println("1. Load students (from file)");
			System.out.println("2. Print stack");
			System.out.println("3. Exit program");
			System.out.print("Enter your Selection:");
			input=s.next();

			//reads the in the file, scans it, gives the data from each line to a new student and puts the student on the Stack, and closes the Scanner
			if (input.equals("1")||input.equals("one"))
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
					System.out.println("Loaded the students from the file.");
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}	
			}

			//pops off each student off the Stack and prints the Students
			else if (input.equals("2")||input.equals("two"))
			{
				while(container.isEmpty()==false)
				{
					Student a= container.pop();
					System.out.println(a.getData());
				}
			}

			//Closes the program
			else if (input.equals("3")||input.equals("three"))
			{
				System.out.println("Logged out.");
			}

			//throws a message to let the user know that their input was not valid
			else
			{
				System.out.println("I don't know what you want me to do.");
			}
		}
	//closes the Scanner I had for inputs	
	s.close();
	}
}
