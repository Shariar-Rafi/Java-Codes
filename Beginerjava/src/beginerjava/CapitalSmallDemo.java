package beginerjava;

import java.util.Scanner;

public class CapitalSmallDemo {

	public static void main(String[] args) {

		char ch;
try(	Scanner input=new Scanner (System.in)){
System.out.print("Enter any letter: ");
ch=input.next().charAt(0);

if(ch>='a'&&ch<='z') //a-z
{
System.out.print("Small letter");
}
		
else if(ch>='A'&&ch<='Z') //A-Z
{
System.out.print("Capital letter");
}		
else
{
System.out.print("Not a letter!");
}	
	}
	}
}
