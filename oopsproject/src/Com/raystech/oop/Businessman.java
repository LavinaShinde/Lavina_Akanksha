package Com.raystech.oop;

public class Businessman extends Testperson implements Richman,Socialworker{
	
	@Override
	public void helptoother() {
	System.out.println("help to others");
		
	}
	@Override
	public void earnmoney() {
		System.out.println("earn money");
		
	}
	@Override
	public void donation() {
	System.out.println("donating money");	
		
	}
	@Override
	public void party() {
		System.out.println("party");
	}
	

}
