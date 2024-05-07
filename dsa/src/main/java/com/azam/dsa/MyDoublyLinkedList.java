package com.azam.dsa;

public class MyDoublyLinkedList {

	Node start;
	Node end;

	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			prev = null;
			next = null;
		}
	}

	// add an element
	public void add(int data) {
		if (start == null) {
			start = new Node(data);
			end = start;
		} else {
			Node temp = new Node(data);
			end.next = temp;
			temp.prev = end;
			end = temp;
		}
	}

	// task addfirst {10,20,30} add 50 so {50,10,20,30} now 50 is first node
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (start == null) {
			start = newNode;
			end = start;
		} else {
			Node temp = start;
			start.prev = newNode;
			start = newNode;
			start.next = temp;
		}
	}

	// task findElement present or not,if present print yes else no
	public boolean findElement(int data) {
		Node current = start;
		while (current != null) {
			if (current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	// delete
	public boolean delete(int data) {
		Node previous = null;
		Node current = start;
		while (current != null) {
			if (current.data == data) {
				if (previous == null) {
					start = current.next;
				} else {
					previous.next = current.next;
					if (current.next!= null) {
                        current.next.prev = previous;
                    }
				}
				return true;
			}
			previous = current;
			current = current.next;
		}
		return false;
	}

	public void print() {
		Node current = start;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	// reversPrint()
	public void revPrint() {
		Node current = end;
		while (current != null) {
			System.out.println(current.data);
			current = current.prev;
		}
	}

	public static void main(String[] args) {
		MyDoublyLinkedList list = new MyDoublyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.addFirst(50);
		list.addFirst(60);
		list.print();
		System.out.println("reverse printing");
		list.revPrint();
		list.delete(10);
		System.out.println("After deleted");
		list.print();
		System.out.println("reverse printing");
		list.revPrint();
	}
}
