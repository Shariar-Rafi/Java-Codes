package cse_204;
import java.util.Scanner;
public class AverageDemo
{
   public static void main(String arg[])
	
    {
	
       int n;
    
	
       try(Scanner input=new Scanner(System.in)){
    	   
 
       System.out.print("Enter how many numbers you want to calculate : ");  
       n=input.nextInt();
 
       int a[]=new int[n];
 
       System.out.println("\nEnter "+n+" numbers :");
 
       for(int i=0;i<n;i++)
       {
	   a[i]=input.nextInt();
       }
       
       
       float x=0;
       for(int i=0;i<n;i++)
       {
	   x =x+a[i];
       }
       
 System.out.println("\nAverage = "+x/n);
 
    }
  }
}

