package com.bridgelabz;

public class Node <T>{
    /*
      Initializing Data and Node using Generics
    */
    T data;
    Node<T> next;
    /*
        Default Constructor
     */
    public Node() {
    }
    /*
       Parameter Constructor
     */
    public Node(T data) {
        this.data = data;
    }
}
