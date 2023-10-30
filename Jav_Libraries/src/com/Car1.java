package com;

public class Car1 {
	int cost;
	Car1(int cost){
		this.cost=cost;
	}
	@Override
	public boolean equals(Object obj) {//upcastig
		Car1 c = (Car1) obj; //dowcastig
		return this.cost == c.cost; //coparision logic 
	}
	public static void main(String[] args) {
		Car1  a = new Car1(20);
		Car1 b = new Car1(20);
		System.out.println(a.equals(b)); // true
		System.out.println(a.equals(new Car1(20)));
		
		if(a.equals(b)) {
			System.out.println("cost is same");
		}
		else {
			System.out.println("cost is differt");
		}
		
	}

}
