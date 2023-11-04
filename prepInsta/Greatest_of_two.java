package prepInsta;

import java.util.Scanner;

public class Greatest_of_two {

	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a number");
			System.out.println("Enter a number of A:");
			int a=sc.nextInt();
			System.out.println("Enter a number of B:");
			int b= sc.nextInt();
			if(a>b) {
				System.out.println("A is greater");
			}else {
				System.out.println("B is greater");
			}

	}

}
