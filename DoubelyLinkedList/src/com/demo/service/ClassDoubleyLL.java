package com.demo.service;

public class ClassDoubleyLL {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node prev;
	
		public Node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
		
	}
	public ClassDoubleyLL()
	{
		head=null;
		
	}
	public void addAtPosition(int val,int pos)
	{
		Node newNode=new Node(val);
		if(pos==1)
		{
			if(head!=null)
			{
				newNode.next=head;
				head.prev=newNode;
				head=newNode;
			}
		}
		
			
	}
	public void addNode(int val)
	{
		Node newNode= new Node(val);
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
			newNode.prev=temp;
			temp.next=newNode;
			
			
			
		}
	}
	public void displayData()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"------->");
			temp=temp.next;
			
		}
		System.out.println("null");
		
	}

}
