package LinkedListpractice;

public class StackImplMain {
	public static void main(String[] args) {
		MyStack stk=new MyStack();
		stk.push(10);
		stk.push(20);
		stk.push(40);
		stk.push(30);
		stk.push(50);
		System.out.println(stk);
		System.out.println(stk.pop());
		System.out.println(stk.peek());
		System.out.println(stk.size());
	}
}
