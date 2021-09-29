package com.Topicexample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exampleoftime2 {
public static void main(String[] args) {
	Date d= new Date();
	SimpleDateFormat a= new SimpleDateFormat("dd.MM.yyyy");
	String da = a.format(d);
	System.out.println(da);
	String s="12.02.2001";
	System.out.println(s);
}
}
