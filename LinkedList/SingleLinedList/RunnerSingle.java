
public class SingleLinkedListImpl {
public static void main(String[] args) {
	SingleLinkedList sl=new SingleLinkedList();
	sl.add(10);
	sl.add(20);
	sl.add(30);
	sl.add(50);
//	sl.display();
	sl.addFirst(5);
	sl.addFirst(2);
	sl.addFirst(1);
//	sl.display();
//	System.out.println(sl.deleteFirst());
//	System.out.println(sl.deleteFirst());
//	System.out.println(sl.deleteLast());
//	sl.display();
//	sl.add(142,2);
//	sl.add(200,0);
//	System.out.println(sl.delete(2));
//	sl.display();
//	sl.reverse();
	sl.display();
//	System.out.println(sl.size());
	System.out.println(sl.getMiddleNode());
	System.out.println(sl.hasLoop());
	
	
}

}
