package com.map.com;


import java.util.TreeMap;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Banana", 2);
        map.put("Apple", 5);
        map.put("Cherry", 3);
        map.put("Mango", 1);
        map.put("Peach", 4);
        //ArrayList<Map.Entry<String,Integer>>anu=new ArrayList<>( map.entrySet());
        
        //Collections.sort(anu);
        System.out.println(map);
	}

}
