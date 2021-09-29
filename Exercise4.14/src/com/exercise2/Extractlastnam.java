package com.exercise2;

public class Extractlastnam {
public static void main(String[] args) {
String s= "lavina shinde";
String s1[]=s.split(" ");
//System.out.println("first name = "+s1[0]);
System.out.println(s1[s1.length-1]);
}
}
