package com.coding.snippets.linkedlist;

/*
 * list1 = 15->22->8->null
   list2 = 7->14->22->null
   Intersection = 22->null
 * */

public class IntersectionOfLinkedList {

	//O(n*m)
	public static <T> SinglyLinkedList<T> intersectionOfLists(SinglyLinkedList<T> lis1, SinglyLinkedList<T> lis2) {

		SinglyLinkedList<T> res = new SinglyLinkedList<T>();
		if (lis1.isListEmpty())
			return res;
		if (lis2.isListEmpty())
			return res;
		Node<T> currentLis1 = lis1.head;
		while (currentLis1 != null) {
			if (contains(lis2, currentLis1.data)) {
				res.insertAtHead(currentLis1.data);
			}
			currentLis1 = currentLis1.next;
		}

		return res;
	}
	
	private static <T> boolean contains(SinglyLinkedList<T> lis2, T data) {
		
		Node<T> currentLis2 = lis2.head;
		
		while(currentLis2 != null) {
			if(currentLis2.data.equals(data)) {
				return true;
			}
			currentLis2 = currentLis2.next;
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> lis1 = new SinglyLinkedList<Integer>();
		lis1.insertAtEnd(15);
		lis1.insertAtEnd(22);
		lis1.insertAtEnd(8);
		lis1.print();
		
		SinglyLinkedList<Integer> lis2 = new SinglyLinkedList<Integer>();
		lis2.insertAtEnd(7);
		lis2.insertAtEnd(14);
		lis2.insertAtEnd(22);
		lis2.print();
		
		SinglyLinkedList<Integer> result = IntersectionOfLinkedList.intersectionOfLists(lis1, lis2);
		result.print();

	}

}
