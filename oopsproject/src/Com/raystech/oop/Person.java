package Com.raystech.oop;

public class Person {
protected String firstname;
protected String lastname;
protected String address;
 
public Person() {
	System.out.println("person's default constructor");
	
}
public Person(String fn,String ln) {
	firstname=fn;
	lastname=ln;
System.out.println("Two paramitirzed constructor is called");
	
}
public Person(String fn,String ln,String address) {
	this(fn,ln);
		/*
		 * firstname=fn; lastname=ln;
		 */
	this.address=address;
System.out.println("Three paramitirzed constructor is called");
	

}
	
}




