package com;

public class Student1 {
	int age;
	String name;
	Student1(int age){
		this.age=age;
		
		
	}
	Student1(int age ,String name){
		this(age);
		this.name=name;
		
	}
	public static void main(String[] args) {
		Student1 s= new Student1(123,"Deepak");
		System.out.println("name:"+s.name);
		System.out.println("age:"+s.age);
		
	}

}
