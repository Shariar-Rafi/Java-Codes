package Lab4_problem4;

public class Employee {
	
	
	public String name;         //declaration 
	public String id;
	public String position;
	public double salary;
	
	
	public Employee(String _name,String _id,String _position,double _salary) {             //constructor creation 
		
		this.name = _name;
		this.id = _id;
		this.position = _position;
		this.salary = _salary;

	}
	
	void updateSalary(double newSal) {                   //method1
	salary = newSal;	
	}
	
	double getSalary() {                              //method2
		return salary;
	}
	
	void display() {                                     //method3
		System.out.println("Employee's name : "+name);
		System.out.println("Employee's id : "+id);
		System.out.println("Employee's positon : "+position);
		System.out.println("Employee's salary : "+salary);
		System.out.println();

	}

}
