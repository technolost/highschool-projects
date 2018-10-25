
public class ItemOrder {
	Item item;
	int qty;
	ItemOrder(Item item, int qty) 
	{
		this.item = item;
		this.qty = qty;
	}
	double getPrice()
	{
		return item.priceFor(qty);
	}
	Item getItem() 
	{
		return item;
	}
	@Override
	public
	boolean equals(Object obj)
	{
		return this.item.equals(((ItemOrder) obj).getItem());
	}
}
