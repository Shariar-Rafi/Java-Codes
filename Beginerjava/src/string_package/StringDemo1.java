package string_package;

public class StringDemo1 {

	public static void main(String[] args) {

		String s1 = "shariar Rafi";
		String s2 = new String("Shariar Rafi");
		String s3 = "";
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);

		int ln = s1.length();
		System.out.println("Length of s1 = "+ln);
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not equals");

		}
		
		
		boolean con = s1.contains("Rafi");
		System.out.println(con);
		
		
		boolean b = s3.isEmpty();
		System.out.println("b = "+b);
		
		
	}

}
