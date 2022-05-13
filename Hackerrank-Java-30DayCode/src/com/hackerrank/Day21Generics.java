package com.hackerrank;

import java.util.Scanner;

public class Day21Generics {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer[] intArray = new Integer[n];
		for (int i = 0; i < n; i++) {
			intArray[i] = scanner.nextInt();
		}

		n = scanner.nextInt();
		String[] stringArray = new String[n];
		for (int i = 0; i < n; i++) {
			stringArray[i] = scanner.next();
		}

		Printer<Integer> intPrinter = new Printer<Integer>();
		Printer<String> stringPrinter = new Printer<String>();
		intPrinter.printArray(intArray);
		stringPrinter.printArray(stringArray);
		if (Printer.class.getDeclaredMethods().length > 1) {
			System.out.println("The Printer class should only have 1 method named printArray.");
		}
	}
}

class Printer<T> {

//	public void printArray(Integer[] intArray) {
//		for (int i : intArray) {
//			System.out.println(i);
//		}
//
//	}
//
//	public void printArray(String[] stringArray) {
//		for (String s : stringArray) {
//			System.out.println(s);
//		}
//	}

	/**
	 * Method Name: printArray Print each element of the generic array on a new
	 * line. Do not return anything.
	 * 
	 * @param A generic array
	 **/

	public void printArray(T[] stringArray) {
		for (T s : stringArray) {
			System.out.println(s);
		}
	}

}
