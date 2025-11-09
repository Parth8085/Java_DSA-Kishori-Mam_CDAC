package com.demo.test;

import com.demo.service.MyBinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBinarySearchTree bst= new MyBinarySearchTree();
		bst.insertNode(31);
		bst.insertNode(15);
		bst.insertNode(17);
		bst.insertNode(18);
		bst.insertNode(10);
		bst.insertNode(40);
		bst.insertNode(32);
		bst.insertNode(45);
		bst.insertNode(33);
		
		System.out.println("INORDER ->");
		bst.inorder();
		System.out.println();
		System.out.println("PREORDER -> ");
		bst.preorder();
		System.out.println();
		System.out.println("POSTORDER -> ");
		bst.postorder();
		System.out.println();
		
	}

}
