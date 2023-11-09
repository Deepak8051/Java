package com;

public class Vechicle {
	double price;
	double mileage;
	String color;
	void display() {
		System.out.println(price);
		System.out.println(mileage);
		System.out.println(color);
	}

}
class Car extends Vechicle{
	String ftype;
	boolean sunroof;
	String brand;
	
}
