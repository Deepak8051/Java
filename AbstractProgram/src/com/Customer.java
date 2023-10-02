package com;

public class  Customer extends Paytm {


	@Override
	void purchase() {
		System.out.println("Purchase");
	}
	@Override
	void pay() {
		System.out.println("pay");
	}
	public static void main (String []args) {
		Customer c = new Customer();
		c.pay();
		c.purchase();
	}
}


