package string_package;

public class StringDemo2 {

	public static void main(String[] args) {
	String firstName = "Shariar";
	String lastName = " Rafi";

	String fullName = firstName.concat(lastName);
	System.out.println("Full Name = "+fullName);

	String upperName = fullName.toUpperCase();
	System.out.println("\nUpper Case = "+fullName);

	String lowerName = fullName.toLowerCase();
	System.out.println("\nLower Case = "+fullName);
	
	boolean b = firstName.startsWith("Sh");
	System.out.println("\nb = "+b);
	
	boolean l = lastName.endsWith("r");
	System.out.println("\nl = "+l);
	
	System.out.println();
	String[] names = {"Rafi","Nuha","Lipi"};
	for (int i = 0; i <=2; i++) {
		System.out.print(names[i]+" ");
	}
	
	
	}

}
