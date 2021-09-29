package com.exercise1;

public class Fibonacciseries {
public static void main(String[] args) {
	int num1=0;
	int num2=1;
	int sum;
	int total=7;
	System.out.println(num1);
	for(int i=1;i<total;i++) {
		sum=num1+num2;
		System.out.println(num2+",");
		num1=num2;
		num2=sum;
		
	}
	
}
}
