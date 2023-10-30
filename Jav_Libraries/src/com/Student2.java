package com;

public class Student2 {
	int age;
	Student2(int age){
		this.age=age;
	}
	@Override
	public boolean equals (Object obj) { // object obj=new Student2(22);
		Student2 s=(Student2)obj;//Downcasting
		return this.age == s.age; //s1.age == s2.age ......22==22 ... true
	}
	public static void main(String[] args) {
		
	
	Student2 s1=  new Student2(22);
	Student2 s2=  new Student2(22);
	System.out.println(s1.equals(s2));
	
	// s1 ...this
	//s2....obj (upcasting refrence) ....s(dowcasted refrence)
	// in the above program upcasting is accicheved only when we call equals

	
	

	}
}
