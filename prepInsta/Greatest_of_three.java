package prepInsta;

import java.util.Scanner;

public class Greatest_of_three {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number of A : ");
		System.out.println("Enter a Number of B :");
		System.out.println("Enter a Number C : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a>c) {
			System.out.println("A is greater");
		} else if(b>a&& b>c) {
			System.out.println("b  is greater");
		} else {
			System.out.println(" c is greater");
		}
		
		

	}

}
