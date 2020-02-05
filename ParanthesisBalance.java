
class CharStack {

	static final int MAX = 1000;
	char [] stack_arr = new char[MAX];
	int top;
	
	boolean isEmpty()
	{
		return (top<0);
	}
	CharStack()
	{
		top =-1;
	}
	
	boolean push(char item)
	{
		if(top == MAX-1)
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else
		{
			stack_arr[++top] = item;
			//System.out.println(item);
			return true;
		}
	}
	char pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			
			return '\0';
		}
		else
		{
			char item = stack_arr[top--];
			return item;
		}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Stack st = new Stack();
//		System.out.println(st.isEmpty());
//		st.push(10);
//		System.out.println(st.isEmpty());

	//}

}


public class ParanthesisBalance {

	static boolean isMatchingPair(char pop_item, char new_item)
	{
		if (pop_item == '(' && new_item == ')')
			{
					return true;
			}
		else if (pop_item == '[' && new_item == ']')
		{
			return true;
	}
		else if(pop_item == '{' && new_item == '}')
		{
				return true;
		}
		else
		{
			return false;
		}
	}
	
	static boolean areParenthesisBalanced(char char_arr[])
	{
		CharStack st = new CharStack();
		for(int i=0; i<char_arr.length; i++)
		{
			if(char_arr[i]=='('||char_arr[i]=='['||char_arr[i]=='{')
			{
				st.push(char_arr[i]);
			}
			if(char_arr[i]==')'||char_arr[i]==']'||char_arr[i]=='}')
			{
				if(st.isEmpty())
				{
					return false;
				}
				else if(!isMatchingPair(st.pop(), char_arr[i]))
				{
					return false;
					
				}
			}
		}
		if(st.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "[()]{}{[()()]()}";
		char[] char_arr = str.toCharArray();
		System.out.print(areParenthesisBalanced(char_arr));
		
	}

}
