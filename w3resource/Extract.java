package w3resource;

import java.util.ArrayList;
import java.util.List;

public class Extract {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Green");
		al.add("yellow");
		al.add("Orange");
		al.add("Blue");
		List<String> a = al.subList(0, 3);
		System.out.println(a);
		
		
	}

}
