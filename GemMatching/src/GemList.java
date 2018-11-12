public class GemList 
{
	//int score;
	private class Node
	{
		Gem gem;
		Node next;
		Node()
		{
			gem = null;
			next = null;
		}
		Node(Gem gem)
		{
			this.gem = gem;
			next = null;
		}
	}
	int size;
	Node last;
	Node first;
	GemList()
	{
		int size = 0;
		first = null;
		last = first;
	}
	void insertBefore(Gem gem, int index)
	{
		Node temp = first;
		if (size == 0 ||index == 0)
		{
			first = new Node(gem);
			if (index==0 && size!=0)
			{	
				first.next = temp; 
				size++;
			}
			else
			{
				last = first;
				size++;
			}
			
		}
		else if (index>=size)
		{	
			last.next = new Node(gem);
			temp = last.next;
			last = temp;
			size++;
		}
		else
		{
			for(int i=0; i<index-1;i++)
			{
				temp = temp.next;
			}
			Node Temp2 = temp.next;
			temp.next = new Node(gem);
			temp.next.next = Temp2;
			size++;
		}
	}
	int size()
	{
		return size;
	}
	@Override
	public String toString()
	{
		String s = "[";
		Node temp = first;
		for(int i=0; i<size;i++)
		{
			s+= temp.gem.toString()+ " ";
			temp = temp.next;
		}
		s+="]";
		return s;
	}
	public void draw(double y)
	{
		Node temp = first;
		for (int i=0; i<size;i++)
		{
			temp.gem.draw(GemGame.indexToX(i), y);
			temp = temp.next;
		}
	}
	public int score ()
	{
		int score = 0;
		int value = 0;
		int tempScore=0;
		int sequance = 0;
		GemType type = null;
		Node temp = first;
		if (size==0)
			return 0;
		else
		{
			for(int i=0; i<size;i++)
			{
				if((temp.gem.type == type ||temp.gem.points == value)  && type!= null)
				{
					value = temp.gem.points;
					tempScore+=temp.gem.points;
					sequance++;
					if (temp.next == null || (temp.next.gem.type != type && temp.next.gem.points != value))
					{
						tempScore = tempScore*sequance;
						sequance=0;
						score+=tempScore;
						tempScore = 0;
					}
					temp = temp.next;
				}
				
				else
				{
					type = temp.gem.type;
					//System.out.println(type);
					sequance++;
					value = temp.gem.points;
					tempScore = temp.gem.points;
					if (temp.next != null && (temp.next.gem.type == type ||temp.next.gem.points == value))
					{
						temp = temp.next;
					}
					else
					{
						score+=tempScore;
						sequance=0;
						//tempScore = 0;
						temp = temp.next;
					}
				}
			}
		}
		return score;
					
	}
	public static void main(String [] args)
	{
		GemList list = new GemList();
		System.out.println(list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.9);		
//		
		list.insertBefore(new Gem(GemType.BLUE, 10), 0);
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.8);
//		
//		list.insertBefore(new Gem(GemType.BLUE, 20), 99);  //not a mistake, should still work
//		System.out.println("\n" + list);
//		System.out.println("size = " + list.size() + ", score = " + list.score());
//		list.draw(0.7);
//		
		list.insertBefore(new Gem(GemType.ORANGE, 10), 1);
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.6);
		
//		list.insertBefore(new Gem(GemType.ORANGE, 10), 2);
//		System.out.println("\n" + list);
//		System.out.println("size = " + list.size() + ", score = " + list.score());
//		list.draw(0.5);
//		
//		list.insertBefore(new Gem(GemType.ORANGE, 50), 3);
//		System.out.println("\n" + list);
//		System.out.println("size = " + list.size() + ", score = " + list.score());
//		list.draw(0.4);
//		
		list.insertBefore(new Gem(GemType.GREEN, 10), 2);
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.3);		
	}	
}
