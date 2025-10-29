package com.demo.test;

import com.demo.arrays.My2DArray;
import com.demo.arrays.MyArray;

public class TestArray {

	public static void main(String[] args) {
//		MyArray ob=new MyArray();
//		System.out.println("capacity : "+ob.getCapacity());
//		ob.add(4);
//		ob.add(7);
//		System.out.println(ob);
//		ob.add(8,1);
//		System.out.println(ob);
//		System.out.println("position of 10 : "+ob.searchByValue(10));
//		ob.add(3);
//		ob.add(5);
//		System.out.println(ob);
//		//ob.deleteByValue(7);
//		//System.out.println(ob);
//		ob.add(1);
//		System.out.println(ob);
//		//ob.deleteByPos(1);
//		//System.out.println(ob);
//		//int[] arr1=ob.exchangeIndexValue();
//		//IntStream.of(arr1).forEach(e->System.out.print(e+","));
//		//arr1=ob.reverseArray(true);
//		//System.out.println(ob);
//		//IntStream.of(arr1).forEach(e->System.out.print(e+","));
//		ob.rotateArray(false, 3);
//		System.out.println(ob);
		
		My2DArray arr2d =new My2DArray();
		My2DArray arr2d1=new My2DArray();
		System.out.println("Enter data for first array:");
		arr2d.acceptData();
		System.out.println("Enter data for second array:");
		arr2d1.acceptData();
		
		arr2d.addArrays(arr2d, arr2d1);
		arr2d.subArrays(arr2d, arr2d1);
		
	}

}
