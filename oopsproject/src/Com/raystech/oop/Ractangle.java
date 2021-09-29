package Com.raystech.oop;

public class Ractangle extends Shapeinherit {
public int length;
public int width;
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}

public double area() {
	return length*width;
}

public static void main(String[] args) {
//	Ractangle r= new Ractangle();
// r.setLength(12);
// r.setWidth(10);
//System.out.println("length is"+r.getLength());
//System.out.println("width is"+r.getWidth());
//System.out.println(r.area());
}
}
