package com.hackerrank.practive.algorithms.warmup;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;

public class PlusMinus {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		Result.plusMinus(arr);

		bufferedReader.close();
	}
}

class Result {

	/*
	 * Complete the 'plusMinus' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static void plusMinus(List<Integer> arr) {
		double vTotalPositivo = 0;
		double vTotalNegativo = 0;
		double vTotalNeutros = 0;

		for (int vTemp : arr) {
			if (vTemp > 0) {
				vTotalPositivo++;
			} else if (vTemp < 0) {
				vTotalNegativo++;
			} else {
				vTotalNeutros++;
			}
		}

		double vTotal = arr.size();
		String pattern = "#0.000000";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);

		if (vTotalPositivo > 0) {
			System.out.println(decimalFormat.format(vTotalPositivo / vTotal));
		} else {
			System.out.println("0.000000");
		}

		if (vTotalNegativo > 0) {
			System.out.println(decimalFormat.format(vTotalNegativo / vTotal));
		} else {
			System.out.println("0.000000");
		}

		if (vTotalNeutros > 0) {
			System.out.println(decimalFormat.format(vTotalNeutros / vTotal));
		} else {
			System.out.println("0.000000");
		}
	}

}
