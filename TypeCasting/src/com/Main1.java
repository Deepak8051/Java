package com;

import com.Developer.Tester;

public class Main1 {
	static void display(Employee obj) {
		if(obj instanceof Developer) {
			Developer d=(Developer)obj;
			System.out.println("working in "+d.company);
			d.developerApp();
		}
		else if(obj instanceof Tester) {
			Tester t = (Tester)obj;
			System.out.println("Working in "+t.company);
			t.testApp();
		}
	}
	public static void main(String[] args) {
		display(new Developer());
		System.out.println("--------------------");
		//display(new Tester());
		
	}

}
