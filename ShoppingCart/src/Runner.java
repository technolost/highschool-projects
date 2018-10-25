import java.util.Arrays;

public class Runner {

	public static void main(String[] args) 
	{
		WelcomeBack test = new WelcomeBack();
		//System.out.println(test.getMiddle("compute"));
		//System.out.println(Arrays.toString(test.sumNumbers(5)));
		//System.out.println(test.sumDigits(432));
		//System.out.println(test.keepSummingDigits(55));
		//System.out.println(test.getIntersection(new int[] {1,2,3,4}, new int[] {9,0,4,3,1}));
		//System.out.println(test.mapLengths(new String[] {"a", "b", "hello", "hi", "yo", "I"}));
		//System.out.println(test.sumDigitsRecur(234));
		//System.out.println(test.keepSummingDigitsRecur(29));
		System.out.println(test.sumWithoutCarry(861,450));
	}
}
