package com.demo.service;

public class SearchingService {
	public int BinaryNonRecursive(int arr[],int search)
	{
		System.out.println("----Non recursive binary search called---");
		int low=0;
		int high=arr.length-1;
		int cnt=0;
		while(low<=high)
		{
			cnt++;
			int mid= (low+high)/2;
			if(arr[mid]==search)
			{
				
				return mid;
				
			}
			else if(search<=mid)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
			System.out.println("These will be the total compraisons" +cnt);
		}
		return -1;
		
	}
	public int binaryRecursiveSearch(int arr1[],int search, int low,int high)
	{
		System.out.println("------Recursive Binary Search called-------");
		if(low<=high)
		{
			int mid=(low+high)/2;
			if(arr1[mid]==search){
				return mid;
				
			}else if(search<=arr1[mid])
			{
				return binaryRecursiveSearch(arr1,search,low,mid-1);
			}else
			{
				return binaryRecursiveSearch(arr1,search,mid+1,high);
			}
		}
		
		return -1;
		
	}
}
