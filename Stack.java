//Honor Pledge:
//
//I pledge that I have neither given nor
//received any help on this assignment.
//
//jascho
public class Stack<T>
{
	//points to the top of the stack
	private int top;
	//the size of the stack
	private int size;
	//Array to emulate the stack
	private int [] stack;
	public Stack()
	{
		//Default size ==10
		size=10;
		//initialize a new intiger array
		stack= new int [size];
		//Initialize the top value
		top=-1;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==size;
	}
	public int getTop()
	{
		return stack[top];
	}
	public void push (int dataElement)
	{
		//Check to see if the Stack is full - if not push the element.
		if(isFull())
		{
			//We should really throw an exception here...
			System.out.println("Your Stack is full!");
		}
		else
		{
			//Increment the top of the Stack.
			top=top+1;

			//Push the data element onto the Stack.
		}
	}
	public int pop()
	{
		//Check to see if the Stack is empty
		if(!isEmpty())
		{
			//Let's store the value of the data element.
			int value= stack [top];

			//Let's move the pointer by decrementing it.
			top=top-1;

			//We should return the value

			//Return the popped data element
			return value;
		}
		else
		{
			//We should really throw an exception here...
			System.out.println("Stack is empty - cannot pop!");
			return 0;
		}
	}
	public void displayStack()
	{
		//Loop through our Stack array
		//printing the values
		for(int i=0;i<=top;i++ )
		{
			System.out.print(stack[i]+ ",");
		}
	}
}
