package ds.Queue;

public class LinearQueueUsingArrays {
	int[] array;
	int first=0;
	int last=-1;
	LinearQueueUsingArrays(int size){
		array=new int[size];
	}
	public void enque(int value)
	{
		if(last==array.length-1)
		{
			System.out.println("The queue is full");
		}
		else {
			array[++last]=value;
		}
	}
	public void deque() {
		if(last==-1||last<first) {
			System.out.println("The queue is empty");
		}
		else{
			for (int i = 0; i < last+1; i++) {
				array[i]=array[i+1];
			}
			last--;
		}
	}
	public void peek() {
		if(last==-1)
		{
			System.out.println("THe queue is empty");
		}
		else {
			System.out.println(array[first]);
		}
	}
	public static void main(String[] args) {
		LinearQueueUsingArrays lqua=new LinearQueueUsingArrays(10);
		lqua.enque(10);
		lqua.peek();
		lqua.enque(20);
		lqua.deque();
		lqua.peek();
		lqua.deque();
		lqua.peek();
	}
}
