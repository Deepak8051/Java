package w3resource;

import java.util.ArrayList;

public class Compare {

	public static void main(String[] args) {
		ArrayList<String>  l1 = new ArrayList<String>();
		ArrayList<String>  l2 = new ArrayList<String>();
		l1.add("Apple");
		l1.add("Orange");
		l1.add("Banana");
		
		//adding elements in 2nd list
		l2.add("Apple");
		l2.add("Grapse");
		l2.add("banana");
		
		//compare
		
		boolean isEqual= compareArrayList(l1,l2);
		if(isEqual){
			System.out.println("ArrayList are equal");
			
		}else {
			System.out.println("not equal");
		}
		
		
	}

	private static boolean compareArrayList(ArrayList<String> l1, ArrayList<String> l2) {
	  if(l1.size()!=l2.size()) {
		  
	  
		return false;
	}
	for(int i=0;i<=l1.size();i++) {
		if (!l1.get(i).equals(l2.get(i))) {
			return false;
			
	}

	}
	return true;
	}
}

