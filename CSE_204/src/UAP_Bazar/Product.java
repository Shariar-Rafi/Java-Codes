package UAP_Bazar;

public class Product {

	public String name;
	public String id;
	public String category;
	public double price;
	
	
	public Product(String _name, String _id, String _category, double _price) {
		
		this.name = _name;
		this.id = _id;
		this.category = _category ;
		this.price = _price;

	}
	
	public void updatePrice(double newPrice) {
		price = newPrice;
	}
	
	public double getPrice() {	
		return price;
	}
	
	double getDiscountedPrice(double discountPercentage) {
		return price - (price*(discountPercentage/100));
	
	}
	
	void display()
	{
		System.out.println("Product name : "+name);
		System.out.println("Product id : "+id);
		System.out.println("Product category : "+category);
		System.out.println("Product name : "+price);
	}	
	
}