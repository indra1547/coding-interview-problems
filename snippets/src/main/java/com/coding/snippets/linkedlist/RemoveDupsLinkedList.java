package com.coding.snippets.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupsLinkedList {
	
	//O(n)
	public static <T> void removeDuplicates(SinglyLinkedList<T> list) {

		Node<T> prevNode = list.head;
		Node<T> currentNode = list.head;

		Set<T> visitedNodes = new HashSet<T>();

		if (currentNode.next != null && !list.isListEmpty()) {

			while (currentNode != null) {

				if (visitedNodes.contains(currentNode.data)) {

					prevNode.next = currentNode.next;
					currentNode = currentNode.next;

				} else {
					visitedNodes.add(currentNode.data);
					prevNode = currentNode;
					currentNode = currentNode.next;
				}

			}
		}

	}
	
	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
		sll.insertAtEnd(2);
		sll.insertAtEnd(2);
//		sll.insertAtEnd(4);
//		sll.insertAtEnd(2);
//		sll.insertAtEnd(10);
		sll.print();
		RemoveDupsLinkedList.removeDuplicates(sll);
		sll.print();
	}

}
