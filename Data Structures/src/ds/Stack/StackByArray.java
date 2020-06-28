package ds.Stack;

public class StackByArray {
	int[] array;
	int topOfStack;
	public StackByArray(int size) {
		array=new int[size];
		topOfStack=-1;
	}
	
	public void push(int value) {
		if(isStackFull())
		{
			System.out.println("The Stack is full");
		}
		else {
			array[++topOfStack]=value;
		}
	}
	public void pop() {
		if(isStackEmpty())
		{
			System.out.println("Stack is empty");
		}
		else {
			array[topOfStack--]=0;
		}
	}
	public void peek() {
		if(!isStackEmpty()) {
			System.out.println(array[topOfStack]);
		}
		else {
			System.out.println("The stack is empty");
		}
		
	}
	public void delete() {
		array=null;
	}
	
	public boolean isStackEmpty() {

		if(topOfStack==-1)
		{
			return true;
		}
		else {
			return false;
		}
	
	}
	public void arrayReturn() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public boolean isStackFull() {
		if(topOfStack==array.length-1)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		StackByArray sta=new StackByArray(10);
		sta.push(10);
		sta.push(20);
		sta.pop();
		sta.peek();
		sta.arrayReturn();
		sta.peek();
	}
}
