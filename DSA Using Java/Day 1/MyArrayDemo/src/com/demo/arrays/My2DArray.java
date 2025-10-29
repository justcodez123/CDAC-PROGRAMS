package com.demo.arrays;
import java.util.*;

public class My2DArray {
	private int [] [] arr;

	public My2DArray() {
		super();
		arr = new int[3][3];
	}
	
	public My2DArray(int r, int c) {
		arr = new int[r][c];
	}
	
	Scanner sc = new Scanner(System.in);
	public void acceptData() {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.println("Enter value at "+ i + " " + j);
				int a = sc.nextInt();
				arr[i][j] = a;
			}
		}
	}
	
	
	public void addArrays(My2DArray arr2d , My2DArray arr2d1) {
		int temp [][] = new int[arr2d.arr.length][arr2d.arr[0].length];
		
		for(int i=0; i<arr2d.arr.length; i++) {
			for(int j=0; j<arr2d.arr[0].length; j++) {
				temp[i][j] = arr2d.arr[i][j] + arr2d1.arr[i][j];
			}
		}
		
		System.out.println("Addtion:");
		for(int i=0; i<arr2d.arr.length; i++) {
			for(int j=0; j<arr2d.arr[0].length; j++) {
				System.out.print(temp[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public void subArrays(My2DArray arr2d , My2DArray arr2d1) {
		int temp [][] = new int[arr2d.arr.length][arr2d.arr[0].length];
		
		for(int i=0; i<arr2d.arr.length; i++) {
			for(int j=0; j<arr2d.arr[0].length; j++) {
				temp[i][j] = arr2d.arr[i][j] - arr2d1.arr[i][j];
			}
		}
		
		System.out.println("Subtraction:");
		for(int i=0; i<arr2d.arr.length; i++) {
			for(int j=0; j<arr2d.arr[0].length; j++) {
				System.out.print(temp[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	
}
