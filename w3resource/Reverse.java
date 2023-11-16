package w3resource;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Green");
		al.add("Blue");
		al.add("white");
		al.add("white");
		al.add("orange");
		System.out.println("Without reverse:"+al);
		//reverse
		Collections.reverse(al);
		System.out.println("after reverse: "+al);
		
	}

}
