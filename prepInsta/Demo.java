package prepInsta;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(n>0) {
			System.out.println("numberis positive");
		}
		else if (n<0) {
			System.out.println("number is -ve");
			
		}else {
			System.out.println("num is zero");
		}
		

	}

}
