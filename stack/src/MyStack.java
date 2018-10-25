

import java.util.EmptyStackException;

public class MyStack {
	Integer[] stack;
	int size;
	MyStack()
	{
		this(8);
	}
	MyStack(int initcap)
	{
		stack = new Integer[initcap];
		
	}
	boolean isEmpty()
	{
		return size==0;
	}
	Integer peek()
	{
		if (this.isEmpty())
		{
			throw new EmptyStackException();
		}
		return stack[size-1];
	}
	Integer pop()
	{
		if (this.isEmpty())
		{
			throw new EmptyStackException();
		}
		int k = stack[size-1];//used only for storing
		size--;
		return k;
	}
	void push(Integer item)
	{
		size++;
		if(size==stack.length)
			doublecapacity();
		stack[size-1]=item;
	}
	private void doublecapacity() {
		Integer[] n = new Integer[size*2];
		for (int i=0; i<stack.length;i++)
		{
			n[i]=stack[i];
		}
		stack = n;
		
	}
	@Override
	public
	String toString()
	{
		String str = "[";
		for (int i=size-1;i>-1;i--)
			str+=stack[i]+",";
		return str.substring(0,str.length()-1)+"]";
			
	}
	

}
