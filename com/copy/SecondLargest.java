package com.cat1.com.copy;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>array=new ArrayList<>();
		  array.add(5);
	      array.add(3);
	      array.add(2);
	      array.add(4);
	      array.add(6);
	      Collections.sort(array);
	      System.out.println(array);
	      System.out.println(array.get(array.size()-2));
	      //index-size
	      System.out.println(array.get(array.size()-5));
	      

	}

}
