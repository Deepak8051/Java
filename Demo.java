package com;


import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		l.add(10);
		l.add(15);
		l.add(true);
		l.add(15);
		l.add(null);
		l.add("java");

		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(1));
		System.out.println(l.contains("Java"));
		System.out.println("------------");
		System.out.println(1);
		l.remove(1);
		System.out.println(1);
		System.out.println("--------------");
		
		System.out.println(l.isEmpty());
		l.clear();
		System.out.println(l.isEmpty());




	}

}
