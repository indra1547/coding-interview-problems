package com.coding.snippets.linkedlist;

/*
 * list1 = 15->22->8->null
   list2 = 7->14->22->null
   Union = 15->22->8->7->14->null
 * 
 * */

public class UnionOfLinkedList {
	
	
	public static <T> SinglyLinkedList<T> unionOfLinkedLists(SinglyLinkedList<T> lis1, SinglyLinkedList<T> lis2) {
		
		if(lis1.isListEmpty()) {
			return lis2;
		}
		if(lis2.isListEmpty()) {
			return lis1;
		}
		
		Node<T> currentLis1 = lis1.head;
		
		while(currentLis1.next != null) {
			
			currentLis1 = currentLis1.next;
		}
		
		currentLis1.next = lis2.head;
		
		RemoveDupsLinkedList.removeDuplicates(lis1); //O(n)
		
		return lis1;
		
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
		
		UnionOfLinkedList.unionOfLinkedLists(lis1, lis2);
		lis1.print();
	}

}
