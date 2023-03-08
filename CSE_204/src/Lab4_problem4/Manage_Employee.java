package Lab4_problem4;
import java.util.Scanner;
public class Manage_Employee {

	public static void main(String []args) {
		try(Scanner input = new Scanner(System.in))
		{
			String eName;
			String eID;
			String ePosition;
			double salary;
			
			int option;
		
			Employee [] ep = new Employee[1000];
			
			Mainloop:
				while(true)
				{
					System.out.println();
					System.out.print("1.Add a new employee\n2.Update the salary of an employee\n3.View an specific employee's salary\n4.View all employee's details\n0.Exit\n>");
					option=input.nextInt();
					
					switch(option)
					{
					
						case 1:
							System.out.print("Enter the name of the employee : ");
							eName = input.next();
							System.out.print("Enter the ID of the employee : ");
							eID = input.next();
							System.out.print("Enter the position of the employee : ");
							ePosition = input.next();
							System.out.print("Enter the salary of the employee : ");
							salary = input.nextDouble();
						
							for (int i = 0; i < ep.length; i++)
								{
									if(ep[i]==null){
										ep[i]= new Employee(eName,eID,ePosition,salary);
										System.out.println("\nNew employee added!");
		
										break;
										}	
									else {
										System.out.println("Employee already exist!");
									}
								}
							break;
							
						case 2:		
							System.out.print("Enter the employee's ID : ");
							eID = input.next();
							System.out.print("Enter the ammount to update the salary : ");
							salary = input.nextDouble();
							
							for (int i = 0; i < ep.length; i++)
								{
								
									if(ep[i]==null) {
										break;
									}
									if(ep[i].id.equals(eID)) {
										ep[i].updateSalary(salary);;
										System.out.println("\nPrice has been upated!");
									}			
								}
							break;
							
						case 3:
							System.out.print("Enter the employee's ID : ");
							eID = input.next();
							for (int i = 0; i < ep.length; i++)
								{
								
									if(ep[i]==null) {
										break;
									}
									if(ep[i].id.equals(eID)) {										
										double x = ep[i].getSalary();
										System.out.print("\nSalary : "+x);
										System.out.println();
									}		
								}
						break;
							
							
						case 4:
							System.out.println("\nAll employee's details");
							System.out.print("----------------------");
							System.out.println();
							for (int i = 0; i < ep.length; i++)
							{
								if(ep[i]==null)break;
								else {
								ep[i].display();
								}		
							}
					     break;
						case 0:
							break Mainloop;
					}			
				}		
		
		
		}
	}
}
