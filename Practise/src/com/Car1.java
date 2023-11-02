package com;

public class Car1 extends Vechicle1 {
	@Override
	void start() {
		super.start();;
		System.out.println("car not startt");
		super.start();
	}
	
	

}
