package com.hackerrank;

import java.util.Scanner;

public class Day22BinarySearchTrees {

	public static int getHeight(Node root) {
		int vAlturaE = 0;
		int vAlturaD = 0;
		if (root.left != null) {
			vAlturaE = 1 + getHeight(root.left);
		}
		if (root.right != null) {
			vAlturaD = 1 + getHeight(root.right);
		}

		if (vAlturaE > vAlturaD) {
			return vAlturaE;
		}
		return vAlturaD;
	}

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

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}
}

class Node {

	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}
