package beginerjava;

import java.util.Scanner;

public class Assignment15 {
   public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("start number: ");
      int m = input.nextInt();

      System.out.print("end number: ");
      int n = input.nextInt();
      
      int totalArmstrongNumber=0;

      for (int i = m; i <= n ; i++) {
    	  int temp =i;int sum =0; int r;
    	   
      while(temp!=0) {
    		 r=temp%10;

    		sum=sum+r*r*r;
    		temp=temp/10;
    		
    	}
  if(sum==i) {
	  System.out.print(i+" ");
	  totalArmstrongNumber++;
      }
      
      }
      
    
    
     System.out.println("\n\nTotal armstrong numbers : "+totalArmstrongNumber);
    }
  }
}