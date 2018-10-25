import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Runner {
private static HashSet<String> Dictionary;
private static HashSet<String> UsedWords;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("input.txt"));
		Scanner bank = new Scanner(new File("dictionary.txt"));
//		
		 Dictionary = new HashSet<>();//stores all the words in the dictionary
		while(bank.hasNext())// used to add  the words to the array list
			Dictionary.add(bank.next());
		UsedWords = new HashSet<>();
		//stores first and the last word
		double timer = System.currentTimeMillis();
		while(input.hasNext())
		{
//		String first = input.next();
//		String last = input.next();
		System.out.println(PathFinder(input.next(),input.next()
				));
		}
		System.out.println(System.currentTimeMillis()-timer);
//		String first = "brewing";
//		String last = "whiskey";
//		System.out.println(PathFinder(first,last));
//		System.out.println(WordFinder("cat"));
//		Stack<String> fun = new Stack<>();;
//		fun.push("sail");
//		System.out.println(Duplicate(fun,"ruin"));
		
		
		
	}
	
	public static Stack<String> PathFinder(String first, String Last)
	{
		Queue<Stack<String>> words = new LinkedList<>();
		UsedWords = new HashSet<>();
		UsedWords.add(first);
		Stack<String> init = new Stack<>();
		init.push(first);
		words.offer(init);
		while(!words.isEmpty() && first.length() == Last.length() && Dictionary.contains(first.toUpperCase()) && Dictionary.contains(Last.toUpperCase()) )
		{
			
			words.addAll(Duplicate(words.poll(), Last));
			if (!words.isEmpty() && words.peek().peek().equals(Last))
				{
					return words.peek();
				}
			
			
			
			
		}
		Stack<String> not_found = new Stack<String>();
		not_found.push("No ladder found");
		return not_found; 
	}
	public static Stack<String> WordFinder(String word)
	{
		
		
		Stack<String> Words = new Stack<>();
		for (int i= 0; i<word.length();i++)
		{
			StringBuilder str = new StringBuilder(word);
			
			for (char ch = 'a'; ch<='z'; ch++)
			{
				str.setCharAt(i, ch);
				
				if(Dictionary.contains(str.toString().toUpperCase()) && !str.toString().equals(word) && !UsedWords.contains(str.toString()))
				{
					//System.out.println(s);
					Words.push(str.toString());
					UsedWords.add(str.toString());
				}
			}
		}
		return Words;
	}
	public static Queue<Stack<String>> Duplicate(Stack<String> old, String last)
	{
		Queue<Stack<String>> dup = new LinkedList<>();
		Stack<String> new_word = WordFinder(old.peek());
		int size = new_word.size();
		for(int i=0; i<size;i++)
		{
			Stack<String> temp = new Stack<>();
			temp.addAll(old);
			if (new_word.peek().equals(last))
			{
				temp.push(new_word.pop());
				dup.clear();
				dup.offer(temp);
				return dup;
				
			}
			temp.push(new_word.pop());
			dup.offer(temp);
		}
		
		
		return dup;
	}

}
