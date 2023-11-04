package prepInsta;

import java.util.Scanner;

public class Range_Num_sum {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int sum=0;
		int a=sc.nextInt();
		int b = sc.nextInt();
		for(int i =a; i<=b;i++) {
		sum=sum+i;
		System.out.println(sum);
		}
	}

}
