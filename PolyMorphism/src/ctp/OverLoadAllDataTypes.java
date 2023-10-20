package ctp;

public class OverLoadAllDataTypes {
	void m1(byte a) {
		System.out.println("Byte value:"+a);

	}
	void m1(char E) {
		System.out.println("Char value:"+E);

	}
	void m1(int a) {
		System.out.println("Int value:"+a);

	}
	void m1(float b) {
		System.out.println("float value:"+b);

	}
	void m1(double c) {
		System.out.println("double value:"+c);

	}
	void m1(boolean d) {
		System.out.println("boolean:"+d);

	}
	void m1(short s) {
		System.out.println("short:"+s);

	}
	void m1(long g) {
		System.out.println("long:"+g);

	}
	void sum(int a,int b) {
		System.out.println("long argu value ");
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		OverLoadAllDataTypes v = new OverLoadAllDataTypes();
		v.m1(false);
		v.m1(12);
		v.m1('D');
		v.m1(12.9);
		v.m1(2.9);
		v.m1(123);
		v.m1(768247824);
		v.m1(12);
		v.sum(12, 98);
		
	}

}
