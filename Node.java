package com.jap.linkedlist;

public class Node {

    // Define the data - Song object that goes into the playlist
    Song data;
    private Node next;
    private Node prev;

    // Define getter methods
    public Song getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    // Define recursive data types to hold values of the next and previous nodes in the linked list.


    // Define a no-arg constructor
    public Node() {
    }

    // Define a parameterized constructor
    public Node(Song data) {
        this.data=data;

    }
}
