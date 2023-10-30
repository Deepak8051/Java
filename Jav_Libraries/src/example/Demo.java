package example;

public class Demo {

	public static void main(String[] args) {
		String s1= new String("Java");
		System.out.println(s1);
		s1.concat("Program");
		System.out.println(s1);
		System.out.println("------------");

		String s2 = new String("java");
		System.out.println(s2);
		s2=s2.concat("program");
		System.out.println(s2);
		System.out.println("--------");

		StringBuffer s3 = new StringBuffer("Good");
		System.out.println(s3);
		s3.append("afternoon");
		System.out.println(s3);
		System.out.println("------------");

		StringBuilder s4 = new StringBuilder("wake");
		System.out.println(s4);
		s4.append(s4);
		s4.append("up");
		System.out.println(s4);
		System.out.println("------------");

		String s5 = new String("Dabba");
		System.out.println(s5);
		s5=s5.concat("fellows");
		System.out.println(s5);
		
		
		/////
		
		String x= "hello";
		System.out.println(x+ " "+x.length());
		x.concat(" world");
		System.out.println(x+ " "+x.length());
		x=x.concat("    world");
		System.out.println(x+" "+x.length());





	}

}
