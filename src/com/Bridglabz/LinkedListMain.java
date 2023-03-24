package com.Bridglabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(56);
        linkedList.add(70);
        linkedList.display();
//        LinkedList<Integer> linkedList1 = new LinkedList<>();
//        linkedList1.push(70);
//        linkedList1.push(30);
//        linkedList1.push(56);
//        linkedList1.display();

        		boolean isInserted = linkedList.insertAfter(56, 30);
		if (isInserted)
			System.out.println("Element inserted successfully!");
		else
			System.out.println("Element not inserted!");
        linkedList.display();
    }
}




