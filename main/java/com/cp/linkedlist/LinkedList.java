package com.cp.linkedlist;

public class LinkedList<K> {
	INode<K> head;
	INode<K> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode<K> node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null) {
			this.head = node;
		} 
		else {
			INode<K> tempNode = this.head;
			this.head = node;
			this.head.setNext(tempNode);
		}
	}	
	
	
	
}
