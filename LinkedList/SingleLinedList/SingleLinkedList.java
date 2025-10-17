public class SingleLinkedList {
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}
	Node head;
	public boolean add(int data) {
		Node n=new Node(data);
		if(head==null){
			head=n;
			return true;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
			return true;
		}
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			if(temp.next!=null)
				System.out.print(temp.data+"-->");
			else
				System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void addFirst(int data) {
		Node n=new Node(data);
		n.next=head;
		head=n;
	}
	public int deleteFirst() {
		if(head==null) {
			System.out.println("List is Empty");
			return 0;
		}
		int data=head.data;
		head=head.next;
		return data;	
	}
	public int deleteLast() {
		if(head==null) {
			System.out.println("List is Empty");
			return 0;
		}
		Node temp=head;
		Node prev=null;
		while(temp.next!=null) {
			prev=temp;
			temp=temp.next;
		}
		if(prev==null)
			temp=null;
		
			prev.next=null;
			return temp.data;
	}
	public void add(int data, int index) {
		if(index==0) {
			addFirst(data);
			return;
		}
		
		Node temp=head;
		while(temp.next!=null && index>1) {
			temp=temp.next;
			index--;
		}
		if(temp==null)
			System.out.println("Index Not in the range");
		
		else {
			Node n=new Node(data);
			n.next=temp.next;
			temp.next=n;
		}
	}
	public int delete(int index) {
		if(head==null) {
			System.out.println("List is Empty");
			return -1;
		}
		Node temp=head;
		Node prev=null;
		while(temp.next!=null && index>0) {
			prev=temp;
			temp=temp.next;
			index--;
		}
		if(temp.next==null) {
			System.out.println("Index Out of range");
			return -1;
		}
		int data=temp.data;
		prev.next=temp.next;
		return data;
	}
	public void reverse() {
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	public int size() {
		return size(head);
		}
	private int size(Node start) {
		if(start==null)
		return 0;
		return 1+size(start.next);
	}
	public int getMiddleNode() {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	public boolean hasLoop() {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
