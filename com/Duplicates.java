package com.cat1.com;

import java.util.ArrayList;



public class Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(3);
        array.add(2);
        array.add(4);
        array.add(5);

        System.out.println("Original List: " + array);

        ArrayList<Integer> unique = new ArrayList<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (Integer a:array) {
        	if(unique.contains(a)) {
        		if (!duplicates.contains(a)) {
        			duplicates.add(a);
        		}
        	}else {
        		unique.add(a);
        	}
        }

        System.out.println("Duplicate Elements: " + duplicates);
        System.out.println("Duplicate Elements: " + unique);
        
    }
}

