
public class Item {
	String name;
	double price;
	int bulkqty;
	double bulkprice;
	Item(String name, double price)
	{
		this(name,price,0,0);
	}
	Item(String name, double price, 
		     int bulkQty, double bulkPrice)
	{
		if (price<0 || bulkPrice<0)
		{
			throw new IllegalArgumentException("error");
		}
		this.name  = name;
		this.price = price;
		this.bulkqty  =bulkQty;
		this.bulkprice = bulkPrice;
	}
	double priceFor(int quantity)
	{
		if (quantity <0)
		{
			throw new IllegalArgumentException("error");
		}
		double total = 0;
		if (quantity>=bulkqty)
		{
			total += quantity*bulkprice;
		}
		else
			total += quantity*price;
		
		return total;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return (((Item) obj).name.equals(this.name));
	}
	@Override
	public 
	String toString()
	{
		if (bulkprice==0)
		return "item: " + name +", $" + price;
		else
			return "item: " + name +", $" + price+ "\n Bulkqty: "+bulkqty+", Bulk Price $"+bulkprice;
			
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBulkqty() {
		return bulkqty;
	}
	public void setBulkqty(int bulkqty) {
		this.bulkqty = bulkqty;
	}
	public double getBulkprice() {
		return bulkprice;
	}
	public void setBulkprice(double bulkprice) {
		this.bulkprice = bulkprice;
	}
	
}
