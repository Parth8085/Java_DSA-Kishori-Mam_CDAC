package com.demo.test;

import java.io.BufferedInputStream;
import java.util.stream.IntStream;

import com.demo.service.BubbleSortService;

public class SortTest {

	public static void main(String[] args) {
	int arr[]= {1045,779,12,60,25,14};
//	BubbleSortService.SortBubble(arr);
	BubbleSortService.InsertionSort(arr);
//	IntStream.of(arr).forEach(e->System.out.print(e+"\t"));
	IntStream.of(arr).forEach(e->System.out.print(e+"\t"));



	}

}
