	import java.util.Scanner;
public class SmallCapitalDemo1 {

	public static void main(String[] args) {

		try(Scanner input= new Scanner(System.in)){

			char ch;
			System.out.print("Enter any letter: ");
			ch=input.next().charAt(0);
		
			if (ch >='a'&& ch<='z') {
				System.out.println("\nsmall letter");	
				
			}
			
			else {
				System.out.println("\nCapital letter");
			}
			
			
		
		
		

	}

}
}