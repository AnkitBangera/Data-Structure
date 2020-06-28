package ds.Stack;

public class StackByLinkedList {
	private class Node{
		public Object ele;
		public Node next;
		Node(Object ele)
		{
			this.ele=ele;
		}
		Node(Object ele,Node next)
		{
			this.ele=ele;
			this.next=next;
		}
	}
	Node head;
	public void push(Object ele) {
		if(head==null)
		head=new Node(ele);
		else
		{
			head=new Node(ele,head);
		}
	}
	public void pop() {
		if(head==null)
		{
			System.out.println("There are no nodes present");
		}
		else {
			head=head.next;
		}
	}
	public void peek() {
		if(head==null)
		{
			System.out.println("There are no nodes present");
		}
		System.out.println(head.ele);
	}
	public static void main(String[] args) {
		StackByLinkedList sbl=new StackByLinkedList();
		sbl.push(10);
		sbl.push(20);
		sbl.push(30);
		sbl.push(40);
		sbl.push(50);
		sbl.push(60);
		sbl.push(70);
		sbl.peek();
		sbl.pop();
		sbl.peek();
		sbl.pop();
		sbl.peek();
	}
}
