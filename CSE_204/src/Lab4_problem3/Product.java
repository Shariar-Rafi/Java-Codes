package Lab4_problem3;

public class Product
{

	public String name;
	public String id;
	public String category;
	public double price;
	
	
	public Product(String pn, String pid, String pcg, double price)
		{
			this.name = pn;
			this.id = pid;
			this.category = pcg ;
			this.price = price;
		}
	
	public void updatePrice(double newPrice)
		{
			price = newPrice;
		}
	
	public double getPrice() {	
		return price;
	}
	
	double getDiscountedPrice(double discountPercentage)
		{
			return price - (price*(discountPercentage/100));
		
		}
	
	void display()
		{
			System.out.println("Product name : "+name);
			System.out.println("Product id : "+id);
			System.out.println("Product category : "+category);
			System.out.println("Product name : "+price);
			System.out.println();
		}	
		
}