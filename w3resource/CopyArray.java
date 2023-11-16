package w3resource;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArray {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		System.out.println("al: "+al);
		ArrayList<String> a = new ArrayList<String>();
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		a.add("E");
		System.out.println("a:"+a);
		Collections.copy(a, al);
		System.out.println("al: "+al);
		System.out.println("a:"+a);
		
		
		

	}

}
