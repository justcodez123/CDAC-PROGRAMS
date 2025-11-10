package com.demo.test;

import com.demo.hashing.MyHashTable;

public class TestMyHashTable {

	public static void main(String[] args) {
		MyHashTable ht=new MyHashTable(5);
		ht.insertData(45);
		ht.insertData(47);
		ht.insertData(2);
		ht.insertData(3);
		ht.insertData(7);
		ht.insertData(21);
		ht.insertData(25);
		ht.insertData(15);
		ht.insertData(12);
		ht.insertData(11);
		ht.insertData(48);
		ht.insertData(55);
		ht.displayHashTable();
		ht.searchData(25);
		ht.searchData(3);
		
	
		
		ht.displayHashTable();
		
		ht.deleteData(48);
		ht.displayHashTable();
		ht.deleteData(11);
		ht.displayHashTable();
		ht.deleteData(21);
		ht.displayHashTable();
		ht.deleteData(7);
		ht.displayHashTable();
		ht.deleteData(100);
		
	

	}

}
