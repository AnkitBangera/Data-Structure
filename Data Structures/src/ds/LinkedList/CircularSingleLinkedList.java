package ds.LinkedList;

public class CircularSingleLinkedList {
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
		if (size() == 0) {
			first = new Node(ele);
			last = first;
			last.next = first;
			count++;
			return;
		}
		last.next = new Node(ele, last.next);
		last = last.next;
		last.next = first;
		count++;
	}

	public void add(Object ele, int indexPosition) {
		if (indexPosition > size() + 1 || indexPosition < 1)
			throw new IndexOutOfBoundsException("Enter the valid location to enter the node");
		else if (indexPosition == size() + 1) {
			last.next = new Node(ele);
			last = last.next;
			last.next = first;
			count++;

		} else if (indexPosition == 1) {
			first = new Node(ele, first);
			last.next = first;
			count++;
		} else {
			Node p = first;
			for (int i = 1; i < indexPosition - 1; i++) {
				p = p.next;
			}
			p.next = new Node(ele, p.next);
			count++;
		}
	}

	public int size() {
		return count;
	}

	public void delete(int indexPosition) {
		if (indexPosition > size() || indexPosition < 1)
			throw new IndexOutOfBoundsException("Enter the valid location to enter the node");
		else if (indexPosition == 1) {
			first = first.next;
			last.next = first;
			count--;
		} else if (indexPosition == size()) {
			Node p = first;
			for (int i = 1; i < indexPosition - 1; i++) {
				p = p.next;
			}
			p.next = null;
			last = p;
			last.next = first;
			count--;
		} else {
			Node p = first;
			for (int i = 1; i < indexPosition - 1; i++) {
				p = p.next;
			}
			p.next = p.next.next;
			count--;
		}
	}

	public void printList() {
		Node p = first;
		System.out.println(p.ele);
		for (int i = 1; i < size()*2; i++) {
			p = p.next;
			System.out.println(p.ele);
		}
		System.out.println("---------------------------");

	}

	public Object getElement(int indexPosition) {
		if (indexPosition > size() || indexPosition < 1)
			throw new IndexOutOfBoundsException("");
		else if (indexPosition == 1) {
			return first.ele;
		} else if (indexPosition == size()) {
			return last.ele;
		} else {
			Node p = first;
			for (int i = 1; i < indexPosition; i++) {
				p = p.next;
			}
			return p.ele;
		}

	}

	public static void main(String[] args) {
		CircularSingleLinkedList cl = new CircularSingleLinkedList();
		cl.add(1);
		cl.add(2);
		cl.add(3);
		cl.add(4);
		cl.printList();
		cl.add(55, 5);
		cl.printList();
		cl.delete(5);
		cl.printList();
		System.out.println(cl.getElement(4));
	}

}
