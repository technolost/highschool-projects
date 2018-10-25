import java.util.*;
public class Melody  {
	private Queue<Note> notes;
	Melody(Queue<Note> notes)
	{
		this.notes = notes;
	}
	@Override
	public String toString()
	{
		String rep = "";
		int size = notes.size();
		for (int  i=0; i<size;i++)
		{
			Note s = notes.poll();
			rep += s+" ";
			notes.offer(s);
		}
		return rep;
	}
	void changeTempo(double tempo)
	{
		int size  = notes.size();
		for (int i =0; i<size;i++)
		{
			Note temp = notes.poll();
			double dur = temp.getDuration();
			temp.setDuration(dur*tempo);
			notes.offer(temp);
		}
	}
	public void reverse()
	{
		Stack<Note> temp = new Stack<>();
		while(!notes.isEmpty())
		{
			temp.push(notes.poll());
		}
		while(!temp.isEmpty())
		{
			notes.offer(temp.pop());
		}
	}
	public void append(Melody other)
	{
		while(!other.notes.isEmpty())
			notes.offer(other.notes.poll());
	}
	public void play()
	{
		Stack<Note> st = new Stack<>();
		Queue<Note> rep = new LinkedList<>();
		int size = notes.size();
		for (int i=0;i<size;i++)
		{
			Note temp = notes.poll();
			if (temp.isRepeat() && st.isEmpty())
			{
				rep.offer(temp);
				st.push(temp);
			}
			else if (temp.isRepeat() && !st.isEmpty())
			{
				temp.play();
				st.pop();
				while(!rep.isEmpty())
				{
					rep.poll().play();
				}
			}
			if (!st.isEmpty())
				rep.offer(temp);
				temp.play();
			notes.offer(temp);
		}
		
	}
	public double getTotalDuration()
	{
		Stack<Boolean> rep = new Stack<>();
		double total = 0.0;
		int size  = notes.size();
		for (int i=0; i<size; i++)
		{
			Note temp = notes.poll();
			if (temp.isRepeat())
			{
				if (rep.isEmpty())
				{
					rep.push(true);
				}
				else
				{
					total += temp.getDuration();
					rep.pop();
				}
			}
			if (!rep.isEmpty())
			{
				total += temp.getDuration();
			}
			
			total += temp.getDuration();
			notes.offer(temp);
		}
		return total;
	}
	
}
