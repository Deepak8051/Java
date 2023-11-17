package com;
import java.util.Scanner;

public class Two_Variable {

	public static void main(String[] args) {
		int x,y,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		x= sc.nextInt();
		y= sc.nextInt();
		//t= sc.nextInt();
		System.out.println("before Swapping: "+x+ " " +y);
		t=x;
		x=y;
		y=t;
		System.out.println("After:"+x+ " "+y);
		
		
		
	}

}
