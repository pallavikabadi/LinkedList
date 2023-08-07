package com.bridgelabz;

public class LinkedList <T>{
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        /*
         * New Node is created in the Linked list
         */
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            /*
             *head and tail is new node.
             */
            head = newNode;
            tail = newNode;
        } else {
            /*
             * if head is not equal to null, then newNode.next will be head And head is New node.
             */
            newNode.next = head;
            head = newNode;
        }
    }
    public void display() {
        /*
        Methode for Display the linked list
         */
        Node<T> temp = head;;
        while (temp != null) {
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println();

    }
    public void append(T data) {

        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;

        }
    }
}
