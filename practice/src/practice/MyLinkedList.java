package practice;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

public class MyLinkedList {
	Node start = null;
	Node end = null;
	int i = 0;
	void add(int data) {//add Last method also work 
		Node node = new Node(data);
		if (start==null) {
			start=node;
			System.out.println(data+" Node considerd as a start Node");
			end=node;
			System.out.println(data+" Node considerd as a end Node");
		}else {
			end.next=node;
			System.out.println(data+" added after "+end.data+" Node as a next Node");
			end=node;
			System.out.println(data+" Node considerd as end Node");
		}
		System.out.println(data+" added at "+i+" index");
		i++;
	}
	void addFirst(int data) {
		Node node = new Node(data);
		Node temp = start;
		start = node;
		System.out.println(data+" Node added as a start Node");
		start.next = temp;
		i++;
	}
	void printAll() {
		Node head=start;
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}

	public static void main(String[] args) {
		MyLinkedList ml = new MyLinkedList();
		ml.add(10);
		ml.add(20);
		ml.add(30);
//		System.out.println(ml.start.data + ", " + ml.start.next.data + ", " + ml.start.next.next.data);
		ml.printAll();
		ml.addFirst(40);
		ml.printAll();
	}
}
