package com.Bridglabz;

public class LinkedListMain {
    public static void main(String[] args) {
        SortedLinkedList sortedLinkedList = new SortedLinkedList();
        sortedLinkedList.add(56);
        sortedLinkedList.add(30);
        sortedLinkedList.add(40);
        sortedLinkedList.add(70);
        System.out.println("Before sorting \n");
        sortedLinkedList.display();
        System.out.println();
        System.out.println("After sorting");
        sortedLinkedList.sort();
        sortedLinkedList.display();

    }
}




