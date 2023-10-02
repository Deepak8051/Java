package com;

class Tom extends Person {
	@Override
	void walk() {
		System.out.println("tom is walking");
	}
	public static void main(String[] args) {
		Tom t = new Tom();
		t.walk();
	}
	

}
