package Com.raystech.oop;

public class Shapesettergetter {
private String color ;
private int boderwidth ;


public Shapesettergetter() {
	 System.out.println("default Constructor");
}

//public Shapesettergetter(String color, int boderwidth) {
//	String color="yellow";
//	int boderwidth = 34;
//	System.out.println("abcd");
//}

public void setColor(String color) {
	this.color = color;
}
public String getColor() {
	return color;
}


public void setBoderwidth(int boderwidth) {
	this.boderwidth = boderwidth;
}

public int getBoderwidth() {
	return boderwidth;
}
}
//public static void main(String[] args) {
	// Shapesettergetter s = new  Shapesettergetter();
	 //s.setColor("black");
	 //s.setBoderwidth(90);
	 
	 //System.out.println("border"+s.getBoderwidth());
	 //System.out.println("color"+s.getColor());
//}
//}