import java.util.*;

public class QueueProbs {
	Queue<Integer> evenFirst(Queue<Integer> nums)
	{
		LinkedList<Integer> even = new LinkedList<>();
		LinkedList<Integer> odd = new LinkedList<>();
		
		while(!nums.isEmpty())
		{
			if (nums.peek()%2==0)
				even.offer(nums.poll());
			else
				odd.offer(nums.poll());
		}
		while(!odd.isEmpty())
		{
			even.offer(odd.poll());
		}
		
			
		return even;
		
	}
	public Stack<Integer> Sieve(int n)
	{
		LinkedList<Integer> nums = new LinkedList<>();
		for (int i=2; i<=n; i++)
		{
			nums.offer(i);
		}
		Stack<Integer> primes = new Stack<>();
		while(!nums.isEmpty())
		{
			LinkedList<Integer> temp = new LinkedList<>();
			primes.push(nums.poll());
			while(!nums.isEmpty())
			{
				if (nums.peek()%primes.peek()==0)
				{
					nums.poll();
				}
				else
					temp.offer(nums.poll());
			}
			nums = temp;
			
		}
		return  primes;
	}
}
