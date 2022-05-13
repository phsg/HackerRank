package com.hackerrank.dataStructucres.trees;

import java.util.Scanner;

/**
 * Complete the preOrder function in your editor below, which has parameter: a
 * pointer to the root of a binary tree. It must print the values in the tree's
 * preorder traversal as a single line of space-separated values.
 * 
 * Input Format
 * 
 * Our hidden tester code passes the root node of a binary tree to your preOrder
 * function.
 * 
 * Constraints
 * 
 * Nodes in the tree
 * 
 * Output Format
 * 
 * Print the tree's preorder traversal as a single line of space-separated
 * values.
 * 
 * @author phsg5
 *
 */

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class TreePreorderTraversal {

	/*
	 * you only have to complete the function given below. Node is defined as
	 * 
	 * class Node { int data; Node left; Node right; }
	 * 
	 */

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		preOrder(root);
	}

	public static void preOrder(Node root) {
		System.out.print(root.data + " ");
		if (root.left != null) {
			preOrder(root.left);
		}
		if (root.right != null) {
			preOrder(root.right);
		}

	}

}
