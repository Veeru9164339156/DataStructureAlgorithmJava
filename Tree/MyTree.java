package NonLinerDataStructure;

public class MyTree {

	class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	Node root;
	
	public void printInOrder() {
		System.out.println("Inorder");
		inOrder(root);
		System.out.println();
		
	}
	private void inOrder(Node rt) {
		if(rt==null)
			return ;
		inOrder(rt.left);
		System.out.println(rt.data);
		inOrder(rt.right);
	}
	public void printPreOrder() {
		System.out.println("Preorder");
		preOrder(root);
		System.out.println();
		
	}
	private void preOrder(Node rt) {
		if(rt==null)
			return ;
		System.out.println(rt.data);
		preOrder(rt.left);
		preOrder(rt.right);
	}
	
	public void printPostOrder() {
		System.out.println("Postorder");
		postOrder(root);
		System.out.println();
		
	}
	private void postOrder(Node rt) {
		if(rt==null)
			return ;
		postOrder(rt.left);
		postOrder(rt.right);
		System.out.println(rt.data);
	}
	
	
}
