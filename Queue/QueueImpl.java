package QueImpl;
// using linked list
public class QueueImpl {
public static void main(String[] args) {
	MyQueue mq=new MyQueue();
	mq.enQueue(28);
	mq.enQueue(29);
	mq.enQueue(40);
	mq.enQueue(56);
	System.out.println(mq.qeQueue());
	System.out.println(mq.qeQueue());
	mq.display();
	System.out.println(mq.size());
}
}
