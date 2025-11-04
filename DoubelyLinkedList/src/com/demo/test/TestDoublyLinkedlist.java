package com.demo.test;
import com.demo.service.*;

public class TestDoublyLinkedlist {

	public static void main(String[] args) {
		ClassDoubleyLL c1= new ClassDoubleyLL();
		c1.addNode(4);
		System.out.println("------New node added-------");
		c1.displayData();
		c1.addNode(8);
		System.out.println("------New node added-------");
		c1.displayData();
		c1.addNode(11);
		System.out.println("------New node added-------");
		c1.displayData();
		
		
		

	}

}
