package com;

import java.util.Vector;

public class Solution {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(1.2);
		v.add("Deepak");
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		System.out.println("*********************");
		for(int i=v.size()-1;i>0;i--) {
			System.out.println(v.get(i));
		}

	}


}
