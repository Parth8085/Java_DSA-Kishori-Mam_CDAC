package com.demo.service;


public class SinglyLinkedLists {
	Node head;
	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	
	}
	public SinglyLinkedLists()
	{
		this.head=null;
		
	}
	
	
	//add value after particular num
	public void addVal(int val,int num)
	{
		Node newNode=new Node(val);
		Node temp=head;
		                                                             
		{
			temp=temp.next;
		}
		
		//now to check the number
		if(temp!=null)
		{
			newNode.next=temp.next;
			temp.next=newNode;
		}
	}
	//adding node in the linked lists we will be adding nodes from the end 
	public void addNode(int val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;	
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			
		}
		
	}
	public void display()
	{
		Node temp=head;
		System.out.println();
		System.out.println("------------Here is my linkedlist display---------");
		if(head==null)
		{
			System.out.println("The list is empty");
		}
		else
		{
			while(temp!=null)
			{
				
				System.out.println(temp.data  + " ");
				temp=temp.next;
				
			}
			
		}
	}
	public void deletebyValue(int val)
	{
		System.out.println();
		System.out.println("Function to delete value at the node");
		Node temp=head;
		if(head.data==val)
		{
			 head=temp.next;
			 temp.next=null;
		}
		else {
			Node prev=null;
			while(temp!=null && temp.data!=val)
			{
				prev=temp;
				temp=temp.next;
			}
			//if value found
			if(temp!=null)
			{
				prev.next=temp.next;
				temp.next=null;
			}
			else
			{
				System.out.println(val + " " +"Not found");
			}
			
		}
	}
	public void deletebyPos(int pos)
	{
		System.out.println();
		System.out.println("To delete it by pos");
	 Node temp=head;
	 if(pos==1)
	 {
		head= temp.next;
		temp.next=null;
	 }
	 else
	 {
		 Node prev=null;
		 for(int i=0;temp!=null && i<pos-1;i++)
		 {
			 prev=temp;
			 temp=temp.next;
			 
		 }
		 if(temp!=null)
		 {
			 prev.next=temp.next;
			 temp.next=null;
		 }
		 else 
		 {
			 System.out.println(pos +" " +"Position not found");
		 }
			
	 }
	}

}
