package Lab4_problem3;
import java.util.Scanner;
public class UAP_BAZAR
{
	
	public static void main (String [] args) {
		
	try(Scanner input = new Scanner (System.in)){
			
		String pName;
		String pID;
		String pCategory;
		double price;
		int option;
		
		Product[] pr = new Product[1000];
		
		Mainloop:
			while(true)
			{
				System.out.println();
				System.out.print("1.Add a new product\n2.Update the price of a product\n3.Apply discount\n4.View all products info\n0.Exit\n>");
				option=input.nextInt();
				
				switch(option)
				{
				
					case 1:
						System.out.print("Enter the name of your product : ");
						pName = input.next();
						System.out.print("Enter the ID of your product : ");
						pID = input.next();
						System.out.print("Enter the category of your product : ");
						pCategory = input.next();
						System.out.print("Enter the price of your product : ");
						price = input.nextDouble();
					
						for (int i = 0; i < pr.length; i++)
							{
								if(pr[i]==null){
									pr[i]= new Product(pName,pID,pCategory,price);
									System.out.println("\nNew product added successfully!");
	
									break;
									}	
								else {
									System.out.println("Product already exist!");
								}
							}
						break;
						
					case 2:		
						System.out.print("Enter the product ID : ");
						pID = input.next();
						System.out.print("Enter the ammount to update the price : ");
						price = input.nextDouble();
						
						for (int i = 0; i < pr.length; i++)
							{
							
								if(pr[i]==null) {
									break;
								}
								if(pr[i].id.equals(pID)) {
									pr[i].updatePrice(price);
									System.out.println("\nPrice has been upated!");
								}
								
							}
						break;
						
					case 3:
						System.out.print("Enter the product ID : ");
						pID = input.next();
						System.out.print("Enter the discount : ");
						double dp = input.nextDouble();
						
						for (int i = 0; i < pr.length; i++)
							{
							
								if(pr[i]==null) {
									break;
								}
								if(pr[i].id.equals(pID)) {
									double x =pr[i].getDiscountedPrice(dp);
									
									System.out.print("Discounted price is : "+x);
									System.out.println();
								}		
							}
					break;
						
						
					case 4:
						System.out.println("\nAll product's info");
						System.out.print("------------------");
						System.out.println();
						for (int i = 0; i < pr.length; i++)
						{
							if(pr[i]==null)break;
							else {
							pr[i].display();
							
							}		
						}
				break;
					case 0:
						break Mainloop;
				}			
			}					
}		
}
}
