package Com.raystech.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testperson {
	private String name;
	private Date Dob;
	private String address;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setDob(Date dob) {
		Dob = dob;
	}
	
	public Date getDob() {
		return Dob;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	public static void main(String[] args) throws ParseException {
		
		Personsetget s = new Personsetget();
		s.setName ("lavina");
	    
		s.setAddress("234, President tower");
		
		System.out.println("name is"+s.getName());
		
		System.out.println("address is"+s.getAddress());
		
		Date d=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		s.setDob(sdf.parse("28/02/2001"));
		System.out.println("dob is"+s.getDob());
		
		
		
	}

}
