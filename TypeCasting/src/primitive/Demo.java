package primitive;

public class Demo {
	public static void main(String[] args) {
		//widening
		int a = 15;
		double b=a;
		System.out.println(a+ " "+b);
		
		double c =50;
		System.out.println(c);
		
		char i ='a';
		int j=i;
		System.out.println(i+ " "+j);
		System.out.println("-----------------");
		
		//narrowing
		
		long d =1015418637;
		int g =(int)d;
		System.out.println(g);
		
		double x=35.6;
		int y =(int)x;
		System.out.println(x);
		
		long s  = 1234567891;
		int t=(int)s;
		System.out.println(s);
		
		System.out.println((int)23.78);
		System.out.println((char)68);
		System.out.println("A"+"B");
		System.out.println("A"+'c');
		System.out.println('c'+'c');
		
		
		
	}

}
