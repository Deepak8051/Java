package com;

public class Employee {
	String company  = "Amazon";
	

}
class Developer extends Employee {
	void developerApp() {
		System.out.println("Developing App");
	}
	class Tester extends Employee{
		void testApp() {
			System.out.println("testing App");
		}
	}
}
