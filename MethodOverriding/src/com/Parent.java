package com;

public class Parent {
	void property() {
		System.out.println("money + land + house");
	}
	void marry() {
		System.out.println("black girl");
	}
}
	 class Child extends Parent{
		@Override
		void marry() {
			System.out.println("marry+white+girl");
			
		}
		 
	};
	
	



