import java.awt.List;
import java.util.ArrayList;

public class Catalog {
	ArrayList<Item> items;
	String name;
	Catalog(String name) 
	{
		items = new ArrayList<>();
		this.name = name;
	}
	void add(Item item) 
	{
		items.add(item);
	}
	int size() 
	{
		return items.size();
	}
	Item get(int index) 
	{
		return items.get(index);
	}
	public String getName() {
		return name;
	}

}
