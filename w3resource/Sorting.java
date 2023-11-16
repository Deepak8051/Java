package w3resource;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
			al.add("Green");
			al.add("Yellow");
			al.add("Blue");
			al.add("white");
			al.add("Orange");
			System.out.println(al);
			Collections.sort(al);
			//after sorting 
			System.out.println(al);
		}
	}

