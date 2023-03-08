package beginerjava;
import java.util.Scanner;
public class Assignment16 {
    public static void main(String[] args) {
       try( Scanner input=new Scanner(System.in)){
        String username;
        int password;
       
       while(true){
   System.out.print("Enter username : ");          
username=input.nextLine();
 System.out.print("Enter password : ");  
     password=input.nextInt();

          
           if(username.equals("anis") && password==123456){
              System.out.println("\nWelcome to the system :)");
               break;
               }
            else
                 {
            	System.out.println("username/password is incorrect. please try again..\n");
            	}
            } 
      }
       }
    }