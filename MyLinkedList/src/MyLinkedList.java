

public class MyLinkedList {
	ListNode head;
	private  class ListNode
	{
		int val;
		ListNode next;
		public ListNode(int val) {this.val = val;}
		@Override
		public String toString() {return ""+this.val;}
	}
	public MyLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
	}
	public MyLinkedList(int val)
	{
		head = new ListNode(val);
	}
	void add(int newval)
	{
		if (head==null)
		{
			head = new ListNode(newval);
		}
		else
		{
			ListNode temp = head;
			boolean end = false;
			while(!end)
			{
				if (temp.next==null)
				{
					temp.next  = new ListNode(newval);
					end = true;
				}
				else
					temp = temp.next;
			}	
			
		}
		//System.out.println(head.val);
	}
	boolean contains(int target)
	{
		if (head!=null)
		{
			ListNode temp  = head;
			boolean end = false;
			while(!end)
			{
				if (temp.val == target)
				{
					return true;
				}
				else if (temp.next == null)
				{
					end = true;
				}
				else
					temp = temp.next;
			}
					
		}
		return false;
	}
	int get(int index)
	{
		int count = 0;
		ListNode temp = head;
		boolean end = false;
		while(!end)
		{
			
			
				if (count == index)
				{
					return temp.val;
				}
				
				
				if (temp.next==null || index<0)
					throw new IndexOutOfBoundsException();
				temp = temp.next;
				count++;
			
		}
		return 0;
	}
	int indexOf(int target)
	{
		int count = 0;
		ListNode temp = head;
		boolean end = false;
		while(!end)
		{
			if (temp.val==target)
			{
				return count; 
			}
			if (temp.next==null)
			{
				count = 0;
				end = true;
			}
			temp = temp.next;
			count++;
		}
		
		return -1;
	}
	void set(int newval, int index)
	{
		int count = 0;
		ListNode temp = head;
		boolean end = false;
		while(!end)
		{
			
			
				if (count == index)
				{
					end = true;
					temp.val = newval ;
				}
				
				
				if (temp.next==null || index<0)
					throw new IndexOutOfBoundsException();
				temp = temp.next;
				count++;
			
		}
		
	}
		@Override
		public String toString()
		{
			if(head==null)
			{
				return "[]";
			}
			String res = "[";
			//System.out.println(head);
			ListNode temp = head;
	
			while(temp.next!=null)
			{
				
					res += temp.val+", ";
					temp = temp.next;
				
			}
		
			res+=temp.val+"]";
			return res;
					
		}
}
