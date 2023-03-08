package UAP_Bazar;

public class UAPbazar {

	public static void main(String[] args) {


		Product pr1 =new Product("Rice","1001","Grocery",85.00);
		Product pr2 =new Product("Sugar","1002","Grocery",130.00);
		Product pr3 =new Product("Egg","1003","Grocery",108.00);

		
		pr1.display();
		System.out.println();
		pr2.display();
		System.out.println();
		pr3.display();
		System.out.println();
		pr1.updatePrice(100.00);
		
		System.out.println();
		
		pr1.display();
		
		System.out.println();
		
		double x =pr1.getDiscountedPrice(20);
		
		System.out.println("Discounted price of rice is : "+x);
		
		
		
		
	}

}