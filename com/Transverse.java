package com.linkedlist.com;
 class Node{
	 int data;
	 Node next;
	 Node(int newdata){
		 data=newdata;
		 next=null;
		 
	 }
 }
 class Transverse{
	 public static  Node  revrseList(Node head) {
		 Node curr=head,pre=null,next;
		 while (curr !=null) {
			 next=curr.next;
			 curr.next=pre;
			 pre=curr;
			 curr=next;
			 
			 
		 }
		 return pre;
	 }
	 public static  void PrintList(Node node) {
		 while(node!=null) {
			 System.out.println( " " +node.data);
			 node=node.next;
		 }
	 }
	 public static void main(String[] args) {
		 Node head=new Node(1);
		 head.next=new Node(2);
		 head.next.next=new Node(3);
		 head.next.next.next = new Node(4);
	     head.next.next.next.next = new Node(5);
	     System.out.print("Given Linked list:");
	     PrintList(head);
	        
	      head = revrseList(head);

	      System.out.print("\nReversed Linked List:");
	      PrintList(head);
		 
	 }
 }