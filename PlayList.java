package com.jap.linkedlist;

import java.util.Objects;

public class PlayList {

    // Define the startPtr of the linked list

    Node head;
    int size=0;

    //insert a song at the beginning of the doubly linked list

    public Node insertASong(Song data)
    {
        size++;
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return newNode;
        }
        else
        {
            Node curr;
            for (curr=head;curr.getNext()!=null;curr=curr.getNext());
            curr.setNext(newNode);
        }

        return newNode;
    }

    // count the total number of songs in the playlist
    public int getTheNumberOfSongs(Node current){
        return size;

    }
    // Given the name of a song delete from the play list and return deleted or Nothing to delete message to the user
    public String deleteASong(String song)
    {
        String result=null;

        if (head==null){
            result="Nothing to delete";
            return result;
        }

        if(head!=null)
        {
            Node prev = head;
            for (Node curr = head; curr != null; curr = curr.getNext())
            {
                if (curr.getData().getSongName().equalsIgnoreCase(song))
                {
                    prev.setNext(curr.getNext());
                    result = "song deleted";
                    break;
                }
                else
                {
                    result="Nothing to delete";
                }
                prev = curr;
            }
        }
        return result;
    }

    // specify the direction in which traversal happens and call appropriate methods for forward and reverse traversal
    // of the linked list
    public void traverseThePlayList(Direction direction)
    {
       Direction choice=null;

        if(choice == Direction.Forwdard)
        {
            forwardTraversal();
        }
        else if(choice == Direction.Reverse)
        {
            reverseTraversal();
        }
        else
        {
            System.out.println("Player will shuffle the music");
        }
    }

    // Traverse through the playlist in the forward direction
    private void forwardTraversal()
    {
        if(head!=null)
        {
            for(Node trav = head; trav!= null; trav=trav.getNext())
            {
                System.out.println(trav.getData()+" ");
            }
            System.out.println(" null");
        }
    }

    // Traverse through the play list in the reverse direction
    private void reverseTraversal()
    {
        if(head!=null)
        {
            Node end;
            Node prev;
            for (end = head; end.getNext() != null; end = end.getNext())
            {
                for (Node curr = end; curr != null; curr = curr.getPrev())
                {
                    System.out.print(curr.getData() + " ");
                }
            }
        }
    }

}
