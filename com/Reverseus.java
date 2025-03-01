package com.cat1.com;
import java.util.Collections;

import java.util.ArrayList;

public class Reverseus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(3);
        array.add(2);
        array.add(5);
        array.add(6);

        System.out.println("Original List: " + array);
        Collections.reverse(array);
        System.out.println(array);
        
	}

}
