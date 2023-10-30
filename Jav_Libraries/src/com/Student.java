package com;

public class Student {
	int age;
	String name;
	public Student(int age, String name) {
	
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name+" is "+age+" years old";
		
	}
 

	public static void main(String[] args) {
		Student s = new Student(20,"Deepak");
		Student s1 = new Student(23,"Tom");
		System.out.println(s);
		System.out.println(s1);
		
	}

}
