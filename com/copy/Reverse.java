package com.cat1.com.copy;

import java.util.ArrayList;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> array = new ArrayList<>();
	        array.add(5);
	        array.add(3);
	        array.add(2);
	        array.add(5);
	        array.add(6);

	        System.out.println("Original List: " + array);
	        for(int i=0,j=array.size()-1;i<j; i++,j--) {
	        	int a=array.get(i);
	        	array.set(i,array.get(j));
	        	array.set(j, a);
	        }
	        System.out.println(array);
	        
	}

}
