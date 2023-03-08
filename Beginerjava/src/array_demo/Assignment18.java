package array_demo;
import java.util.Scanner;
public class Assignment18 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			
	String[] weekdays = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thirsday","Friday"};

	System.out.print("Enter day number (1-7): ");
	int daynumber=input.nextInt();
	
	for (int i = 0; i < weekdays.length; i++) {
	
		
		if(daynumber==i+1)
		System.out.println("\n"+weekdays[i]);
		
	}
	
	}
	}
	
}
