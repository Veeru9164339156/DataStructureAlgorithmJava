package LinkedListpractice;

public class MyStack {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	Node top;
	int size=0;
	public void push(int data) {
		Node n=new Node(data);
		n.next=top;
		top=n;
		size++;
	}
	@Override
	public String toString() {
		StringBuilder str=new StringBuilder("[");
		Node temp=top;
		while(temp!=null) {
			str.append(temp.data);
			if(temp.next!=null) {
				str.append("->");
			}
			temp=temp.next;
		}
		return str.append("]").toString();
	}
	public int pop() {
		if(top==null) {
			System.out.println("Not range");
			return 0;
		}
		int data=top.data;
		top=top.next;
		size--;
		return data;
	}
	public int peek() {
		if(top==null) return 0;
		return top.data;
	}
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
}
