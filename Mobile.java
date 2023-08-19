public class Mobile {
	String brand ;
	String osVersion;
	String ramCapacity;
	
	Mobile() {
		
		this.brand= "OnePlus";
		this.osVersion = "window";
		this.ramCapacity = "4gb" ;
	}
		public static void main(String[]args) {
			  System.out.println("app start") ;
			  		
			  Mobile  m1 = new Mobile();
 System.out.println(m1.brand+" "  +m1.osVersion +m1.ramCapacity);
System.out.println("app end") ;
			  		
			  
	
			  
		
		
	}
	
	

}
