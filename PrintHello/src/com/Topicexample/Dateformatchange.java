package com.Topicexample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformatchange {
public static void main(String[] args) throws ParseException {
	Date d = new Date();
    System.out.println(d);
	//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String ss = "12/08/1998";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	//String s = sdf.format(d);
	String s =sdf.format(d);
	Date dd=sdf.parse(ss);
	System.out.println(ss);
	System.out.println(dd);
	
	
}
}
