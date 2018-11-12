public class MyLinkedList
{
	public static final String NAME = /* Your name here */
	public static final int    ID   = /* Your student ID here */

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
		//TODO
	}

	//#2
	public int lastIndexOf(int val)
	{
		//TODO

		return -1;
	}


	//#3
	public int countDuplicates()
	{
		//TODO

		return -1;
	}

	//#4
	public void stutter()
	{
		//TODO
	}

	//#5
	public void removeAll(int n)
	{
		//TODO
	}

	//#6
	public int deleteLast()
	{
		//TODO

		return -1;
	}

	/** You can test your methods below if you'd like */
	public static void main(String[] args)
	{
		//
	}
}
