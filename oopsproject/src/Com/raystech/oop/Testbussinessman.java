package Com.raystech.oop;

public class Testbussinessman {
	public static void main(String[] args) {
		Businessman bs=new Businessman();
		bs.donation();
		bs.earnmoney();
		bs.helptoother();
		bs.party();
		bs.setAddress("234, President tower");
		bs.setName("lavina");
		System.out.println("Address :"+bs.getAddress());
		System.out.println("Name:"+bs.getName());
	}

}
