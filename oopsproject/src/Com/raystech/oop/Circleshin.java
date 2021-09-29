package Com.raystech.oop;

public class Circleshin extends Shapeinherit {
	public int radius ;
	
public Circleshin() {}
public Circleshin(int r) {
	radius= r;
}
	public int getRadius() {
		return radius;
	}

	public double area() {
		return 3.14*radius*radius;
	}
}
