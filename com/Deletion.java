package com.linkedlist.com;
class Node{
	int data;
	Node next;
	Node (int newdata) {
		data=newdata;
		next=null;
	}
}
public class Deletion{
	public static  Node removalLastNode(Node head) {
		if (head==null) 
			return null;
			Node temp=head;
			head=head.next;
			temp=null;
			return head;
			
		
	
	}
	public static void PrintList(Node head) {
		while(head!=null) {
			System.out.println(head.data + "->" );
			head=head.next;
		}
		System.out.println("null");
	}
	public static void main (String[] args) {
		Node head=new Node(1);
		 head.next=new Node(2);
		 head.next.next=new Node(3);
		 head.next.next.next=new Node(4);
		 System.out.println("nefore");
		 PrintList(head);
		 System.out.println();
		 head=removalLastNode(head);
		 PrintList(head);
		 
		
		
	}
	  
}
