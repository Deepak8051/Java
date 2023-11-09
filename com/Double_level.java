package com;

public class Double_level {
	String name;
	String usn;
	void display(String name,String usn) {
		this.name=name;
		this.usn=usn;
		System.out.println("Details:");
	}

}
class Child1 extends  Double_level{
	String addrress;
	int age;
	void detail(String address,int age) {
		this.addrress=address;
		this.age=age;
		System.out.println();
	}
}
class Son extends Child1{
	double marks = 12.8;
	float value = 343971f;
	void display(double marks,float value)
	{
		this.marks=marks;
		this.value=value;
		System.out.println("son details");
	}
}
