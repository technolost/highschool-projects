
public class Runner {
	public static void main(String[] args) {
		StackProbs test = new StackProbs();
		
		//test.doubleUp(test.returnstack(new int[]{1,3,5,0,-1}));
		test.posAndNeg(test.returnstack(new int[]{2, 9, -4, 3, -1, 0, -6}));
		test.swapPairs(test.returnstack(new int[]{1, 2, 3, 4, 5,6}));
		test.shiftByN(test.returnstack(new int[]{7, 23, -7, 0, 22, -8, 4, 5}),3);
		System.out.println(test.reverseVowels("hello how are you"));
		System.out.println(test.bracketBalance("([()[]()])("));
	}
}
