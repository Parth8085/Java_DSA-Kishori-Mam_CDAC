package com.demo.aray;

import java.util.Arrays;

public class MyArray {
	private int [] arr;
	private int count;
	
	
	public MyArray() {
		arr = new int[10];
		count =0;
		
	}
	
	public MyArray(int arr[], int count) {
		this.arr=arr;
		this.count=count;
	}
	
	public MyArray(int size) {
		arr=new int[size];
		count=0;
	}
	public int getCapacity() {
		return  arr.length;
	}
	
	public int getSize() {
		return count;
	}
	
	
	//add element at the end 
	public boolean add( int ele) {
		  if(count<arr.length) {
			  arr[count]= ele;
			  count++;
			  return true;
		  }
		  return false;
	}
	
	// add ele at given position
	public boolean add(int arr[], int pos) {
		if(count < arr.length && pos < count) {
			for(int i = count;  )
				
				
		}
		return false;
	}
	
	
	
	//delete by position

	@Override
	public String toString() {
		return "MyArray [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
	}
	
	
	
	

}
