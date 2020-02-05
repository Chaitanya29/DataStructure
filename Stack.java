
public class Stack {

	static final int MAX = 1000;
	int [] stack_arr = new int[MAX];
	int top;
	
	boolean isEmpty()
	{
		return (top<0);
	}
	Stack()
	{
		top =-1;
	}
	
	boolean push(int item)
	{
		if(top == MAX-1)
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else
		{
			stack_arr[++top] = item;
			System.out.println(item);
			return true;
		}
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			
			return 0;
		}
		else
		{
			int item = stack_arr[top--];
			return item;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		System.out.println(st.isEmpty());
		st.push(10);
		System.out.println(st.isEmpty());

	}

}
