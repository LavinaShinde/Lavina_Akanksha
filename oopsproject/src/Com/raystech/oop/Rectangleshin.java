package Com.raystech.oop;

public class Rectangleshin extends Shapeinherit {
	public int width;
	public int length;
	public Rectangleshin() {}
	
	public Rectangleshin (int l, int w) {
		this.length=l;
		this.width=w;
	}
	public double area() {
		return length*width;
	}

}
