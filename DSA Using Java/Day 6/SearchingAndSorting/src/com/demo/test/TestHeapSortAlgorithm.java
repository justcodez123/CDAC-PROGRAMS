package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.HeapSortAlgorithm;

public class TestHeapSortAlgorithm {

	public static void main(String[] args) {
//		int[] arr= {3,7,5,10,9,8,4};
		int[] arr= {21,15,24,11,18,15,7};
		HeapSortAlgorithm.heapSortAscending(arr);
//		HeapSortAlgorithm.heapSortDescending(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("-------------------------------");

	}

}
