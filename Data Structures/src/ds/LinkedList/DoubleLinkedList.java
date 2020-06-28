package ds.LinkedList;

public class DoubleLinkedList {
	private class Node {
		Node next;
		Node previous;
		Object ele;

		Node(Object ele) {
			this.ele = ele;
		}

		Node(Object ele, Node next, Node previous) {
			this.ele = ele;
			this.next = next;
			this.previous = previous;
		}
	}

	Node first;
	Node last;
	Node middle;
	int count;
	int midPositionCounter;
	int midPosition;

	public void add(Object ele) {
		if (first == null) {
			first = new Node(ele);
			last = first;
			first.next = last;
			last.previous = first;
			middle = first;
			midPositionCounter++;
			count++;
			return;
		}
		last.next = new Node(ele, null, last);
		last = last.next;
		count++;
		if (midPositionCounter >=2) {
			middle = middle.next;
			midPositionCounter = 0;
		}
		midPositionCounter++;
	}

	public void add(Object ele, int indexPosition) {
		if (indexPosition > size() + 1 || indexPosition < 1) {
			throw new IndexOutOfBoundsException("Position greater than size");
		} else if (indexPosition == 1) {
			Node p = first;
			first = new Node(ele, first, null);
			p.previous = first;
			count++;
			if (midPositionCounter >=2) {
				middle = middle.previous;
				midPositionCounter = 0;
			}
			midPositionCounter++;
		} else if (indexPosition == size() + 1) {
			last.next = new Node(ele, null, last);
			last = last.next;
			count++;
			if (midPositionCounter >=2) {
				middle = middle.next;
				midPositionCounter = 0;
			}
			midPositionCounter++;
		} else {
			Node p = null;
			boolean flag = false;
			boolean previousFlag = false;
			if (indexPosition <= size() / 2) {
				midPosition= size() / 2;
				if (indexPosition <= midPosition / 2) {
					flag = true;
					p = first;
					indexPosition = indexPosition - 1;
				} else {
/*					midPosition = size() / 2;
					if (midPosition % 2 == 0)
						indexPosition = (size() + 2) - indexPosition;
					else {
						indexPosition = size() - indexPosition + 2;
					}*/
					previousFlag=true;
					if(size()%2==0)
					indexPosition=midPosition-indexPosition+2;
					else
					indexPosition=midPosition-indexPosition+3;

					p = middle;
					flag = false;
				}
			} else if (indexPosition == size() / 2) {
				if (size() % 2 == 0) {
					flag = true;
					p = first;
				} else {
					flag = true;
					p = first;
					indexPosition = indexPosition - 1;
				}
			} else {
				if (indexPosition <= size()-(size() / 4)) {
					flag = true;
					p = middle;
					if(size()%2==0)
					indexPosition = indexPosition-size()/2 ;
					else
					indexPosition = indexPosition-size()/2-1 ;
				} else {
					if (size() % 2 == 0)
						indexPosition = (size() + 2) - indexPosition;
					else {
						indexPosition = size() - indexPosition + 2;
					}
					p = last;
				}
			}
			for (int i = 1; i < indexPosition; i++) {
				if (flag)
					p = p.next;
				else
					p = p.previous;
			}
			if(!previousFlag)
			{
			p.next = new Node(ele, p.next, p);
			p.next.next.previous = p.next;
			count++;
			}
			else {
				p.next = new Node(ele, p.next, p);
				p.next.next.previous = p.next;
				count++;
			}
			if (midPositionCounter >=2) {
				if(indexPosition<size()/2)
					middle = middle.previous;
				else
					middle=middle.next;
				midPositionCounter = 0;
			}
			midPositionCounter++;
		}
	}

	public int size() {
		return count;
	}

	public void delete(int indexPosition) {
		if (indexPosition > size() + 1 || indexPosition < 1) {
			throw new IndexOutOfBoundsException("Location doesent exist");
		} else if (indexPosition == 1) {
			first = first.next;
			first.previous = null;
			count--;
		} else if (indexPosition == size()) {
			last = last.previous;
			last.next = null;
			count--;
		} else {
			Node p = first;
			for (int i = 1; i < indexPosition - 1; i++) {
				p = p.next;
			}
			p.next = p.next.next;
			p.next.previous = p;
			count--;
		}
	}

	public void printReverse() {
		Node p = last;
		System.out.println(p.ele);
		for (int i = 1; i < size(); i++) {
			p = p.previous;
			System.out.println(p.ele);
		}
		System.out.println("------------------------------------");
	}

	public void printElement() {
		Node p = first;
		System.out.println(p.ele);
		for (int i = 1; i < size(); i++) {
			p = p.next;
			System.out.println(p.ele);
		}
		System.out.println("------------------------------------");
	}

	public static void main(String[] args) {
		DoubleLinkedList dl = new DoubleLinkedList();
		dl.add(1);
		dl.add(2);
		dl.add(3);
		dl.add(4);
		dl.add(5);
		dl.add(6);
		dl.add(7);
		dl.add(8);
		dl.add(9);
		dl.add(10);
		dl.add(11);
		dl.add(12);
		dl.add(13);
		dl.add(14);
		dl.add(15);
		dl.printElement();
		// dl.add(555,3);
		// dl.printElement();
		 dl.add(444,6);
		 dl.add(444,14); 
		// dl.add(555, 4);
		//dl.add(666, 5);
		/*
		 * dl.add(17,1); dl.add(18,8); dl.add(19, 4); dl.add(11,1); dl.add(4, 4);
		 * dl.add(99, 11); dl.add(78, 4);
		 */
		dl.printElement();
		//dl.printReverse();
		System.out.println("---------------------------------");
		System.out.println(dl.middle.ele);
	}
}
