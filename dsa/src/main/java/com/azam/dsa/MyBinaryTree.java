package com.azam.dsa;

import java.util.Scanner;

class NodeTree {
	int data;
	NodeTree left;
	NodeTree right;

	public NodeTree(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class MyBinaryTree {
	static NodeTree createHardCodedTree() {
		NodeTree root = new NodeTree(10);
		root.left = new NodeTree(20);
		root.left.left = new NodeTree(40);
		root.left.right = new NodeTree(50);
		root.right = new NodeTree(30);
		root.right.left = new NodeTree(60);
		root.right.right = new NodeTree(70);
		return root;
	}
	static NodeTree createTree() {
		NodeTree root = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data");
		int data = sc.nextInt();
		if (data == -1)
			return null;
		root = new NodeTree(data);
		System.out.println("Enter left for " + data);
		root.left = createTree();
		System.out.println("Enter right for " + data);
		root.right = createTree();
		return root;
	}
	
	private static void inOrderTraversal(NodeTree root) {
		if (root==null) {
			return;
		}
		System.out.println(root.data);
		inOrderTraversal(root.left);
		inOrderTraversal(root.right);
	}
	
	private static void preOrderTraversal(NodeTree root) {
		if (root==null) {
			return;
		}
		preOrderTraversal(root.left);
		System.out.println(root.data);
		preOrderTraversal(root.right);
	}
	
	private static void postOrderTraversal(NodeTree root) {
		if (root==null) {
			return;
		}
		postOrderTraversal(root.right);
		System.out.println(root.data);
		postOrderTraversal(root.left);
	}

	public static void main(String[] args) {
//		NodeTree root = createTree();
		NodeTree root = createHardCodedTree();
		System.out.println("=========In order travers===========");
		inOrderTraversal(root);
		System.out.println("=========Pre order travers===========");
		preOrderTraversal(root);
		System.out.println("=========Post order travers===========");
		postOrderTraversal(root);

		/* without method in order tree travers */
//		System.out.println(root.data);
//		System.out.println(root.left.data);
//		System.out.println(root.left.left.data);
//		System.out.println(root.left.right.data);
//		System.out.println(root.right.data);
//		System.out.println(root.right.left.data);
//		System.out.println(root.right.right.data);

	}

}
