package NonLinerDataStructure;

public class BalancedBinaryTree {

	class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	
	Node root;
//Using While loop******************************
//	public boolean add(int data) {
//		Node n=new Node(data);
//		if(root==null) {
//			root=n;
//			return true;
//		}
//		Node temp=rwoot;
//		while(true) {
//			if(data<temp.data) {
//				if(temp.left==null) {
//					temp.left=n;
//					return true;
//					}
//				temp=temp.left;
//			}
//			else if(data>temp.data) {
//				if(temp.right==null) {
//					temp.right=n;
//					return true;
//				}
//				temp=temp.right;
//			}else
//				return false;
//		}
//		
//	}

	public void printInOrder() {
		System.out.println("Inorder");
		inOrder(root);
		System.out.println();
	}

	private void inOrder(Node rt) {
		if(rt==null) {
			return;
		}
			inOrder(rt.left);
			System.out.print(rt.data+" ");
			inOrder(rt.right);
	}

	public void printPreOrder() {
		System.out.println("Preorder");
		preOrder(root);
		System.out.println();
		
	}

	private void preOrder(Node rt) {
		if(rt==null) {
			return;
		}
		System.out.print(rt.data+" ");
			inOrder(rt.left);
			inOrder(rt.right);
		
	}

	public void printPostOrder() {
		System.out.println("PostOrder");
		postOrder(root);
		System.out.println();
		
	}

	private void postOrder(Node rt) {
		if(rt==null) {
			return;
		}
		inOrder(rt.left);
		inOrder(rt.right);
		System.out.print(rt.data+" ");
		
	}

	public int height() {
		int lc=0;
		int rc=0;
		Node temp=root;
		while(temp!=null) {
			lc++;
			temp=temp.left;
		}
		while(temp!=null) {
			rc++;
			temp=temp.right;
		}
		return lc>rc?lc:rc;
	}

	public boolean addUsingRecursion(int data) {
		Node n=new Node(data);
		if(root==null) {
			root=n;
			return true;
		}
		return add(root,n);
	}

	private boolean add(Node root, Node n) {
		if(n.data<root.data) {
			if(root.left==null) {
				root.left=n;
				return true;
			}else {
				return add(root.left,n);
			}	
		}else if(n.data>root.data) {
			if(root.right==null) {
				root.right=n;
				return true;
			}else {
				return add(root.right,n);
			}
		}else
			return false;
	}

	public int heightusingRecusrion() {
		return getheight(root);
	}

	private int getheight(Node root) {
		if(root==null) return 0;
		int left=getheight(root.left);
		int right=getheight(root.right);
		return Math.max(left, right)+1;
	}

	public int noofNodes() {
		return noofNodes(root);
	}

	private int noofNodes(Node root) {
		if(root==null)
		return 0;
		return noofNodes(root.left)+noofNodes(root.right)+1;
	}

	public int noOfleafNodes() {
		
		return noOfleafNodes(root);
	}

	private int noOfleafNodes(Node root) {
		if(root==null) return 0;
		
		if(root.left==null && root.right==null)
			return 1;
		
		return noOfleafNodes(root.left)+noOfleafNodes(root.right);
	}

	public int  minElement() {
		Node temp=root;
		while(temp.left!=null) {
			temp=temp.left;
		}
		return temp.data;
	}

	public int maxElement() {
		Node temp=root;
		while(temp.right!=null) {
			temp=temp.right;
		}
		return temp.data;
	}

	public int sumOfNodes() {
		return sumOfNodes(root);
	}

	private int sumOfNodes(Node rt) {
		if(rt==null) return 0;
		return sumOfNodes(rt.left)+sumOfNodes(rt.right)+rt.data;
	}

	public boolean search(int key) {
		return search(root,key);
	}

	private boolean search(Node rt, int key) {
		if(rt==null)
		return false;
		if(rt.data==key)
			return true;
		if(key<rt.data)
			return search(rt.left,key);
		else
			return search(rt.right,key);
	}

	public void printLevelOrder() {
		
		
	}

//	public void delete(int key) {
//		root=delete(root,key);
//	}

//	private Node delete(Node rt, int key) {
//		if(rt==null) return null;
//		if(key<rt.data)rt.left=delete(rt.left, key);
//		if(key>rt.data)rt.right=delete(rt.right, key);
//		else {
//			if(rt.right==null)
//				return rt.left;
//			if(rt.left==null)
//				return rt.right;
//			
//			int min=minValue(rt.right);
//		}
//	} 
}
