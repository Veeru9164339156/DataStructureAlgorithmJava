package NonLinerDataStructure;

public class MainBalancedBinaryTreeImpl {
public static void main(String[] args) {
	BalancedBinaryTree bt=new BalancedBinaryTree();
//	bt.add(25);
//	bt.add(18);
//	bt.add(38);
//	bt.add(25);
//	bt.add(22);
//	bt.add(30);
//	bt.add(15);
//	bt.add(41);
//	bt.add(5);
	BalancedBinaryTree bt2=new BalancedBinaryTree();
	bt2.addUsingRecursion(25);
	bt2.addUsingRecursion(18);
	bt2.addUsingRecursion(38);
	bt2.addUsingRecursion(11);
	bt2.addUsingRecursion(22);
	bt2.addUsingRecursion(30);
	bt2.addUsingRecursion(42);
	
//	bt2.printInOrder();
//	bt2.printPreOrder();
//	bt2.printPostOrder();
//	System.out.println(bt2.height());
//	System.out.println(bt2.heightusingRecusrion());
//	System.out.println(bt2.noofNodes());
//	System.out.println(bt2.noOfleafNodes());
//	System.out.println("Minimun Element :"+bt2.minElement());
//	System.out.println("Maximum Element :"+bt2.maxElement());
//	System.out.println("Sum of Nodes :"+bt2.sumOfNodes());
//	System.out.println(bt2.search(18));
//	System.out.println(bt2.search(56));
//	System.out.println(bt2.delete(22));
	
	bt2.printLevelOrder();
	
}
}
