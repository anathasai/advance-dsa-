package com.linkedlist.com;

public class linkedList{

    // Node class to represent each element in the linked list
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    Node head;

    // Constructor to initialize an empty linked list
    public linkedList() {
        this.head = null;
    }

    // 1. Insert at the beginning
    public void inseratbegning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 2. Insert at the end
    public void inseratend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head
        } else {
            Node temp = head;
            while (temp.next != null) { // Traverse to the last node
                temp = temp.next;
            }
            temp.next = newNode; // Append the new node at the end
        }
    }

    // 3. Traverse the list and print elements
    public void traverse() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the linked list
    public static void main(String[] args) {
    	linkedList list = new linkedList();

        // Inserting elements at the beginning
        list.inseratbegning(10);
        list.inseratbegning(20);
        list.inseratbegning(30);

        // Inserting elements at the end
        list.inseratend(40);
        list.inseratend(50);

        // Traverse the list
        System.out.println("Linked List after insertions:");
        list.traverse();
    }
}
