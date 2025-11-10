package com.demo.test;

import com.demo.linkedlists.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList dlist=new DoublyLinkedList();
		dlist.addNode(12);
		dlist.displayData();
		dlist.addNode(15);
		dlist.displayData();
		dlist.addNode(13);
		dlist.displayData();
		dlist.addNode(18);
		dlist.displayData();
		dlist.addNode(19);
		dlist.displayData();
		dlist.addNode(20);
		dlist.displayData();
	
//		dlist.deleteByPosition();
    	dlist.displayData();
		
    	dlist.deleteByPosition(6);
    	dlist.displayData();
		
	}

}
