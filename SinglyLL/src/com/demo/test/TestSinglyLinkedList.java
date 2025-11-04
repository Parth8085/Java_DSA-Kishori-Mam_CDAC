package com.demo.test;
import com.demo.service.*;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedLists L1=new SinglyLinkedLists();
		L1.addNode(10);
		L1.addNode(25);
		L1.addNode(11);
		L1.addNode(45);
		L1.addNode(78);
		L1.addNode(32);
		L1.display();
//		L1.addVal(124,10);
//		L1.display();
		L1.deletebyValue(30);
		L1.display();
		L1.deletebyPos(10);
		
		

	}

}
