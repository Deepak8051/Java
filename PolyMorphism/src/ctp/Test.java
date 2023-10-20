package ctp;

public class Test {

	
		void m1(char ch) {
			System.out.println("char rag");

		}
	
		void m1(int i) {
			System.out.println("int arg-constructor");

		}
		void m1(int i,int j) {
			System.out.println(i+j);

		}
	    public static void main(String[]args) {
	    	Test t= new Test();
	    	t.m1('g');
	    	t.m1(123);
	    	t.m1(12, 23);
	    	
	    }

	}


