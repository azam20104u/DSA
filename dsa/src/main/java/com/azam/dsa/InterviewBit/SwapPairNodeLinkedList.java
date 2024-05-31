package com.azam.dsa.InterviewBit;
class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}
public class SwapPairNodeLinkedList {
    public static void main(String[] args) {
        Node n = new Node(10);
        n.next = new Node(20);
        n.next.next=new Node(30);
        n.next.next.next=new Node(40);
        n.next.next.next.next=new Node(50);

        Node node = recSwapNode(n);
        System.out.println(node.data+" "+node.next.data+" "+node.next.next.data+" "+node.next.next.next.data+" "+node.next.next.next.next.data);
    }
    private static Node recSwapNode(Node head) {
        if (head==null || head.next==null) {
            return head;
        }
        Node prev = head;
        Node curr = head.next;
        Node next = curr.next;

        curr.next=prev;
        prev.next= recSwapNode(next);
        return curr;
    }
}
