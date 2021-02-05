package com.coding.snippets.linkedlist;

public class SinglyLinkedList<T> {
	
	Node head;
	int size;
	
	public SinglyLinkedList() {
		head = null;
		size = 0;
	}
	
	//O(n)
	public void insertAtEnd(T data) {
		
		Node newNode = new Node(data);
		Node ptrNode = head;
		if(isListEmpty()) {
			insertAtHead(data);
			return;
		}
		while(ptrNode.next != null) {
			ptrNode = ptrNode.next;
		}
		ptrNode.next = newNode;
		size++;
		
	}
	
	//O(1)
	public void insertAtHead(T data) {
		
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	//O(n)
	public void insertAfter(T val, T data) {
		
		Node newNode = new Node(data);
		Node ptrNode = head;
		
		while(ptrNode!= null && !ptrNode.data.equals(val)) {
			ptrNode = ptrNode.next;
		}
		if(ptrNode != null) {
			newNode.next = ptrNode.next;
			ptrNode.next = newNode;
			size++;
		}				
	}
	
	public void print() {
		
		if(isListEmpty()) {
			System.out.println("List is Empty!");
			return;
		}
		Node printNode = head;
		while(printNode.next != null) {
			System.out.print(printNode.data + "->");
			printNode = printNode.next;
		}
		System.out.println(printNode.data + "->null");
	}
	
	//O(1)
	public boolean isListEmpty() {
		if(head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	//O(1)
	public int sizeOfList() {
		
		return this.size;
	}
	
	//O(n)
	public void deleteByValue(T data) {
		
		Node currentNode = head;
		Node prev = null;
		
		if(isListEmpty()) {
			return;
		}
		if(currentNode.data.equals(data)) {
			deleteAtHead();
			return;
		}
		
		while(currentNode != null) {
			
			if(data.equals(currentNode.data)) {
				prev.next = currentNode.next;
				size--;
				return;
			}
			prev = currentNode;
			currentNode = currentNode.next;
		}
	}
	
	// O(1)
	public void deleteAtHead() {
		
		if(isListEmpty()) {
			System.out.println("List is empty - Operation is not possible!");
			return;
		}
		head = head.next;
		size--;
	}
	
	//O(n)
	public void deleteAtEnd() {
		
		if(sizeOfList() == 1) {
			head = null;
			size --;
			return;
		}
		if(isListEmpty()) {
			System.out.println("List is empty - Operation is not possible!");
			return;
		}
		Node ptrNode = head;
		Node prev = null;
		while(ptrNode.next != null) {
			prev = ptrNode;
			ptrNode = ptrNode.next;
		}
		prev.next = null;
		size--;
		
	}
	
	//O(n)
	public boolean search(T value) {
		
		if(isListEmpty()) {
			return false;
		}
		Node ptrNode = head;
		while(ptrNode != null) {
			if(ptrNode.data.equals(value)) {
				return true;
			}
			ptrNode = ptrNode.next;
		}
		return false;
	}

	public static void main(String[] args) {
		
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insertAtEnd(2);
		sll.insertAtEnd(3);
		sll.insertAtEnd(4);
		sll.insertAtEnd(10);
		sll.insertAfter(4, 5);
		sll.insertAtHead(0);
		sll.print();
		System.out.println("Value found : " + sll.search(40));
		System.out.println("Size of linked list is "+ sll.sizeOfList());
	}

}
