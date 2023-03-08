package cse_204;
import java.util.Scanner;
public class SumDemo
{
	public static void main(String arg[])	
	{
                  int n;
                  
    try(Scanner input=new Scanner(System.in)) {
 
	    System.out.print("Enter how many numbers you want to sum : ");
        n=input.nextInt();
        int a[]=new int[n]; 
        
	    System.out.println("\nEnter the "+n+" numbers : ");
                  
	              for(int i=0;i<n;i++){      
	                           System.out.print("\nEnter  number  "+(i+1)+" = ");
                               a[i]=input.nextInt();
                                      }
int  sum=0;	    
for(int i=0;i<n;i++)
{
sum=sum+a[i];
}  	    

System.out.println("\nSum = "+sum);                  
}
} 
}









//package cse_204;
//import java.util.Scanner;
//public class SumDemo {
//
//	public static void main(String[] args) {
//
//		try(Scanner input=new Scanner(System.in)) {
//			
//
//			
//			System.out.print("Enter the value of a : ");
//			int a=input.nextInt();
//			System.out.print("Enter the value of b : ");
//			int b=input.nextInt();
//			int sum = a+b;
//			System.out.println("\nSum = "+sum);
//
//		}
//	}
//
//}



