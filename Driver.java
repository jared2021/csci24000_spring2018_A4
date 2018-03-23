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
		Stack<String> container=new Stack<String>(10);
		Scanner s=new Scanner(System.in);
		int input=0;
		while(input!=3)
		{
			System.out.println("1. Load students (from file)");
			System.out.println("2. Print stack");
			System.out.println("3. Exit program");
			System.out.print("Enter your Selection:");
			input=s.nextInt();
			if (input==1)
			{
				try
				{
					File list = new File ("students.txt");
					Scanner a=new Scanner(list);
					while(a.hasNextLine())
					{
						String line=a.nextLine();
						container.push(line);
					}
					a.close();
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}

				
			}
		}
	}
}
