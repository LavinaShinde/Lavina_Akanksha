package com.exercise1;

public class Revno {
	public static void main(String[] args) {
		int number =345,reverseN=0,reminderN;
		while(number!=0)
		{
			reminderN=number%10;
			reverseN=reverseN*10+reminderN;
			number=number/10;
		}
		System.out.println(reverseN);
		
		}
	}


