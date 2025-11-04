package com.demo.service;

import java.util.Arrays;

public class BubbleSortService {
	public static void SortBubble(int[] arr)
	{
		System.out.println("--------This will be the BubbleSort------");
		for (int i=0;i<arr.length;i++)   //to traverse through array
		{
			for(int j=1;j<arr.length-i;j++)  //this to compare each element with its consecutive
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
		
			}			
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("---------Here are the sorted elements from the Bubble Sort--------");
	
	}
	public static void InsertionSort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			int key=arr[i];
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
			
		}
		System.out.println("---------This will be sorted from insertion sort-------");
		
		
	}

}
