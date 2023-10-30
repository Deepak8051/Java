package com;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel h1 = new Hotel("Taj ",4.6);
		Hotel h2 = new Hotel("Pachvati ",4.3);
		Hotel [] h= {h1,h2};
		for(int i=0;i<h.length;i++) { 
			System.out.println(h[i]);
		}
		
		

	}
}
	


