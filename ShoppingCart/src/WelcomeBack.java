import java.util.HashMap;
import java.util.Map;

public class WelcomeBack {
	String getMiddle(String str)
	{
		return (str.length()%2==0)? (str.substring((str.length()/2)-1, (str.length()/2)+1)) : str.substring(str.length()/2,str.length()/2+1);
		
		
	}
	int[] sumNumbers(int n) 
	{
		int[] result = new int[n+1];
		result[0] = 0;
		for(int i = 1; i<n+1; i++)
		{
			result[i] = result[i-1] +i;
		}
		return result;
		
	}
	int sumDigits(int num)
	{
		int sum = 0;
		while (num>0)
		{
			sum += num%10;
			num/=10;
		}
		return sum;
		
	}
	int keepSummingDigits(int num) 
	{
		
		while (num>9 || num<0)
		{
			num = sumDigits(num);
		}
		
		return num;
	}
	String getIntersection(int[] a, int[] b) 
	{
		String r = "";
		for (int i=0; i<a.length;i++)
		{
			for (int j=0; j<b.length;j++)
			{
				if (a[i]==b[j])
				{
					r+=""+a[i];
				}
			}
		}
		return r;
	}
	Map<Integer, Integer> mapLengths(String[] words) 
	{
		HashMap<Integer, Integer> r = new HashMap<>();
		for (int i = 0; i<words.length; i++)
		{
			if (r.containsKey(words[i].length()))
			{
				int q = r.get(words[i].length())+1;
				r.remove(words[i].length());
				r.put(words[i].length(), q);
			}
			else
			{
				r.put(words[i].length(), 1);
			}
		}
		return r;
	}
	int sumDigitsRecur(int num)
	{
		if (num==0)
		{
			return 0;
		}
		else
		{
			return (num%10)+sumDigitsRecur(num/10); 
		}
	}
	int keepSummingDigitsRecur( int num)
	{
		if (num<=9)
		{
			return num;
		}
		else
		{
			return keepSummingDigitsRecur(sumDigitsRecur(num));
		}
	}
	int sumWithoutCarry(int a, int b)
	{
		if (a<=9 && b<=9)
		{
			int sum = a+b;
			int ans= sum%10;
			return ans;
		}
		else
		{
			return (a%10) + (b%10) + (sumWithoutCarry((int)a/10,(int) b/10))*10;
		}
	}
}
