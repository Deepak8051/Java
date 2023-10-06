package com;

public class Student {
	public static int id=101;
	public String name = "Deepak";
	public void study() {
		System.out.println("Studying");
	}
	public static void main(String[] args) {
		System.out.println("id:"+Student.id);
		Student s = new Student();
		System.out.println("Name:"+s.name);
		s.study();
	}





}
