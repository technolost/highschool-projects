import java.util.Stack;


public class StackProbs {

	void doubleUp(Stack<Integer> nums)
	{
		Stack<Integer> r = new Stack<>();
		while(!nums.isEmpty())
		{
			r.push(nums.peek());
			r.push(nums.pop());
		}
		while(!r.isEmpty())
		{
			nums.push(r.pop());
		}
		System.out.println(nums);
	}
	void posAndNeg(Stack<Integer> nums)
	{
		Stack<Integer> neg = new Stack<>();
		Stack<Integer> pos = new Stack<>();
		while (!nums.isEmpty())
		{
			if (nums.peek()<0)
			{
				neg.push(nums.pop());
			}
			else
				pos.push(nums.pop());
			
		}
		while(!neg.isEmpty())
		{
			nums.push(neg.pop());
		}
		while(!pos.isEmpty())
		{
			nums.push(pos.pop());
		}
		System.out.println(nums);
	}
	void swapPairs(Stack<Integer> nums)
	{
		Stack<Integer> r = new Stack<>();
		while(!nums.empty())
		{
			r.push(nums.pop());
		}
		
		while(!r.empty())
		{
			 int k = r.pop();
			if (!r.isEmpty())
				nums.push(r.pop());
				
			
			
				nums.push(k);
		}
		System.out.println(nums);
	}
	void shiftByN(Stack<Integer> nums, int n) 
	{
		Stack<Integer> r = new Stack<>();
		while(!nums.isEmpty())
			r.push(nums.pop());
		Stack<Integer> k = new Stack<>();
		for (int i=0; i<n;i++)
		{
			k.push(r.pop());
		}
		while(!r.isEmpty())
		{
			nums.push(r.pop());
		}
		for (int i=0; i<n;i++)
		{
			r.push(k.pop());
			
		}
		for (int i=0; i<n;i++)
		{
			nums.push(r.pop());
			
		}
		System.out.println(nums);
	}
	String reverseVowels(String str) 
	{
		Stack<Character> vow = new Stack<>();
		for(int i=0 ;i<str.length();i++)
		{
			if (str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				vow.push(str.charAt(i));
			
		}
		String res = "";
		for(int i=0 ;i<str.length();i++)
		{
			if (str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				res+=vow.pop();
			else
				res+=str.charAt(i);
			
		}
		return res;
	}
	boolean bracketBalance(String s)
	{
		Stack<Character> brack = new Stack<>();
		for (int i=0;i<s.length();i++)
		{
			if (!brack.isEmpty())
			{
				if(s.charAt(i)==']')
				{
					if (brack.peek()=='[')
					{
						brack.pop();
						continue;
					}
				}
				else if(s.charAt(i)=='(')
				{
					if (brack.peek()==')')
					{
						brack.pop();
						continue;
					}
				}
				else if(s.charAt(i)=='{')
				{
					if (brack.peek()=='}')
					{
						brack.pop();
						continue;
					}
				}
			}
			brack.push(s.charAt(i));
			return(brack.isEmpty());
				
			
		}
		if (brack.isEmpty())
		{return true;}
		return false;
	}
	public Stack<Integer> returnstack(int[] arr)
	{
		Stack<Integer> r = new Stack<>();
		for (int i=0; i<arr.length;i++)
		{
			r.push(arr[i]);
		}
		return r;
	}
}
