package com.hackerrank.dataStructucres.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ds2DArrays {

	private static final Scanner scanner = new Scanner(System.in);

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		Integer max = null;
		for (int l = 1; l < 5; l++) {
			int sum = 0;
			for (int c = 1; c < 5; c++) {
				sum = arr[l - 1][c - 1] + arr[l - 1][c] + arr[l - 1][c + 1] + arr[l][c] + arr[l + 1][c - 1]
						+ arr[l + 1][c] + arr[l + 1][c + 1];
				if (max == null || sum > max) {
					max = sum;
				}
			}
		}

		return max;
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = hourglassSum(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
