package com.demo.service;

public class DoublyCircularLL {
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
	public DoublyCircularLL()
	{
		head=null;
	}
	public void addNode(int val)
	{
		Node newNode= new Node(val);
		
		if(head==null)
		{
			head=newNode;
			head.prev=head;
			head.next=head;
		}else
		{
			Node temp=head.prev;
			temp.next=head;
			newNode.next=head;
			newNode.prev=temp;
			temp.next=newNode;
			head.prev=newNode;
		}
		
		
		
		
		
	}
	public void DisplayData()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("The list is null");
		}
		else
		{
			do
			{
				System.out.print(temp.data+ "---->");
				temp=temp.next;
			}
			while
				(temp!=head);
			System.out.println();
		}
		
	}

}
