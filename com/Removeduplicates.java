package com.cat1.com;
import java.util.*;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer>array=new ArrayList<>();
      array.add(5);
      array.add(3);
      array.add(2);
      array.add(4);
      array.add(5);
      System.out.println(array);
      ArrayList<Integer>unique=new ArrayList<>();
      for(Integer a: array) {
    	  if (!unique.contains(a)) {
    		  unique.add(a);
    	  }
    	  
      }
      System.out.println(unique);
      
	}

}
