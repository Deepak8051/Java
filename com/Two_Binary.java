package com;

public class Two_Binary {
  static boolean add(String x , String  y) {
	  int num = Integer.parseInt(x ,2);
	  int num1 = Integer.parseInt( y , 2);
	  int sum = num +num1;
	  String result= Integer.toBinaryString(sum);
	  return false;
	  
	  
	  
  }
  
  public static void main(String args[])
  {
      String x = "011011", y = "1010111";

      System.out.print(add(x, y));
  }
}