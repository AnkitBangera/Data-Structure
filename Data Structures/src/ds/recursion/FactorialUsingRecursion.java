package ds.recursion;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int i=factorial(5);
		System.out.println(i);
	}

	public static int factorial(int i) {
		if(i>0) {
			return i*factorial(i-1);
			/*int j=i*factorial(i-1);
			return j;*/
		}
		else {
			return 1;
		}
	}

}
/*
factorial(int n)
if(n==0)
	return 1;
n*factorial(n-1)

*/