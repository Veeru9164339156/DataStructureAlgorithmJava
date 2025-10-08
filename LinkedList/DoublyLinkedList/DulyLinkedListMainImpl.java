package LinkedListpractice;

public class DulyLinkedListMainImpl {
	public static void main(String[] args) {
		DoublyLinkedList dls=new DoublyLinkedList();
		dls.add(20);
		dls.add(23);
		dls.add(56);
		dls.add(76);
		dls.add(87);
		dls.add(98,2);
		dls.dispaly();
		System.out.println(dls.delete(4));
//		dls.addFirst(56);
//		dls.dispaly();
//		System.out.println();
//		System.out.println(dls.deleteFirst());
//		System.out.println();
//		System.out.println(dls.deleteLast());
		
	}
}
