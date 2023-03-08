package beginerjava;
import java.util.Scanner;
public class VowConsDemo {

	public static void main(String[] args) {
		

		char ch;
try(	Scanner input=new Scanner (System.in)){
System.out.print("Enter any letter: ");
ch=input.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 

{
System.out.print("Vowel");
}
		
else 
{
System.out.print("Consonant");
}		
	
	}
	}
}
