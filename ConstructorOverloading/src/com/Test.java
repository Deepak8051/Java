package com;
//the class contain more than one constructor with same name but different in argument is called contructor overloading

public class Test {
	Test(){
		System.out.println("zero argument constructor");
	}
		Test(int i){
			System.out.println("int argument constructor");
			
			
		}
		Test(String s,int a){
			System.out.println(s+ " -------"+a);
			
		}
		public static void main(String[] args) {
			Test t = new Test();
			Test t2 = new Test(123);
			Test t3 = new Test("Deepak",123);
			
		}
	}


