package LinkedListpractice;

public class DoublyLinkedList {
	 class Node{
		 int data;
		 Node next;
		 Node prev;
		 Node(int data){
			 this.data=data;
		 }
	 }
	 Node head;
	 int size=0;
	public void add(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			size++;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n;
		n.prev=temp;
		size++;
		return ;	
	}
	public void dispaly() {
		if(head==null)
			System.out.println("List is Empty");
		Node t=head;
		while(t!=null) {
			System.out.print(t.data);
			if(t.next!=null) {
				System.out.print("<-->");
			}
			t=t.next;
		}
	}
	public void addFirst(int data) {
		size++;
		Node n=new Node(data);
		n.next=head;
		head.prev=n;
		head=n;
	}
	public int deleteFirst() {
		if(head==null) {
			System.out.println("List is empty");
			return 0;
		}
		size--;
		int data=head.data;
		head=head.next;
		head.prev=null;
		return data;
	}
	public int deleteLast() {
		if(head==null) {
			System.out.println("List is empty");
			return 0;
		}
		size--;
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		if(temp.prev!=null) {
			temp.prev.next=null;
		}
		head=null;
		return temp.data;
	}
	public void add(int data, int index) {
		if(index==0)
		{
			addFirst(data);
			return ;
		}
		Node temp=head;
		while(temp!=null && index>1) {
			temp=temp.next;
			index--;
		}
		if(temp==null) {
			throw new IndexOutOfBoundsException("index not in range");
		}
		Node n=new Node(data);
		n.prev=temp;
		n.next=temp.next;
		temp.next=n;
		if(n.next!=null) {
			n.next.prev=n;
		}
	}
	public int delete(int index) {
		if(index==0) {
			return deleteFirst();
		}
		Node temp=head;
		while(temp!=null && index>0) {
			temp=temp.next;
			index--;
		}
		if(temp==null) {
			throw new IndexOutOfBoundsException("index not in range");
		}
		if(temp.prev!=null)
			temp.prev.next=temp.next;
		
		if(temp.next!=null)
			temp.next.prev=temp.prev;
		return temp.data;
}
}
