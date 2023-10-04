package javabean;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Person p = new Person();
		
		
		System.out.println("Enter the age");
		int age=a.nextInt();
		
	
		
		
		p.setAge(age);
		System.out.println("age:"+p.getAge());

	}

}
