package com.Bridglabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    public void push(T Data) {
        Node<T> newNode = new Node<>(Data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head= newNode ;
        }
    }
//    public void add(T data) {
//        Node<T> newNode= new Node<>(data);
//        if(head==null){
//            head=newNode;
//            tail=newNode;
//        }
//        else{
//            tail.next=newNode;
//            tail=newNode;
//        }
//    }

    public void display() {
        Node<T> temp = head;
        while(temp!= null)
        {
            System.out.print(temp.Data + "-> ");
            temp= temp.next;
        }
    }
}
