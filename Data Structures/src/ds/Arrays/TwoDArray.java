package ds.Arrays;

public class TwoDArray {
	int[][] arr = null;

	public TwoDArray(int row, int column) {
		arr = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = Integer.MIN_VALUE;
			}
		}
	}
	public void traversal() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
	public void insert(int row,int col,int value) {
		if(arr[row][col]==Integer.MIN_VALUE&&arr.length>=row&&arr[0].length>=col)
			arr[row][col]=value;
		else
			System.out.println("They is already "+arr[row][col]+" present in that location");
	}
	
	public void search(int row,int col) {
		boolean flag=true;
		if(arr.length>=row&&arr[0].length>=col)
		{
			System.out.println("The value present in that location is"+arr[row][col]); 
			flag=false;
		}
		else{
			System.out.println("You hav entered incorrect location"); 
			flag=false;
		}
		if(flag)
		System.out.println("The value is not present");
	}
	public void delete(int row,int col)
	{
		if(arr.length>=row&&arr[0].length>=col)
		{
			arr[row][col]=Integer.MIN_VALUE;
		}
		else {
			System.out.println("Enter the correct size");
		}
	}
	public static void main(String[] args) {
		TwoDArray td=new TwoDArray(3, 2);
		td.traversal();
//		td.insert(0, 0, 1);
//		td.insert(0, 1, 2);
//		td.insert(0, 2, 3);
//		td.insert(1, 0, 4);
//		td.insert(1, 1, 5);
//		td.insert(1, 2, 6);
//		td.insert(2, 0, 7);
//		td.insert(2, 1, 8);
//		td.insert(2, 2, 9);
//		td.traversal();
		//td.insert(2, 2, 9);
		//td.delete(2, 9);
	//	td.traversal();
	}
	
	
}
