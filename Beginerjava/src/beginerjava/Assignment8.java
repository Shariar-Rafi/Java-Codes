package beginerjava;
import java.util.Scanner;
public class Assignment8 {

	public static void main(String[] args) {
	try(Scanner input=new Scanner(System.in)){
		char ask1,ask2;
		
	System.out.println("Have you completed your masters ?");
		ask1=input.next().charAt(0);
		
		System.out.println("Are you fluent in English ?");
		ask2=input.next().charAt(0);
		
		
		
		
		
		if((ask1=='y'||ask1=='Y')&&(ask2=='y'||ask2=='Y'))
		{
			System.out.print("\nYou are eligible to for the job interview") ;
		}
		
		
		else
		{
			System.out.print("\nSorry. you are not eligible to for the job interview") ;
		}
		
		
		
		
		
	}	
	}

}
