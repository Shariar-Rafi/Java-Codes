package string_package;

public class StringDemo5 {

	public static void main(String[] args) {

		String s1="Shariar"; 
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb);

		sb.append(" Rafi ");
		sb.append(364);
		System.out.println(sb);
		
	
		sb.delete(0, 8);
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);

		

	}

}
