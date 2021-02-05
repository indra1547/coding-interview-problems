package com.coding.snippets.linkedlist;

public class Node<T> {
	
	public Node next;
	public T data;
	
	Node(T data){
		this.data = data;
		this.next = null;
	}

}
