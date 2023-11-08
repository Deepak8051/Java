package com;
import java.util.ArrayList;
import java.util.LinkedList;
public class Demo4 {

	public static void main(String[] args) {
		ArrayList x= new ArrayList();
		x.add(10);
		x.add(20);
		LinkedList y= new LinkedList();
		y.add(x);//y.addAll
		y.add(30);
		System.out.println("AL elements : "+x+" Size:" +x.size());
		System.out.println("AL elements : "+y+" Size:" +y.size());
		
   /** 
    * 1. y.addAll(x); -> [10,20,30] -> Size is 3
    * All the objects of one collection is added into another collection 
    * 1 by 1 (sequently).
    * 
    * 2.y.add(x); -> [[10,20],30] -> size is 2
    * All the objects 1 collection is added into another collection 
    * as a single objects
    */

		

	}

}
