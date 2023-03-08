package oop_for_practice;

public class Teacher {

	String name, phone;
	int age;
	

	

	void setInformation(String n,String ph,int m) {

		name =n;
		phone = ph;
		age = m;
	
	}
	
	
	void displayInformation(){
	System.out.println("Name = "+name);
	System.out.println("Phone number = "+phone);
	System.out.println("Age = "+age);

	System.out.println();
	}
	
}
