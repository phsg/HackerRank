package com.hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Day18QueuesAndStacks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Day18QueuesAndStacks p = new Day18QueuesAndStacks();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}

	private Queue<Character> fila = new LinkedList<Character>();
	private Stack<Character> pilha = new Stack<Character>();

	private Object dequeueCharacter() {
		return fila.remove();
	}

	private void enqueueCharacter(char c) {
		fila.add(c);
	}

	private Object popCharacter() {
		return pilha.pop();
	}

	private void pushCharacter(char c) {
		pilha.add(c);
	}
}
