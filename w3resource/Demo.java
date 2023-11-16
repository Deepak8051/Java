package w3resource;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("Green");
		al.add("yellow");
		al.add("red");
		al.add("Blue");
		al.add("white");
		System.out.println(al);
		
		//method
		
		al.remove("yellow");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		
	}

}
