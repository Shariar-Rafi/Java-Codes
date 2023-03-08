package beginerjava;
import java.util.Scanner;
public class Assignment7 {

	public static void main(String[] args) {
	try(Scanner input=new Scanner(System.in)){
		char ask;
		
	System.out.println("Do you  love java ?");
		ask=input.next().charAt(0);
		
		if(ask=='y'||ask=='Y')
		{
			System.out.print("You are a java lover") ;
		}
		
		
		else if(ask=='n'||ask=='N')
		{
			System.out.print("You are not a java lover") ;
		}
		
		
		
		
		
	}
	}

}
