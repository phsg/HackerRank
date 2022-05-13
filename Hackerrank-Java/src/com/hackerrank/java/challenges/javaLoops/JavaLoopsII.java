package com.hackerrank.java.challenges.javaLoops;

import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[][] matriz = new int[t][3];
		for (int i = 0; i < t; i++) {
			matriz[i][0] = in.nextInt();
			matriz[i][1] = in.nextInt();
			matriz[i][2] = in.nextInt();
		}
		in.close();

		for (int i = 0; i < t; i++) {
			String resultado = "";
			int a = matriz[i][0];
			int b = matriz[i][1];
			int n = matriz[i][2];
			int total = a;
			int e = 1;
			for (int iN = 0; iN < n; iN++) {
				total = total + (e * b);
				resultado = resultado + total + " ";
				e = e * 2;
			}
			System.out.println(resultado);
		}
	}

}