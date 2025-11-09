package com.demo.service;

public class MyBinarySearchTree {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data= data;
			this.left=null;
			this.right=null;
		}
	}
	
	public MyBinarySearchTree() {
		this.root=null;
	}
	
	
	
	//INSERT NODE 
	//user input -> key/val
	public void insertNode(int key) {
		root = insertData(root, key);
	}
	private Node insertData(Node root, int key) {
		//everytime we call inserdata func. it will create newNode 
		//if tree is empty or not
		if(root == null) {
			//create newnode inside if block to save memory 
			Node newNode = new Node(key);
			root = newNode;
			return root;
		}
		else {
			if(key < root.data) {
				root.left = insertData(root.left, key);
			}
			else {
				root.right = insertData(root.right, key);
			}
			return root;
		}	
	}
	
	
	//INORDER -> LDR
	public void inorder() {
		inorderTraversal(root);
		System.out.println();
	}
	
	private void inorderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root !=null) {
			inorderTraversal(root.left);
			System.out.print(root.data + " ");
			inorderTraversal(root.right);
		}
	}

	//PREORDER -> DLR
	public void preorder() {
		preorderTraversal(root);
		System.out.println();
	}

	private void preorderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			System.out.print(root.data + " ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
		
	//POSTORDER -> LRD
	public void postorder() {
		postorderTraversal(root);
		System.out.println();
	}

	private void postorderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	//searchBinaryTree
	public boolean searchBinaryTree(int key) {
		return searchBinaryRecursive(root, key);
	}

	private boolean searchBinaryRecursive(Node root, int key) {
		// TODO Auto-generated method stub
		if(root != null) {
			if(root.data == key) {
				System.out.println(root.data + " key found.");
				return true;
			}
			else if(key<root.data) {
				
			}
		}
		
		return false;
	}
	
	//searchBinaryTree non recursive
	
	public boolean searchBinarytreeNonRecursive(int key) {
		return searchBinarytreeNonRecursive(root, key);
}



	private boolean searchBinarytreeNonRecursive(Node root, int key) {
		// TODO Auto-generated method stub
		Node temp = root;
		while(temp != null) {
			if(temp.data == key) {
				System.out.println(key + " found");
				return true;
			}else if(key < temp.data) {
				temp = temp.left;
			}
			else {
				temp = temp.right;
			}
		}
		System.out.println(key +" not found");
		return false;
	}
	
	//delete node
	
	
	
	
	
	}





	
	

























