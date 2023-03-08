package beginerjava;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[]args) {
		
		try(Scanner input1 = new Scanner(System.in)){
		int id;
		System.out.print("Enter the id: ");
		id=input1.nextInt();
	
		
		
		
		try(Scanner input2 = new Scanner(System.in)){
		String title;
		System.out.print("Enter the title: ");
		title=input2.nextLine();
	
		
		

		try(Scanner input3 = new Scanner(System.in)){
		int price;
		System.out.print("Enter the price: ");
		price=input3.nextInt();

		
		
		
		try(Scanner input4 = new Scanner(System.in)){
		String description;
		System.out.print("Enter the description: ");
		description=input4.nextLine();
		
		
		
		

		try(Scanner input5 = new Scanner(System.in)){
		String category;
		System.out.print("Enter the category: ");
		category=input5.nextLine();
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n\nId of the product is: "+id);
		System.out.println("Title of the product is: "+title);
		System.out.println("Price of the product is: "+price);
		System.out.println("Description of the product is: "+description);
		System.out.println("Category of the product is: "+category);
		}
		}
		}
		}
		}
	}
}
