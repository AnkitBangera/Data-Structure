package ds.BinarySearchTree;

public class BinarySearchTreeByLinkedListMain {
	public static void main(String[] args) {

		// Constructor
		BinarySearchTreeUsingLinkedList tree = new BinarySearchTreeUsingLinkedList();

		// Inserting values in BST
		System.out.println("Inserting 10 nodes in Tree");
		tree.insert(100);
		tree.insert(80);
		tree.insert(70);
		tree.insert(90);
		tree.insert(50);
		tree.insert(85);
		tree.insert(95);
		tree.insert(75);

		tree.printTreeGraphically();

		// Searching non-existing value in Tree
		System.out.println("\n\nSearching for value on BST...");
		tree.searchForValue(90);

		// Searching existing value in Tree
		System.out.println("\nSearching for value on BST...");
		tree.searchForValue(60);

		// Deleting Node from Tree
		tree.deleteNodeOfBST(80); // Node does not exists
		tree.printTreeGraphically();

		tree.deleteNodeOfBST(57); // Node is having 0 Child
		tree.printTreeGraphically();

		tree.deleteNodeOfBST(60); // Node is having 1 Child
		tree.printTreeGraphically();

		tree.deleteNodeOfBST(50); // Node is having 2 Child
		tree.printTreeGraphically();

		// Deleting entire Tree tree.deleteTree();

		// Traversing Tree tree.levelOrderTraversal();

	}// end of method

}
