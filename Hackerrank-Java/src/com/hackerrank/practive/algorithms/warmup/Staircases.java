package com.hackerrank.practive.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

	/*
	 * Complete the 'staircase' function below.
	 *
	 * The function accepts INTEGER n as parameter.
	 */

	public static void staircase(int n) {
		for (int l = 0; l < n; l++) {
			for (int c = 0; c < (n - l - 1); c++) {
				System.out.print(" ");
			}
			for (int c = 0; c < (l + 1); c++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}

public class Staircases {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		Result.staircase(n);
		bufferedReader.close();
	}

}
