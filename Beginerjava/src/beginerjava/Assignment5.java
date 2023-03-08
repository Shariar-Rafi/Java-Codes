package beginerjava;
import java.util.Scanner;
public class Assignment5 {

	public static void main(String[] args) {
	try(Scanner input= new Scanner (System.in)){
	
	short age;
	System.out.println("What is your age ?");
	age=input.nextShort();

if(age>=18) {
	System.out.print("Valid voter.");
}

else {
	System.out.print("Invalid voter!");
}

	}
	}
}
