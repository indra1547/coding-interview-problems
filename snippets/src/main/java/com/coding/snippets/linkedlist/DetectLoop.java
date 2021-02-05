package com.coding.snippets.linkedlist;

public class DetectLoop {
	
	//Floyd's cycle detection algorithm
	// O(n)
	public static <T> boolean loopExists(SinglyLinkedList<T> list) {
		
		Node slow = list.head;
		Node fast = list.head;
		
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
		sll.insertAtEnd(2);
		sll.insertAtEnd(3);
		sll.insertAtEnd(4);
		sll.insertAtEnd(10);
		sll.insertAfter(4, 5);
		sll.insertAtHead(0);
		sll.print();
		sll.head.next.next = sll.head.next;
		System.out.println(DetectLoop.loopExists(sll));
	}

}
