package Com.raystech.oop;

public class AutomobileSetGet {
	
	private String Color;
	private int speed;
	private String Make;
	public static final int NO_OF_GEARS=4;
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void breaks(int b){
		this.speed= b- this.speed;
		
		
}
	public void accelerator(int acc){
		this.speed= acc + this.speed;
		
		
}
	public void changeGear(int cg){
		this.speed= cg + this.speed;
		
		
}

	public static void main(String[] args) {
		AutomobileSetGet aum = new AutomobileSetGet();
		aum.setColor("red");
		aum.setSpeed(200);
		System.out.println("Color is"+ aum.getColor());
		System.out.println("Speed is"+ aum.getSpeed());
	
	}

}
