package com;

public class Example {

	public static void main(String[] args) {
		String s = "Java";
		if(s!=null) {
			System.out.println("Length of "+s+" is "+s.length());
		}
		System.out.println("-----------");
		String x="java";
		try {
			System.out.println("Length of "+s+" is "+s.length());

		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

}
