package ds.Practice;

import java.util.LinkedList;
import java.util.Queue;

import ds.BinaryTree.BinaryNode;

public class BinaryTreeByLinkedListImplementation {/*
													 * 
													 * BinaryNode root;
													 * 
													 * public BinaryTreeByLinkedListImplementation() { this.root = null;
													 * }
													 * 
													 * public void insert(int value) { BinaryNode node = new
													 * BinaryNode(); node.setValue(value); if (root == null) { root =
													 * node; System.out.println("Root Node Inserted successfully");
													 * return; } Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
													 * queue.add(root); while (!queue.isEmpty()) { BinaryNode
													 * presentNode = queue.remove(); if (presentNode.getLeft() == null)
													 * { presentNode.setLeft(node);
													 * System.out.println("Successfully inserted node to the left"); }
													 * else if (presentNode.getRight() == null) {
													 * presentNode.setRight(node);
													 * System.out.println("Successfully inserted node to the right"); }
													 * else { queue.add(presentNode.getLeft());
													 * queue.add(presentNode.getRight()); }
													 * 
													 * }
													 * 
													 * }
													 * 
													 * public void levelOrder() { Queue<BinaryNode> queue=new
													 * LinkedList<BinaryNode>(); queue.add(root);
													 * while(!queue.isEmpty()) { BinaryNode presentNode=queue.remove();
													 * System.out.println(presentNode.getValue());
													 * if(presentNode.getLeft()!=null) {
													 * queue.add(presentNode.getLeft()); }
													 * if(presentNode.getRight()!=null) {
													 * queue.add(presentNode.getRight()); } }
													 * 
													 * }
													 * 
													 * public void preOrder(BinaryNode node) { if (node==null) { return;
													 * } System.out.println(node.getValue()+" ");
													 * preOrder(node.getLeft()); preOrder(node.getRight()); }
													 * 
													 * public void postOrder(BinaryNode node) { if(node==null) return;
													 * postOrder(node.getLeft()); postOrder(node.getRight());
													 * System.out.println(node.getValue()+" "); } public void
													 * inOrder(BinaryNode node) { if(node==null) return;
													 * inOrder(node.getLeft()); System.out.println(node.getValue()+" ");
													 * inOrder(node.getRight()); } public void search(int value) {
													 * Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
													 * queue.add(root); while(!queue.isEmpty()) { BinaryNode present =
													 * queue.remove(); if(present.getValue()==value) {
													 * System.out.println(value+ "is found in the tree"); return; }
													 * if(present.getLeft()!=null) { queue.add(present.getLeft()); }
													 * if(present.getRight()!=null) { queue.add(present.getRight()); } }
													 * System.out.println("Value not found"); } public void
													 * deleteNode(int value) { Queue<BinaryNode> queue=new
													 * LinkedList<BinaryNode>(); queue.add(root);
													 * while(!queue.isEmpty()) { BinaryNode presentNode=queue.remove();
													 * if(presentNode.getValue()==value) {
													 * presentNode.setValue(getDeepestNode().getValue()); DeepestNode();
													 * System.out.println("Successfully deleted "+value); return; }
													 * if(presentNode.getLeft()!=null) {
													 * queue.add(presentNode.getLeft()); }
													 * if(presentNode.getRight()!=null) {
													 * queue.add(presentNode.getRight()); } }
													 * System.out.println("Not found"); }
													 * 
													 * public void DeepestNode() { Queue<BinaryNode> queue=new
													 * LinkedList<BinaryNode>(); queue.add(root); BinaryNode
													 * previousNode,presentNode=null; while (!queue.isEmpty()) {
													 * previousNode=presentNode; presentNode=queue.remove();
													 * if(presentNode.getLeft()==null) {
													 * presentNode.setValue(previousNode.getValue()); return; }
													 * if(presentNode.getRight()==null) {
													 * presentNode.setValue(previousNode.getValue()); return; } } }
													 * 
													 * public BinaryNode getDeepestNode() { Queue<BinaryNode> queue=new
													 * LinkedList<BinaryNode>(); queue.add(root); BinaryNode
													 * presentNode=null; while (!queue.isEmpty()) {
													 * presentNode=queue.remove(); if(presentNode.getLeft()!=null) {
													 * queue.add(presentNode.getLeft()); }
													 * if(presentNode.getRight()!=null) {
													 * queue.add(presentNode.getRight()); }
													 * 
													 * } return presentNode; }
													 * 
													 */
	BinaryNode root;

	BinaryTreeByLinkedListImplementation() {
		this.root = null;
	}
	
	public void insert(BinaryNode node) {
		if(root==null) {
			root=node;
			System.out.println("Successfully inserted root node");
			return;
		}
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentNode=queue.remove();
			if(presentNode.getLeft()==null)
			{
				presentNode.setLeft(node);
				System.out.println("Inserted successfully to the left: "+node.getValue());
				return;
			}
			else if(presentNode.getRight()==null) {
				presentNode.setRight(node);
				System.out.println("Inserted successfully to the left: "+node.getValue());
				return;
			}
			else {
				queue.add(presentNode.getLeft());
				queue.add(presentNode.getRight());
			}
		}
	}
	
	public void levelOrder() {
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentNode=queue.remove();
			System.out.println(presentNode.getValue()+" ");
			if(presentNode.getLeft()!=null)
			{
				queue.add(presentNode.getLeft());
			}
			if(presentNode.getRight()!=null)
			{
				queue.add(presentNode.getRight());
			}
		}
	}
	public void preOrder() {
		
	}
}
