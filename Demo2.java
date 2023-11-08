package com;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(12);
		l.add(27);
		l.add(39);
		
		System.out.println(l); //[12,27,39]
		l.add(1,55);
		System.out.println(l);//[12,55,27,39]
		l.add(2,27);
		System.out.println(l);//[12,55,27,39]
		
		
		


	}

}
