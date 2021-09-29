package Com.raystech.oop;

public class Shape {
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	private String colour;
	private int borderWidth;
//	public Shape() {
//		
//	}
//	public Shape(String colour , int borderWidth) {
//		this.colour=colour;
//		this.borderWidth = borderWidth;
//		
//	}
//	public int getBorderWidth() {
//		return borderWidth;
//	}
//	public String getColour() {
//		return colour;
//	}
	public static void main(String[] args) {
		Shape y = new Shape();
		//System.out.println(y.getBorderWidth());
//	System.out.println(y.getColour());
		
	}
//	

}
