package com.hackerrank;

import java.util.Scanner;

public class Day25RunningTimeAndComplexity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		Integer[] l = new Integer[q];

		for (int i = 0; i < q; i++) {
			l[i] = sc.nextInt();
		}

		sc.close();

		for (Integer t : l) {
			if (t < 2) {
				System.out.println("Not prime");
			} else if (t == 2 || t == 3) {
				System.out.println("Prime");
			} else if ((t % 2) != 0) {
				int c = 1;
				for (int d = 3; d < ((t / 2) + 1); d = d + 2) {
					if (t % d == 0) {
						System.out.println("Not prime");
						c++;
						break;
					}
				}
				if (c == 1) {
					System.out.println("Prime");
				}
			} else {
				System.out.println("Not prime");
			}
		}
	}
}
