package ctp;

public class Amazon {
	void purchase(String product) {
		System.out.println("Product:"+product);

	}
	void purchase(int cost) {
		System.out.println("cost:"+cost);

	}
	void purchase(String product ,int cost) {
		System.out.println("product:"+product+" cost:"+cost);

	}
	void purchase(int cost,String product) {
		System.out.println("cost:"+cost+ " product:"+product);

	}

}
