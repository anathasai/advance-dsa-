package dsa;
import java.util.*;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner (System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        for ( int i=0 ; i<n1 ; i++) {
        	a.add(sc.nextInt());
        }
        for (int i=0 ; i<n2 ; i++) {
        	b.add(sc.nextInt());
        }
        for ( int i=0; i<n1-1 ; i++) {
        	for(int j=0 ; j<n1-i-1 ; j++) {
        		if (a.get(j)>a.get(j+1)) {
        			 int tem=a.get(j);
        			a.set(j, a.get(j+1));
        			a.set(j+1, tem);
        		}
        	}
        }
        for ( int i=0; i<n2-1 ; i++) {
        	for(int j=0 ; j<n2-i-1 ; j++) {
        		if (b.get(j)>b.get(j+1)) {
        			 int tem=b.get(j);
        			b.set(j, b.get(j+1));
        			b.set(j+1, tem);
        		}
        	}
        }
        
        //System.out.println(a);
        //System.out.println(b);
        ArrayList<Integer>c=new ArrayList<>(a);
        c.addAll(b);
        for ( int i=0; i<c.size()-1 ; i++) {
        	for(int j=0 ; j<c.size()-i-1 ; j++) {
        		if (c.get(j)>c.get(j+1)) {
        			 int tem=c.get(j);
        			c.set(j, c.get(j+1));
        			c.set(j+1, tem);
        		}
        	}
        }
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

	}

}
