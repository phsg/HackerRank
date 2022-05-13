package com.hackerrank;

import java.util.Scanner;

public class Day15LinkedList {

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static Node insert(Node head, int data) {
		if (head == null) {
			return new Node(data);
		}
		Node newNode = head;
		while (newNode.next != null) {
			newNode = newNode.next;
		}
		newNode.next = new Node(data);
		return head;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}
}

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}
