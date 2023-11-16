package w3resource;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("Green");
		al.add("Yellow");
		al.add("red");
		System.out.println(al);
		
		//add first position 
		al.add(0,"blue");
		
		//add last position
		al.add(4,"white");
		System.out.println(al);
		//update 2nd position
		
		al.set(2, "Yellow");
		
		//remove 2nd position
		al.remove(2);
		System.out.println(al);
				
		
	
		

	}

}
