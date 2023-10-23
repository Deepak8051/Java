package com;

public class Solution {
	//Generalization or Upcasting 
	//1. Vechicle obj=new Car(); 
	


		static void display(Vechicle obj) {
			if(obj instanceof Car) {
				System.out.println("DownCasting to car");
				Car c= (Car) obj;
				System.out.println(c.brand+ " "+c.fuel);
				
			}
			else if(obj instanceof Bike) {
				System.out.println("Downcasting to bike");
				Bike b = (Bike)obj;
				System.out.println(b.brand+ " "+b.color);
			}
			
		
		 

	}
		public static void main(String[] args) {
			display(new Car());
			System.out.println("------------------");
			display(new Bike());
		}

}
