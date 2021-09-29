package Com.raystech.oop;

public class Circle extends Shape {
public int radius ;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
public double area() {
	return 3.14*radius*radius;
	
}
public static void main(String[] args) {
	Circle c = new Circle();
	c.setRadius(6);
	c.setColour("red");
    c.setBorderWidth(12);
	c.area();
	System.out.println(c.getBorderWidth());
	System.out.println(c.getColour());
	//System.out.println(c.getRadius());
	System.out.println(c.area());
//	Shapeinherit s = new Circle();
//	
//	s.area();
//	System.out.println(s.area());

}

}
