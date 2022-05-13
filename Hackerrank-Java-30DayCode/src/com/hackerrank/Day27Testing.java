package com.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Day27Testing {

	static class TestDataEmptyArray {
		public static int[] get_array() {
			// complete this function
			return new int[0];
		}
	}

	static class TestDataExactlyTwoDifferentMinimums {
		static int[] vVal;

		public static int[] get_array() {
			Random gerador = new Random();
			int tam = gerador.nextInt(8) + 2;
			vVal = new int[tam];
			Integer vMenor = null;
			for (int i = 0; i < (tam - 1); i++) {
				int vNovo = gerador.nextInt(100);
				if (vMenor == null || vMenor > vNovo) {
					vMenor = vNovo;
				}
				vVal[i] = vNovo;
			}
			vVal[tam - 1] = vMenor;

			return vVal;
		}

		public static int get_expected_result() {
			int minPos = 0;
			Integer minVal = null;
			for (int t = 0; t < vVal.length; t++) {
				if (minVal == null || minVal > vVal[t]) {
					minPos = t;
					minVal = vVal[t];
				}
			}
			return minPos;
		}
	}

	static class TestDataUniqueValues {
		static int[] vVal;

		public static int[] get_array() {
			Random gerador = new Random();
			int tam = gerador.nextInt(8) + 2;

			Set<Integer> vHash = new HashSet<Integer>();
			for (int i = 0; i < tam;) {
				if (vHash.add(gerador.nextInt(100))) {
					i++;
				}
			}

			vVal = vHash.stream().mapToInt(Number::intValue).toArray();
			return vVal;
		}

		public static int get_expected_result() {
			int minPos = 0;
			Integer minVal = null;
			for (int t = 0; t < vVal.length; t++) {
				if (minVal == null || minVal > vVal[t]) {
					minPos = t;
					minVal = vVal[t];
				}
			}
			return minPos;
		}
	}

	public static void main(String[] args) {
		TestWithEmptyArray();
		TestWithUniqueValues();
		TestWithExactlyTwoDifferentMinimums();
		System.out.println("OK");
	}

	public static int minimum_index(int[] seq) {
		if (seq.length == 0) {
			throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
		}
		int min_idx = 0;
		for (int i = 1; i < seq.length; ++i) {
			if (seq[i] < seq[min_idx]) {
				min_idx = i;
			}
		}
		return min_idx;
	}

	public static void TestWithEmptyArray() {
		try {
			int[] seq = TestDataEmptyArray.get_array();
			int result = minimum_index(seq);
		} catch (IllegalArgumentException e) {
			return;
		}
		throw new AssertionError("Exception wasn't thrown as expected");
	}

	public static void TestWithExactlyTwoDifferentMinimums() {
		int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
		if (seq.length < 2) {
			throw new AssertionError("less than 2 elements in the array");
		}

		int[] tmp = seq.clone();
		Arrays.sort(tmp);
		if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))) {
			throw new AssertionError("there are not exactly two minimums in the array");
		}

		int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
		int result = minimum_index(seq);
		if (result != expected_result) {
			throw new AssertionError("result is different than the expected result");
		}
	}

	public static void TestWithUniqueValues() {
		int[] seq = TestDataUniqueValues.get_array();
		if (seq.length < 2) {
			throw new AssertionError("less than 2 elements in the array");
		}

		Integer[] tmp = new Integer[seq.length];
		for (int i = 0; i < seq.length; ++i) {
			tmp[i] = Integer.valueOf(seq[i]);
		}
		if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp))).size() == seq.length)) {
			throw new AssertionError("not all values are unique");
		}

		int expected_result = TestDataUniqueValues.get_expected_result();
		int result = minimum_index(seq);
		if (result != expected_result) {
			throw new AssertionError("result is different than the expected result");
		}
	}
}
