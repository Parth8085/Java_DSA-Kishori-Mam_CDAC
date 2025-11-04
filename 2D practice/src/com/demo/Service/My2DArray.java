package com.demo.Service;

import java.util.Scanner;

public class My2DArray {
	private int arr[][];

	public My2DArray() {
		arr = new int[3][3];
	}

//	public My2DArray(int rows,int cols)
//	{
//		arr=new int[this.rows][this.cols];
//	}
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

	}

	public void displayData() {
		System.out.println("Below are the elements that are printed in the 2D array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}
	}

	public void rotateRow(boolean flag, int val) {
		System.out.println("----Array Rotation-----");
		// up rotation
		if (flag) {
			for (int count = 0; count < val; count++) {
				int temp[] = arr[0];
				for (int i = 0; i < arr.length - 1; i++) {
					arr[i] = arr[i + 1];
				}
				arr[arr.length - 1] = temp;
			}
		}
		else
		{
			for(int count=0;count<val;count++)
			{
				int temp[]=arr[arr.length-1];
				for(int i=arr.length-1;i>0;i--)
				{
					arr[i]=arr[i-1];
				}
				arr[0]=temp;
			}
		}

	}
	public void rotateCol()

}
