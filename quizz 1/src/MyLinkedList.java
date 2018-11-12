public class MyLinkedList
{
	public static final String NAME = "Tejas Bogguram Vasudev";/* Your name here */
	public static final int    ID   = 221414; /* Your student ID here */

	private ListNode front;

	public class ListNode //******** INNER CLASS ********
	{
		int data;
		ListNode next;

		public ListNode(int data) { this.data = data; }
		public ListNode(int data, ListNode next) { this.data = data; this.next = next; }

		@Override
		public String toString() { return "" + this.data; }
	}

	public MyLinkedList() //not actually necessary but included for clarity
	{
		front = null;
	}

	public MyLinkedList(int val)
	{
		front = new ListNode(val);
	}

	/** for ease of testing, you can construct a MLL object with initial values:
	 *     MyLinkedList list = new MyLinkedList(1, 2, 3, 4);
	 */
	public MyLinkedList(int... vals)
	{
		if (front == null) front = new ListNode(vals[0]);

		ListNode current = front;

		for (int i = 1; i < vals.length; i++) {
			current.next = new ListNode(vals[i]);
			current = current.next;
		}
	}

	@Override
	public String toString()
	{
		String result = "[";

		ListNode current = front;

		while (current != null)
		{
			if (current.next == null) //reached last element in the list
				result += current.data;

			else
				result += current.data + ", ";

			current = current.next;
		}
		result += "]";

		return result;
	}

	public ListNode getFront() { return this.front; }

	/* *******************************************
	 * ********* QUIZ METHODS BELOW HERE *********
	 * *******************************************/

	//#1
	public void replaceLast(int n)
	{
		ListNode temp = front;
		while(temp != null)
		{
			if (temp.next!=null)
			{
				temp = temp.next;
			}
			else
			{	temp.data = n;temp = temp.next;}
		}
	}

	//#2
	public int lastIndexOf(int val)
	{
		//TODO
		int index = 0;
		ListNode temp = front;
		int i=0;;
		while(temp!=null)
		{
			if(temp.data == val)
			{
				index = i;
			}
			i++;
			temp = temp.next;
			
		}
		if (index>0)
			return index;
		return -1;
	}


	//#3
	public int countDuplicates()
	{
		int x = Integer.MAX_VALUE;
		int count = 0;
		ListNode temp = front;
		while(temp!=null)
		{
			if (temp.data == x)
				count++;
			else
				x=temp.data;
			temp = temp.next;
						
		}
		
		if (count>0)
			return count;

		return -1;
	}

	//#4
	public void stutter()
	{
		//TODO
		ListNode temp = front;
		while(temp!=null)
		{
			int x = temp.data;
			ListNode temp2  = temp.next;
			temp.next = new ListNode(x);
			temp = temp.next;
			temp.next = temp2;
			temp = temp.next;
		}
	}

	//#5
	public void removeAll(int n)
	{
		//TODO
//		ListNode temp =  front;
//		while(temp != null)
//		{
//			if(temp.data == n)
//			{
//				temp.
//			}
//		}
	}

	//#6
	public int deleteLast()
	{
		//TODO
//		ListNode temp = front;
//		while (temp!=null)
//		{
//			catch (Exception e) {
//				// TODO: handle exception
//			}
//			if(temp.next.next == null)
//			{
//				temp.next=null;
//				continue;
//			}
//			temp= temp.next;
//		}

		return -1;
	}

	/** You can test your methods below if you'd like */
	public static void main(String[] args)
	{
		MyLinkedList test = new MyLinkedList(1,  8,  19,  4,  17);
		//test.replaceLast(0);
		System.out.println(test);
		test.deleteLast();
		System.out.println(test);
	}
}
