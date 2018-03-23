//Honor Pledge:
//
//I pledge that I have neither given nor
//received any help on this assignment.
//
//jascho
public class Stack<E>
{
	//points to the top of the stack
	private int top;
	//the size of the stack
	private int size;
	//Array to emulate the stack
	private E [] stack;
	public Stack(int stackSize)
	{
		if (size > 0)
		{
			size=stackSize;
		}
		else
		{
			System.out.println("Invalid stack size!");
			System.out.println("Using default size of 10!");
			size=10;
		}
		//initialize a new generic array instance
		stack = (E[]) new Object[size];
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
	public E getTop()
	{
		return stack[top];
	}
	public void push (E dataElement)
	{
		//Check to see if the Stack is full - if not push the element.
		if(isFull())
		{
			//We should really throw an exception here...
			System.out.println("Your Stack is full!");
		}
		else
		{

			stack[++top]=dataElement;

			//Push the data element onto the Stack.
		}
	}
	public E pop()
	{
		//Check to see if the Stack is empty
		if(!isEmpty())
		{
			//Let's store the value of the data element.
			return stack[top--];
		}
		else
		{
			//We should really throw an exception here...
			System.out.println("Stack is empty - cannot pop!");
			return null;	
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
