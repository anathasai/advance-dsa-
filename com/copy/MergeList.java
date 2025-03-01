package com.cat1.com.copy;

import java.util.ArrayList;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>array=new ArrayList<>();
		  array.add(5);
	      array.add(3);
	      array.add(2);
	      array.add(4);
	      array.add(6);
	      array.add(6);
	      
	      ArrayList<Integer>unique=new ArrayList<>();
	      unique.add(5);
	      unique.add(6);
	      unique.add(8);
	      unique.add(9);
	      unique.add(1);
	      ArrayList<Integer>merge=new ArrayList<>(array);
	      for(Integer a:unique){
	    	  if(!merge.contains(a)) {
	    		  merge.add(a);
	    	  }
	      }
	      System.out.println(merge);
	      
	}

}
