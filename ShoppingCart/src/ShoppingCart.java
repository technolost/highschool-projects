import java.util.ArrayList;

public class ShoppingCart {
	ArrayList<ItemOrder> order;
	ShoppingCart()
	{
		order = new ArrayList<>();
	}
	void add(ItemOrder newOrder)
	{
		order.add(newOrder);
	}
	double getTotal()
	{ 
		double total = 0;
		for (int i=0; i<order.size();i++)
		{
			total+=order.get(i).getPrice();
		}
		return total;
	}
}
