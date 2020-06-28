package ds.LinkedList;

public class SingleLinkedList {
	private class Node {
		Node next;
		Object ele;

		Node(Object ele) {
			this.ele = ele;
		}

		Node(Object ele, Node n) {
			this.ele = ele;
			next = n;
		}
	}

	Node first;
	Node last;
	int count;

	public void add(Object ele) {
		if (first == null) {
			first = new Node(ele);
			last = first;
			count++;
			return;
		}
		last.next = new Node(ele);
		last = last.next;
		count++;
	}

	public int size() {
		return count;
	}

	public void add(Object ele, int index) {
		if (index > size() + 1) {
			throw new IndexOutOfBoundsException("You have entered the position number greater then the node size");
		}
		if (index == 1) {

			first = new Node(ele, first);
			count++;
//			Node p = first;
//			for (int i = 1; i < index; i++) {
//				p = p.next;
//			}
//			p.next = new Node(ele,p.next);
//			count++;
		} else if (index == size() + 1) {
			last.next = new Node(ele);
			last = last.next;
			count++;
		} else {
			Node p = first;
			for (int i = 1; i < index - 1; i++) {
				p = p.next;
			}
			p.next = new Node(ele, p.next);
			count++;
		}
	}

	public Object get(int indexPosition) {
		if (indexPosition > size() || indexPosition < 1) {
			throw new IndexOutOfBoundsException("You have entered the position number greater then the node size");
		} else if (indexPosition == 1) {
			return first.ele;
		} else if (indexPosition == size()) {
			return last.ele;
		}
		Node p = first;
		for (int i = 1; i < indexPosition; i++) {
			p = p.next;
		}
		return p.ele;
	}

	public void printNode() {
		Node p = first;
		System.out.println(p.ele);
		for (int i = 1; i < size(); i++) {
			/*
			 * if(p==last) break;
			 */
			p = p.next;
			System.out.println(p.ele);
		}
	}

	public void delete(int indexPosition) {
		if (indexPosition > size() || indexPosition < 1) {
			throw new IndexOutOfBoundsException("Enter the correct position number");
		} else if (indexPosition == 1) {
			first = first.next;
			count--;
		} else if (indexPosition == size()) {
			Node p = first;
			for (int i = 1; i <= indexPosition - 2; i++) {
				p = p.next;
				if (i == indexPosition - 2) {
					last = p;
					last.next = null;
					System.out.println(p.ele);
					count--;
				}
			}
		} else {
			Node p = first;
			for (int i = 1; i < indexPosition; i++) {
				int u = (int) p.ele;
				// p=p.next;
				if (i == indexPosition - 1) {
					System.out.println(p.next.next.ele);
					p.next = p.next.next;
					System.out.println("p.ele--" + p.ele);
					// System.out.println("p.next.next.ele--"+p.next.next.ele);
					count--;
				} else {
					p = p.next;
				}
			}
		}

	}

	public static void main(String[] args) {
		SingleLinkedList sl = new SingleLinkedList();
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(55, 2);
		sl.add(4);
		sl.add(56, 6);
		sl.add(66, 7);
		sl.add("Ankit",8);
		// System.out.println(sl.get(1));
		sl.printNode();
		System.out.println("-----------------------------");
		sl.delete(4);
		System.out.println("-----------------");
		sl.printNode();
		System.out.println("--------------------------");
		System.out.println(sl.get(2));
		System.out.println("--------------------------");
		System.out.println(sl.size());
	}
}
