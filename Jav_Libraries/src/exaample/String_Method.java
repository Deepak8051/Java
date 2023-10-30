package exaample;

public class String_Method {

	public static void main(String[] args) {
		String s= "Software Engineer";
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("Soft"));
		System.out.println(s.endsWith("neer"));
		System.out.println(s.indexOf('e'));
		System.out.println(s.charAt(2));
		System.out.println(s.contains("ware"));
		System.out.println(s.trim());

		System.out.println("==============");

		String a="java";
		String b="java";
		String c="JaVa";
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equalsIgnoreCase(c));

		System.out.println("===================");
		String x= "hello World";
		System.out.println(x.substring(2));
		System.out.println(x.substring(7));
		System.out.println(x.substring(2,8));
		System.out.println(x.substring(1,10));


	}

}
