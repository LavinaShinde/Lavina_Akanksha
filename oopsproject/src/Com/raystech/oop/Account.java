package Com.raystech.oop;

public class Account {
	
	private String number;
	private String accontType;
	private double balance;
	
	public void setNumber(String number) {
		this.number = number;
	}

	
	public String getNumber() {
		return number;
	}
	
	
	public void setAccontType(String accontType) {
		this.accontType = accontType;
	}
	
	public String getAccontType() {
		return accontType;
	}
	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	public void deposit(double d){
			this.balance= d+ this.balance;
			//this.balance+=d;
			
	}
	
	public void withdrawl(double w){
		this.balance -= w;
		
}
	public void fundtransfer(double f){
		this.balance = f - this.balance;;
		
}
	public void paybill(double p){
		this.balance= p - this.balance;
		
}
	public static void main(String[] args) {
		Account a = new Account();
		a.setNumber("PUNB0021765675");
		a.setBalance(5000);
		a.setAccontType("Saving");
		System.out.println("Account no is"+a.getNumber());
		System.out.println("Account type is"+a.getAccontType());
	
		System.out.println("balance is"+ a.getBalance());
		
		//a.paybill(200);
			//System.out.println("current balance is"+a.getBalance());
			
			//a.fundtransfer(30);
			//System.out.println("after fund transfer"+a.getBalance());
			//a.withdrawl(50);
			//System.out.println("after withdrawl amount is"+a.getBalance());
			a.deposit(9000);
			System.out.println("after deposit"+a.getBalance());
		
	}
	

}
