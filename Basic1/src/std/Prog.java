package std;
//even odd
import java.util.Scanner;

public class Prog {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		if(n%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");
		

	}

}
