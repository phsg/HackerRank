package com.hackerrank;

import java.util.Scanner;

public class Day14Scope {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] elements) {
		super();
		this.elements = elements;
	}

	public void computeDifference() {
		int maxEle = elements[0];
		int minEle = elements[0];

		for (int i = 1; i < elements.length; i++) {
			int ele = elements[i];
			if (ele > maxEle) {
				maxEle = ele;
			} else if (ele < minEle) {
				minEle = ele;
			}
		}
		maximumDifference = (maxEle - minEle);
	}

	// Add your code here

} // End of Difference class
