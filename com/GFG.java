package com.linkedlist.com;
class Node{
	int data;
	Node next;
	Node(int newdata){
		data=newdata;
		next=null;
	}
		
	}
    public class GFG{
    	public  static int  countNodes(Node head) {
    		int count=0;
    		Node curr=head;
    		while(curr!=null) {
    			count++;
    			curr=curr.next;
    		}
    		return count;
    	}
    	public static void main(String[] args) {
    		Node head=new Node(1);
    		head.next=new Node(3);
    		head.next.next=new  Node(1);
    		head.next.next.next=new Node(2);
    		head.next.next.next.next=new Node(1);
    		System.out.println("count of node is"+ countNodes(head));
    	}
    	
    }
