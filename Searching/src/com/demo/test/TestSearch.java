package com.demo.test;
import com.demo.service.*;

public class TestSearch {

	public static void main(String[] args) {
		int arr[]= {1,3,5,7,8,9};
		int arr1[]= {10,20,30,40,50,60,70,80,90};
		SearchingService ob=new SearchingService();
		System.out.println(ob.BinaryNonRecursive(arr, 8));
		System.out.println(ob.binaryRecursiveSearch(arr1,30,0,8));
		
//		System.out.println(a);
	

		
	}

}
