package ds.Arrays;

public class Arrays {
	 int[] arr=null;
	 public Arrays(int size) {
		 arr=new int[size];
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=Integer.MIN_VALUE;
		 }
	 }
	 
	 public void traverse()
	 {
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	 }
	 
	 public void insert(int value,int position)
	 {
		 if(arr.length<position)
		 {
			 System.out.println("the position you entered is greater than the array size");
		 }
		 else
		 {
			 if(arr[position]==Integer.MIN_VALUE)
			 {
				 arr[position]=value;
			 }
			 else {
				 System.out.println("You have already entered the value");
			 }
		 }
	 }
	 public void search(int number)
	 {
		 boolean flag=true;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==number)
			 {
				 System.out.println(number +" was found in cell number "+i );
				 flag=false;
				 break;
			 }
		 }
		 if(flag)
		 System.out.println("The number "+number+" doesent exist in the array");
	 }
	 public static void main(String[] args) {
		Arrays arr=new Arrays(10);
		arr.insert(10, 1);
		arr.insert(20, 2);
		arr.insert(30, 3);
		arr.insert(40, 4);
		arr.insert(50, 5);
		arr.insert(60, 6);
		arr.insert(70, 7);
		arr.insert(80, 8);
		arr.insert(90, 9);
		arr.search(100);
		//arr.traverse();
	}

}
