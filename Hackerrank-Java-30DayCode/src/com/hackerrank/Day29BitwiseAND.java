package com.hackerrank;

import java.util.Scanner;

public class Day29BitwiseAND {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] r = new int[t];
		for (int tItr = 0; tItr < t; tItr++) {
			String[] nk = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nk[0]);

			int k = Integer.parseInt(nk[1]);

			if ((k - 1 | k) <= n) {
				System.out.println(k - 1);
			} else {
				System.out.println(k - 2);
			}
		}

		scanner.close();

		for (int i : r) {
			System.out.println(i);
		}
	}

}
