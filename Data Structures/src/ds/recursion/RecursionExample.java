package ds.recursion;

public class RecursionExample {

	public static void main(String[] args) {
		inception(3);
	}

	public static void inception(int i) {
		if(i<1)
		{
			return;
		}
		else
		{
			inception(i-1);
		}
		System.out.println("I am in dream "+i);
	}

}

