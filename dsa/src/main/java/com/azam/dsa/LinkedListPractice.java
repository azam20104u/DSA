package com.azam.dsa;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

class CustomLinkedList {
	Node start;
	Node end;
	public CustomLinkedList() {
		start = null;
	}

	void add(int data) {
		Node node = new Node(data);
		if (start==null) {
			start=node;
			System.out.println(data+" added as start Node");
			end=node;
			System.out.println(data+ " added as end Node");
		}else {
			end.next=node;
			System.out.println(data+" added after "+end.data);
			end=node;
			System.out.println(data+" addded as end Node");
		}
	}
}

public class LinkedListPractice {
	public static void main(String[] args) {
		CustomLinkedList cll = new CustomLinkedList();
		cll.add(10);
		cll.add(20);
		cll.add(30);
		cll.add(40);
	}
}
