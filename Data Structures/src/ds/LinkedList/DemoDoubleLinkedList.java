package ds.LinkedList;


public class DemoDoubleLinkedList {

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
		public void add(Object ele) {
			if (first == null) {
				first = new Node(ele);
				last = first;
				first.next = last;
				last.previous = first;
				middle=first;
				midPositionCounter++;
				count++;
				return;
			}
			if(midPositionCounter>2)
			{
				middle=middle.next;
				midPositionCounter=0;
			}
			last.next = new Node(ele, null, last);
			last = last.next;
			midPositionCounter++;
			count++;
		}

		public void add(Object ele, int indexPosition) {
			if (indexPosition > size() + 1 || indexPosition < 1) {
				throw new IndexOutOfBoundsException("Position greater than size");
			} else if (indexPosition == 1) {
				Node p = first;
				first = new Node(ele, first, null);
				p.previous = first;
				count++;
				if(midPositionCounter>2)
				{
					middle=middle.previous;
					midPositionCounter=0;
				}
				midPositionCounter++;
			} else if (indexPosition == size() + 1) {
				last.next = new Node(ele, null, last);
				last = last.next;
				count++;
				if(midPositionCounter>2)
				{
					middle=middle.next;
					midPositionCounter=0;
				}
				midPositionCounter++;
			} else {
				Node p=null;
				boolean flag=false;
				if(indexPosition<=size()/2) {
					flag=true;
					p = first;
					indexPosition=indexPosition - 1;
				}
				else if(indexPosition==size()/2)
				{
					if(size()%2==0)
					{
						flag=true;
						p = first;
					}
					else {
						flag=true;
						p = first;
						indexPosition=indexPosition - 1;
					}
				}
				else
				{
					if(size()%2==0)
					indexPosition=(size()+2)-indexPosition;
					else {
						indexPosition=size()-indexPosition+2;
					}
					p=last;
				}
				for (int i = 1; i < indexPosition; i++) {
					if(flag)
						p = p.next;
					else 
						p=p.previous;
					
				}
				p.next = new Node(ele, p.next, p);
				p.next.next.previous=p.next;
				count++;
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
			Node p=last;
			System.out.println(p.ele);
			for(int i = 1;i<size();i++)
			{
				p=p.previous;
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
			DoubleLinkedList dl=new DoubleLinkedList();
			dl.add(1);
			dl.add(2);
			dl.add(3);
			dl.add(4);
			dl.add(5);
			dl.add(6);
			dl.add(7);
			dl.printElement();
			//dl.add(555,3);
			//dl.printElement();
			//dl.add(444, 4);
			//dl.add(555, 4);
			dl.add(666, 5);
			/*dl.add(17,1);
			dl.add(18,8);
			dl.add(19, 4);
			dl.add(11,1);
			dl.add(4, 4);
			dl.add(99, 11);
			dl.add(78, 4);*/
			dl.printElement();
			dl.printReverse();
			System.out.println("---------------------------------");
			System.out.println(dl.size());
		}
	

}
