package com;

public class Tom {
	Tom(){
		this(10);
		System.out.println(1);
		
	}
	  Tom(int x){
		  System.out.println(2);
	  }
	  public static void main(String[] args) {
		System.out.println("Strt");
		Tom t= new Tom();
	}

}
