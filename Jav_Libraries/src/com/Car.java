package com;

public class Car {
	int cost;

	public Car(int cost) {
		
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "cost:" +cost;
		
	}
	


public static void main(String []args) {
	Car c1 = new Car(100);
	Car c2 = new Car(200);
	System.out.println(c1);
	System.out.println(c2);
}
}
