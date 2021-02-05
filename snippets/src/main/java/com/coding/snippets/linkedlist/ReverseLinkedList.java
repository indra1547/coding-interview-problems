package com.coding.snippets.linkedlist;

public class ReverseLinkedList {
	
	public <T>  void reverseLinkedList(SinglyLinkedList<T> list) {
		
		Node currentNode = list.head;
		Node prevNode = null;
		Node nextNode = null;
		
		while(currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;	
		}
		list.head = prevNode;
	}

	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
		
		ReverseLinkedList rev = new ReverseLinkedList();
		sll.insertAtEnd(2);
		sll.insertAtEnd(3);
		sll.insertAtEnd(4);
		sll.insertAtEnd(10);
		sll.insertAfter(4, 5);
		sll.insertAtHead(0);
		sll.print();
		rev.reverseLinkedList(sll);
		sll.print();

	}

}
