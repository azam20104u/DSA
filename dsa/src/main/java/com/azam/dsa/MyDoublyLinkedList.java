package com.azam.dsa;

import com.azam.dsa.MyDoublyLinkedList.Node;

public class MyDoublyLinkedList {

	Node start;
	Node end;
	int size;

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
		size++;
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
		size++;
	}

	// task findElement present or not,if present print yes else no
	public Node findElement(int data) {
		Node current = start;
		while (current != null) {
			if (current.data == data) {
				return current;
			}
			current = current.next;
		}
		return null;
	}

	// delete
	public boolean delete(int data) {
		Node element = findElement(data);
		if (element != null) {
			Node prev = element.prev;
			Node next = element.next;
			if (prev != null) {
				prev.next = next;
			}
			if (next != null) {
				next.prev = prev;
			}
			size--;
			return true;
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
	
	public Node findMiddle() {
		Node temp=start;
		for (int i = 0; i < (size-1)/2; i++) {
			temp=temp.next;
		}
		return temp;
	}
	
	//if size is not mentioned
	public Node findMiddleWithoutSize() {
		int n = 0;
		Node temp = start;
		while (temp != null) {
			n++;
            temp = temp.next;
		}
		temp=start;
		for (int i = 0; i < (n-1)/2; i++) {
			temp=temp.next;
		}
		return temp;
	}
	
	public Node rabbitTortoiseMiddle() {
		Node rabbit = start;
		Node tortoise = start;
		while(rabbit!=null) {
			rabbit=rabbit.next;//1st step
            if(rabbit!=null) {
                rabbit=rabbit.next;//2nd step
                tortoise=tortoise.next;//1st step
            }
		}
		return tortoise;
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
//		list.delete(10);
//		System.out.println("After deleted");
		list.print();
		System.out.println("reverse printing");
		list.revPrint();
		System.out.println("middle element: "+list.findMiddle().data);
		System.out.println("middle element without size: "+list.findMiddleWithoutSize().data);
		System.out.println("rabbit tortoise middle element: "+list.rabbitTortoiseMiddle().data);
	}
}
