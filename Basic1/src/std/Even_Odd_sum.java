package std;
import java.util.Scanner;

public class Even_Odd_sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		int sumeven = 0;
		int sumodd = 0;
		for (int i=0; i<=n; i++) {
			if(i%2==0) {
				sumeven += 1;
			}
				else {
					sumodd += i;
					
					
			}
		}
		System.out.println("sum of even number is:"+sumeven);
		System.out.println("sum of odd number is"+sumodd);
		
		
	}

}
