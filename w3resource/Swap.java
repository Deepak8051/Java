package w3resource;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Orange");
		l.add("Blue");
		l.add("blue");
		l.add("white");
		l.add("Green");
		//before swap
		//System.out.println(l);
		
		for(String a : l) {
		System.out.println(a);
		
		//
		System.out.println("After swap");
		Collections.swap(l, 0, 2);
		for(String b :l) {
		System.out.println(b);
		
		
		
	}
	}
	}
}

