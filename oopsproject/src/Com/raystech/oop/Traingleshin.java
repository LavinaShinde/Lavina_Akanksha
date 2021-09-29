package Com.raystech.oop;

public class Traingleshin extends Shapeinherit{
	public int base;
	public int height;
	public Traingleshin () {}
	public Traingleshin (int b,int h) {
	this.base=b;
	this.height=h;
		
	}
	public double area() {
		return (base*height)/2;
	

}
}