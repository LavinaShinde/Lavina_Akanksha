package Com.raystech.oop;

import java.awt.geom.Area;

public class Shapeinherit {
	private String colour;
	private int borderWidth;

	public String getColour() {
		return colour;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public Shapeinherit() {
	}

	public Shapeinherit(String c, int bw) {
		colour = c;
		borderWidth = bw;

	}

	public double area() {
		return 0.0;

	}

	public static void main(String[] args) {
//		Shapeinherit s =new Circleshin(9);
//		System.out.println("area of circle"+s.area());
//	Shapeinherit s1 =new Rectangleshin(10,20);
//	System.out.println("area of rectangle"+s1.area());
//	Shapeinherit s2= new  Traingleshin(20,40);
//	System.out.println("area of triangle"+s2.area());
		Shapeinherit[] s = new Shapeinherit[3];
		s[0] = new Circleshin(5);
		s[1] = new Rectangleshin(2, 4);
		s[2] = new Traingleshin(5, 5);

		double totalArea = clacArea(s);
		System.out.println("total area is" + totalArea);
		System.out.println("area of circle" + s[0].area());
		System.out.println("aera of rectangle" + s[1].area());
		System.out.println("area of traingle" + s[2].area());
	}

	private static double clacArea(Shapeinherit[] s) {
		double totalArea = 0;
		for (int i = 0; i < s.length; i++) {
			totalArea += s[i].area();
		}

		return totalArea;

	}

}
