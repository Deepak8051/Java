package ctp;

public class Main {

	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.purchase("Samsung");
		a.purchase(23000);
		a.purchase(12000, "samsung");
		a.purchase("samsung", 12000);
	}

}
