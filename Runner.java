package com;

import java.util.ArrayList;
import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20);
		LinkedList ll= new LinkedList();
		ll.addAll(al);
		ll.add(30);

		System.out.println(ll.containsAll(al));
		System.out.println(ll);
		ll.removeAll(al);
		System.out.println(ll);

		System.out.println("------------------");




	}

}
