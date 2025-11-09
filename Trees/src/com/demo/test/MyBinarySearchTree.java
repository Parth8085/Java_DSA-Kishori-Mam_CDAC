package com.demo.test;

public class MyBinarySearchTree {
	Node root;
	class Node
	{
		int data;
		Node left;
		Node right;
		public Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
			
		}
	}
	public MyBinarySearchTree()
	{
		root=null;
	}
	//insert node
	public void insertNode(int key)
	{
		root=insertData(root,key);
	}
	private Node insertData(Node root, int key) {
		Node newNode= new Node(key);
		if(root==null)
		{
			root=newNode;
			return root;
		}else
		{
			if(key<root.data)
			{
				root.left=insertData(root.left, key);
			}else
			{
				root.right=insertData(root.right, key);
			}
			return root;
		}
		
		
		
	}
	public void inorder()
	{
		inorderTraversal(root);
		System.out.println();
	}
	private void inorderTraversal(Node root) {
		if(root!=null)
		{
			inorderTraversal(root.left);
			System.out.print(root.data+ ", ");
			inorderTraversal(root.right);
		}
		
	}
	public void preorder()
	{
		preorderTraversal(root);
		System.out.println();
	}
	private void preorderTraversal(Node root) {
		if(root!=null)
		{
			System.out.print(root.data+ ", ");
			System.out.println(root.left);
			System.out.println(root.right);
		}
	 
		
	}
	public void postorder()
	{
		postOrderTraversal(root);
		System.out.println();
	}
	private void postOrderTraversal(Node root) {
		if(root!=null)
		{
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data+ ", ");		
			}
		
	   
		
	}
	
	

}
