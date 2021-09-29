package Com.raystech.oop;

public class Constructor {
	
	private String colour;
		private int borderWidth;
		public Constructor() {
			
		}
		public Constructor(String colour , int borderWidth) {
			this.colour=colour;
			this.borderWidth = borderWidth;
			
		}
		public int getBorderWidth() {
			return borderWidth;
		}
		public String getColour() {
			return colour;
		}
		public static void main(String[] args) {
			Constructor y = new Constructor("Pink",23);
			System.out.println(y.getBorderWidth());
			System.out.println(y.getColour());
			
		}
		

	}
