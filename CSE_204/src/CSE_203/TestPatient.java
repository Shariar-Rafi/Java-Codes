package CSE_203;

public class TestPatient {

	public static void main(String[] args)
		{
			Patient pat= new Patient("Hasin",22,"M");
			pat.display();
			fun(pat);
			pat.visitDoctor("Fever and cough");
		}
	public static void fun(Patient p) {
		p.grow(3);
		p.name = "Md. "+ p.name;
		
		p = new Patient("Abrar",19,"M");
		p.grow(1);
	}

}
