package NonLinerDataStructure;

public class MyTreeMain {
public static void main(String[] args) {
	MyTree mt=new MyTree();
	mt.root=mt.new Node(28);
	mt.root.left=mt.new Node(56);
	mt.root.right=mt.new Node(76);
	mt.root.left.left=mt.new Node(39);
	mt.root.left.right=mt.new Node(34);
	mt.root.right.left=mt.new Node(26);
	mt.root.right.right=mt.new Node(75);
	mt.printPreOrder();
	System.out.println("*******************************");
	mt.printInOrder();
	System.out.println("*******************************");
	mt.printPostOrder();
	}
}
