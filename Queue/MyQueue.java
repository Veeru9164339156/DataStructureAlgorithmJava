package QueImpl;

public class MyQueue {
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
		}
	}
	Node front;
	Node rear;
	int size=0;
	public void enQueue(int data) {
		Node n=new Node(data);
		if(front==null) {
			front=rear=n;
		}else {
			rear.next=n;
			n.prev=rear;
			rear=n;
		}
		size++;
	}
	public int qeQueue() {
		if(front==null) {
			throw new IndexOutOfBoundsException("Queue is Empty");
		}
			size--;
			int data=front.data;
			front=front.next;
			front.prev=null;
		
		return data;
	}
	public void display() {
		Node temp=front;
		while(temp!=null) {
			System.out.print(temp.data);
			if(temp.next!=null) {
				System.out.print("<==>");
			}
			temp=temp.next;
		}	
	}
	public int size() {
		
		return size;
	}
	
	
}
