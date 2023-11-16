package w3resource;

import java.util.ArrayList;

public class AddTwoArrayList {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();

		l1.add("Green");
		l1.add("Orange");
		l1.add("White");
		l1.add("Blue");
		l1.add("Yellow");
		System.out.println("list 1 : "+l1);

		//2nd
		l2.add("Apple");
		l2.add("Banana");
		l2.add("Grapse");
		l2.add("Guava");
		l2.add("Bell");
		System.out.println("list 2 :"+l2);
		ArrayList<String> a = new ArrayList<String>();
		a.addAll(l1);
		a.addAll(l2);
		System.out.println(a);



	}

}
