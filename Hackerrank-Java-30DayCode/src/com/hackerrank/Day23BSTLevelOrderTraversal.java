package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day23BSTLevelOrderTraversal {

	static class Node {
		Node left, right;
		int data;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
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

	static void levelOrder(List<String> vR, Node root, int index) {
		String v = "";

		if (vR.size() > index) {
			v = vR.get(index) + " ";
		} else {
			vR.add(index, "");
		}

		vR.set(index++, v.concat(Integer.toString(root.data)));

		if (root.left != null) {
			levelOrder(vR, root.left, index);
		}

		if (root.right != null) {
			levelOrder(vR, root.right, index);
		}
	}

	static void levelOrder(Node root) {
		List<String> vR = new ArrayList<String>();
		if (root != null) {
			levelOrder(vR, root, 0);
		}
		for (String v : vR) {
			System.out.print(v + " ");
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
		levelOrder(root);
	}
}
