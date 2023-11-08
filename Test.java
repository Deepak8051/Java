package com;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		//Iterally a array gets created of defaulat initial capacity(10)
		ArrayList a = new ArrayList();
		
		//Iternally a array gets created of custom initial capacity(20)
		
		
		ArrayList b = new ArrayList(20);
		
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		
		ArrayList y = new ArrayList();
		y.add(30);
		System.out.println(x);//[10,20]
		System.out.println(y);//[10,20,30]
		
		
		
	}

}
