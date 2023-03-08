package beginerjava;
import java.util.Scanner;
public class TimeTableDemo{

	public static void main(String[] args) {
	try(Scanner input=new Scanner (System.in)){
	int num1,num2;
	
	System.out.print("Enter initial number: ");
	num1=input.nextInt(); //2
	System.out.print("Enterf final number: ");
	num2=input.nextInt(); //4


	for(int i=num1; i<=num2; i++)     //   num1=2   num2=4   i= 2,3,4
	{
		for(int j=1; j<=10; j++) {  //nested loop
		
			System.out.println(i+" x "+j+" = "+i*j);       // j=1,2,3,4,5,6,7,8,9,10 

		}
		System.out.println("\n\n");
	}

}
	}
	
}