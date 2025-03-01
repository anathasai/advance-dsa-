
package com.Hash.com;
import java.util.HashSet;
import java.util.Set;


public class HashSetIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Set<Integer>set1=new HashSet<>();
          set1.add(1);
          set1.add(2);
          set1.add(3);
          set1.add(4);
          set1.add(5);
          set1.add(6);
          Set<Integer>set2=new HashSet<>();
          set1.add(7);
          set1.add(8);
          set1.add(9);
          set1.add(10);
          set1.add(11);
          set1.add(12);
          Set<Integer>union=new HashSet<>(set1);
          union.addAll(set2);
          System.out.println(union);
          Set<Integer>intersection=new HashSet<>(set1);
          
         intersection.retainAll(set2);
         System.out.println(intersection);
          Set<Integer>remove=new HashSet(set1);
          remove.removeAll(set2);
          System.out.println(remove);
          
	}

}
