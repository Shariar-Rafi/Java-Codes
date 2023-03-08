package beginerjava;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		try(Scanner input = new Scanner(System.in);){
		int num;
		System.out.print("Enter the number: ");
		num =input.nextInt();
		
if(num>0)
        {
		System.out.println("The number is positive.");
		}


else if(num<0)
{
System.out.println("The number is negative.");
}

else {
	System.out.println("The number is zero.");
	}

		}

	}

}
