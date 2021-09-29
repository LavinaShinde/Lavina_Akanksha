package Com.raystech.oop;

public class Employeeconclancon extends Person {
	private static String designation;

	public Employeeconclancon() {
		System.out.println("default constructor");

	}

	public Employeeconclancon(String fn, String ln) {
		super(fn, ln);
		System.out.println("Two parameterized constructor is called");
	}

	public Employeeconclancon(String fn, String ln, String des) {
		super(fn, ln);
		designation = des;

		System.out.println("Three paramiterized constructor is called");

	}

	public static void main(String[] args) {
		System.out.println("default conc");
		Employeeconclancon emp = new Employeeconclancon("vijay","chahuhan");
		
	}
}
