package com.raystech.exception;

public class Exceptionhandling {
	public static void main(String[] args) {
		int a=15;
		int b=0;
		try {
		double d =a/b;
		System.out.println(d);
		
	}catch (ArithmeticException e) {
		System.out.println("Arithematic Exception occurs");
	}
	

}


}
