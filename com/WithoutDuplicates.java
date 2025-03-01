package com.Hash.com;
java.util.HashSet;
java.util.Set;
java.util.ArrayList;

public class WithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sample list of integers with duplicates
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6);

        // Using a Set to remove duplicates
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Converting the Set back to a List if you need a List without duplicates
        List<Integer> result = new ArrayList<>(uniqueNumbers);

        // Printing the result
        System.out.println("List without duplicates: " + uniqueNumbers);
	}

}
