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
	
	public void append(INode<K> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} 
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void print() {
		INode<K> tmp = head ; 
		while(tmp != null) {
			System.out.print(tmp.getKey()+"->");
			tmp=tmp.getNext();
		}
		System.out.println();
	}
	
	public void insert(INode<K> pNode, INode<K> node, INode<K> nNode) {
		pNode.setNext(node);
		node.setNext(nNode);
	}
	
}
