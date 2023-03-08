package beginerjava;
import java.util.Scanner;
public class Assignment9 {

	public static void main(String[] args) {

		try(Scanner input=new Scanner(System.in)){

		int language;
		System.out.print("Select option: ");
		language=input.nextInt();
		
		switch(language) {
		case 1:
		  System.out.print("Selected language is Bengali");
          break;
		
		case 2:
			  System.out.print("Selected language is Hindi");
	          break;
		case 3:
			  System.out.print("Selected language is Urdu");
	          break;
	          
		default:
			  System.out.print("Selected language is English");
	          

		}
	
		
		}
	}

}
