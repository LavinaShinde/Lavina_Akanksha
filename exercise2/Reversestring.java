package com.exercise2;

public class Reversestring {
	public static void main(String[] args) {
String n= "vijay";
String r= "";
for(int i=n.length()-1; i>=0; i--)
	r=r+n.charAt(i);
System.out.println(r);
}
}
