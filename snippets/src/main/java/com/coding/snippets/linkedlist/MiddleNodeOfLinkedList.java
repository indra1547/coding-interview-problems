package com.coding.snippets.linkedlist;

public class MiddleNodeOfLinkedList {
	
	//O(n)
	public static <T> Object findMiddle(SinglyLinkedList<T> list) {
		
		if(list.isListEmpty()) {
			return null;
		}
		
		Node<T> current = list.head;
		Node<T> middle = list.head;
		
		while(middle != null && current != null && current.next!=null) {
			
			current = current.next.next;
			if(current != null) {
				middle = middle.next;
			}
		}
		
		return middle.data;
	}
	
	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
		sll.insertAtEnd(2);
		sll.insertAtEnd(3);
		sll.insertAtEnd(4);
		sll.insertAtEnd(10);
		sll.insertAfter(4, 5);
		sll.print();
		System.out.println(MiddleNodeOfLinkedList.findMiddle(sll));
	}
		
}
