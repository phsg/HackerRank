package com.hackerrank.practice.algorithms.implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceEquation {

	public static void main(String[] args) throws IOException {
		List<Integer> vList = new ArrayList<Integer>();
//		vList.add(2);
//		vList.add(3);
//		vList.add(1);

		vList.add(4);
		vList.add(3);
		vList.add(5);
		vList.add(1);
		vList.add(2);
//		permutationEquation(vList);
		List<Integer> result = permutationEquation2(vList);
		for (Integer i : result) {
			System.out.println(i);
		}
	}

	public static void permutationEquation(List<Integer> p) {
//		public static List<Integer> permutationEquation(List<Integer> p) {
		// Write your code here
		int n = p.size();
		int[] p_inverse = new int[n + 1];
		for (int x = 1; x <= n; x++) {
			int px = p.get(x - 1);
			p_inverse[px] = x;
		}

		/* Calculate and print each y */
		for (int x = 1; x <= n; x++) {
			int y = p_inverse[p_inverse[x]];
			System.out.println(y);

		}
	}

	public static List<Integer> permutationEquation2(List<Integer> p) {
		Integer[] a = new Integer[p.size()];
		Integer[] b = new Integer[p.size()];

		for (int x = 0; x < p.size();) {
			a[p.get(x) - 1] = ++x;
		}

		for (int x = 0; x < p.size(); x++) {
			b[x] = a[a[x] - 1];
		}

		return Arrays.asList(b);
	}

	public static void permutationEquation3(List<Integer> p) {
//		public static List<Integer> permutationEquation(List<Integer> p) {
		// Write your code here
		List<Integer> a = new ArrayList<Integer>(p);
		List<Integer> b = new ArrayList<Integer>(p);

		int n = p.size();
		for (int x = 1; x <= n; x++) {
			int px = p.get(x - 1);
			a.add(px, x);
			b.add(a.get(a.get(x)));
		}

		/* Calculate and print each y */
		for (int x = 1; x <= n; x++) {
			System.out.println(b.get(x));
		}
	}
}
