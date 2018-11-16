import java.util.Stack;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion r = new Recursion();
		System.out.println(r.SumReciprocal(10));
		System.out.println(r.productOfEvens(4));
		Stack<Integer> nums = new  Stack<Integer>();
		nums.push(3); nums.push(7); nums.push(12); nums.push(9);
		r.doubleUP(nums);
		System.out.println(nums);
		r.CountToBy(34,5);
		System.out.println();
		r.CountToBy(25, 4);
		System.out.println();
		System.out.println(r.matchingDigits(298892, 7892));
		r.printTHis(7);
		System.out.println();
		r.PrintNums2(10);
	}
	double  SumReciprocal(int n)
	{
		if (n==1)
		{
			return 1;
		}
		else
		{
			
			return ((double) 1/n) + SumReciprocal(n-1);
		}
	}
	
	int productOfEvens(int nums)
	{
		if(nums == 1)
		{
			return 2;
		}
		else
		{
			return (nums*2)*productOfEvens(nums-1);
		}
	}
	
	void doubleUP(Stack<Integer> nums)
	{
		if (nums.isEmpty())
		{
			return;
		}
		else
		{
			int k = nums.pop();
			doubleUP(nums);
			nums.push(k);
			nums.push(k);
		}
	}
	void CountToBy(int n, int m)
	{
		if((n-m)<0)
		{
			System.out.print(n);
		}
		else
		{
			int x=n;
			CountToBy(n-m, m);
			System.out.print(", "+x);
		}
		
	}
	int matchingDigits(int a, int b)
	{
		if (a<10||b<10)
		{
			int a1 = a%10;
			int b1 = b%10;
			 if (a1==b1)
				 return 1;
			 return 0;
		}
		else
		{
			int a1 = a%10;
			int b1 = b%10;
			if (a1==b1)
			{
				return 1+matchingDigits(a/10, b/10);
				
			}
			else
			{
				return matchingDigits(a/10, b/10);
			}
		}
	}
	void printTHis(int n)
	{
		if(n==1)
		{
			System.out.print("*");
		}
		else if (n==2)
		{
			System.out.print("**");
		}
		else
		{
			System.out.print("<");
			printTHis(n-2);
			System.out.print(">");
		}
			
	}
	void PrintNums2(int n)
	{
		if (n==1)
		{
			System.out.print("1 ");
		}
		else if(n==2)
		{
			System.out.print("1 1 ");
		}
		else
		{
			int x = (int) (n+1)/2;
			System.out.print(x+" ");
			PrintNums2(n-2);
			System.out.print(x+" ");
		}
	}
}
