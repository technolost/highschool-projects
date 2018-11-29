import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		Runner test = new Runner();
		test.getMax( Arrays.asList(7, 30, 8, 22, 6, 1, 14), 19);
	}
	void printBinary(int digits)
	{
		printBinaryHelper(digits, "");
	}
	private void printBinaryHelper(int digits, String result) {
		if (result.length() == digits)
		{
			System.out.print(result+" ");
		}
		else
		{
			printBinaryHelper(digits, result+0);
			printBinaryHelper(digits, result+1);
		}

	}
	void climbStairs(int steps)
	{
		climbStairsHelper(steps, 0,"");
	}
	private void climbStairsHelper(int steps, int sum, String res) {
		if (sum==steps)
		{
			System.out.println("["+res+"]");
		}
		else if (sum>=steps)
		{
			return;
		}
		else
		{
			climbStairsHelper(steps, sum+1, res+1);
			climbStairsHelper(steps, sum+2, res+2);
		}

	}

	void campsite(int x, int y)
	{
		campsiteHelper(x, y, "");
	}
	private void campsiteHelper(int x, int y, String res) {
		if (x==0 && y==0)
		{
			System.out.println(res);
		}
		else
		{
			if (x==0 && y==0)
			{
				System.out.println(res);
			}
			else
			{
				if (x>0)
				 campsiteHelper(x-1, y-0, res+"E ");
				if (y>0)
				 campsiteHelper(x-0, y-1, res+"N ");
				if (x>0 &&y>0)
				 campsiteHelper(x-1, y-1, res+"NE ");
				 
			}
			 
		}
	}
	int getMax(List<Integer> nums, int limit) 
	{
		return getMaxHelper(nums, limit, 0,0,0);
		
	}
	private int getMaxHelper(List<Integer> nums, int limit, int high, int sum, int x) {
		if (sum<limit && sum>0 && sum>=high)
		{
			high = sum;
			
		}
		else
		{
			getMaxHelper(nums, limit, high, sum+nums.get(x), x+1);
			getMaxHelper(nums, limit, high, sum+nums.get(x+1), x+1);
			getMaxHelper(nums, limit, high, sum+nums.get(x+2), x+1);
		}
		return high;
	}

}
