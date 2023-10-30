package com;

public class Student1 {
	int age;
	Student1(int age){
		this.age=age;
	}
	public static void main(String[] args) {
		Student1   s1 =  new Student1(22);
		Student1   s2 =  new Student1(22);
		System.out.println(s1.equals(s2)); //equals () method is use to campare the content
	}

}
