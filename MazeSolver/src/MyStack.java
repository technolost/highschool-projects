

import java.util.EmptyStackException;
public class MyStack implements StackADT {
	Square[] stack;
	int size;
	MyStack()
	{
		this(50);
	}
	MyStack(int initcap)
	{
		stack = new Square[initcap];
		
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public Square peek()
	{
		if (this.isEmpty())
		{
			throw new EmptyStackException();
		}
		return stack[size-1];
	}
	public Square pop()
	{
		if (this.isEmpty())
		{
			throw new EmptyStackException();
		}
		Square k = stack[size-1];//used only for storing
		size--;
		return k;
	}
	public void push(Square item)
	{
		size++;
		if(size==stack.length)
			doublecapacity();
		stack[size-1]=item;
	}
	private void doublecapacity() {
		Square[] n = new Square[size*2];
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
		return size>0?str.substring(0,str.length()-1)+"]":"[]";
			
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		stack = new Square[8];
		size = 0;
		
	}
	
	

}
