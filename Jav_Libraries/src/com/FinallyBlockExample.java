package com;

public class FinallyBlockExample {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("handled");
		}
		finally {
			System.out.println("Inside finally block");
		}
		System.out.println("end");
	}

}
