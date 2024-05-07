package com.azam.dsa;

import java.util.Iterator;

public class MySinglyLinkedList {

	Node start;
	Node end;

	class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
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

	// delete element
	public boolean deleteElement(int data) {
		Node previous = null;
		Node current = start;
		while (current != null) {
			if (current.data == data) {
				if (previous == null) {
					start = current.next;
				} else {
					previous.next = current.next;
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

	public void reverse() {
		Node prev = start;
		Node curr = start.next;
		Node forw = curr.next;
		start.next=null;
		while (curr != null) {
			curr.next = prev;
			prev = curr;
			curr = forw;
			if (forw!=null) {
				forw = forw.next;
			}
		}
		start=prev;
	}

	public static void main(String[] args) {
		MySinglyLinkedList list = new MySinglyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.addFirst(50);
		list.print();
		System.out.println(list.findElement(50));
		System.out.println(list.findElement(40));
//		System.out.println(list.deleteElement(30));
		System.out.println(list.deleteElement(40));
		list.print();
		System.out.println("after revrse");
		list.reverse();
		list.print();
	}
}
