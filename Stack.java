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

	//determines how big the stack will be
	public Stack(int stackSize)
	{
		if (stackSize > 0)
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

	//determines when the Stack is empty
	public boolean isEmpty()
	{
		return top==-1;
	}

	//determines when the Stack is full
	public boolean isFull()
	{
		return top==size;
	}

	//gives the top variable for the Stack
	public E getTop()
	{
		return stack[top];
	}

	//allows something to be put on the top of the Stack as long as it is the same type as the Stack
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

			//Increment the top of the Stack.
			stack[++top]=dataElement;

			//Push the data element onto the Stack.
		}
	}

	//Takes the top item off the stack
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

	//prints out everything that is on the Stack
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
