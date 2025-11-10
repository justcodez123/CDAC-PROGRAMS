package com.demo.test;

import com.demo.stacks.MyStackList;

public class TestMyStackList {

	public static void main(String[] args) {
	 	 
     MyStackList mstack = new MyStackList();
     
     mstack.push(10);
     mstack.push(25);
     mstack.push(24);
     mstack.push(23);
     mstack.push(28);
     mstack.push(27);
     
     System.out.println("---------------------------------------------");
     System.out.println("Popped : "+mstack.pop());
     System.out.println("Popped : "+mstack.pop());
     System.out.println("Popped : "+mstack.pop());

	}

}
