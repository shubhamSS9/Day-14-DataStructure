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
    public void add(T data) {
        Node<T> newNode= new Node<>(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void display() {
        Node<T> temp = head;
        while(temp!= null)
        {
            System.out.print(temp.Data + "-> ");
            temp= temp.next;
        }
    }

    public void DeleteFirstElement(T deleted_element) {
//        if(head == null)
//        {
//            System.out.println("List is empty");
//        }
        deleted_element= head.Data;
        if(head==tail)
        {
            head=null;

        }
        if(head!=null){
            head=head.next;
        }
        System.out.println();
        System.out.println("deleted element is "+deleted_element);
    }


    public void DeleteLastElement(T Delete_element) {
        Node<T> temp = head;
        Delete_element = tail.Data;
        if (head == null) {
            System.out.println("Lined list is empty");
        }
        if (head == tail) {
            head = null;
        } else {
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            System.out.println();
            System.out.println("Deleted element is " + Delete_element);
        }
    }


    public void search(T search) {
        Node <T> temp = head;
        boolean flag= false;
        while(temp!=null)
        {
            if(temp.Data==search)
            {
                flag=true;
            }
            temp=temp.next;
        }
        if(flag){

            System.out.println("Element found");
        }
        else {
            System.out.println("element not found");

        }
    }

    public void InsertAnywhere(T insert, T search) {
        Node<T> newNode= new Node<>(insert);
        Node<T> temp = head;
        Node<T> temp2 = head;
        while(temp!=null & temp2!=null){
            if(temp.Data==search){
                temp2=temp2.next;
//                System.out.println(temp.Data);  //30
//                System.out.println(temp2.Data);   //70
                temp.next=newNode;
                newNode.next=temp2;
//                newNode.next=temp;
//                temp.next=newNode;
                System.out.println("Data inserted successfully!!");
            }
            temp=temp.next;
            temp2=temp2.next;
        }
    }

    public void getSize() {
        Node<T> temp = head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        System.out.println("Size of the linked list is "+count);
    }



    public void deleteanyelement(T delete) {
        Node<T> temp = head;
        Node<T> temp2 = head;
        Node<T> temp3 = head;
        int count=0;
        while(temp!=null & temp2!=null & temp3!=null){
            count++;
            if(count>2)
            {
                temp3=temp3.next;
            }
            if(temp.Data==delete){
                temp2=temp2.next;
                temp3.next=temp2;
                System.out.println("Data deleted successfully!!");
            }
            temp=temp.next;
            temp2=temp2.next;
        }
    }

}
