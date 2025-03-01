package com.linkedlist.com;
A

public class Second {

    // 1. Inner Node class moved outside the main method
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 2. `head` should be an instance variable, not inside the main method
    Node head;

    // Constructor for the Second class
    public Second() {
        this.head = null;
    }

    // Method to insert a node at the beginning
    public void insertBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode; // 3. Fixed: Correctly updating head to point to newNode
    }

    // Method to insert a node at the end
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // 4. Fixed: Correctly set head when the list is empty
        } else {
            Node temp = head;
            while (temp.next != null) { // 5. Fixed: `while (temp.next != null)` ensures correct traversal to the last node
                temp = temp.next;
            }
            temp.next = newNode; // 6. Fixed: Add the new node at the end
        }
    }

    // Method to traverse and print the linked list
    public void traverse() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty."); // 7. Handles empty list case
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next; // Move to the next node
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Second list = new Second();

        // Inserting elements at the beginning
        list.insertBeg(10);
        list.insertBeg(20);
        list.insertBeg(30);

        // Inserting elements at the end
        list.insertEnd(40);
        list.insertEnd(50);

        // Traverse the list
        System.out.println("Linked List after insertions:");
        list.traverse(); // 8. Fixed: Added the call to traverse() to print the list
    }
}

