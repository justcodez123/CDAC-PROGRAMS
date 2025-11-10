package com.demo.beans;

public class MyStackList {
	Node top;
	
	class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			next = null;
		}
		
	}
	
	public MyStackList() {
		super();
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(int val) {
		Node newN = new Node(val);
		if(!isEmpty()) {
			newN.next = top;
		}
		top = newN;
		
	}
	
	public int pop() {
		if(!isEmpty()) {
			Node temp = top;
			top = top.next;
			temp.next = null;
			return temp.data;
		}else {
			System.out.println("Empty Stack" );
			return -1;
		}
	}
	
	
	
}
