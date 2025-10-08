package dsa;

public class SingleLinkedList {
		class Node {
			int data;
			Node next;

			Node(int data) {
				this.data = data;
			}
		}
		Node head;
		void add(int data) {
			Node n = new Node(data);
			if (head == null) {
				head = n;
			} else {
				Node temp = head;
				while (temp.next != null) {
					temp.next = n;
				}
				temp.next = n;
			}
		}
		void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + "-->");
				temp = temp.next;
			}
		}
		public static void main(String[] args) {
			System.out.println("helloo");
			SingleLinkedList sl=new SingleLinkedList();
			sl.add(25);
			sl.add(38);
			sl.add(45);
			sl.add(18);
			sl.display();
		}
}
