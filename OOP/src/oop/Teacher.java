package oop;

public class Teacher {

	String name;int age;String gender;String phone;

	Teacher(){
		
		System.out.println("No value!");
		
	}
	
	
	Teacher(String n,int a,String m, String p){ //constructor
		
		name = n;
		age = a;
		gender = m;
		phone = p;
		
	}
	
	
	void displayInformation () {

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
		System.out.println("Phone : "+phone);

	     System.out.println();

	}
	
	
	
}
