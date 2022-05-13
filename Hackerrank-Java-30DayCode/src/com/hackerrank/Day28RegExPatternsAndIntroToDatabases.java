package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day28RegExPatternsAndIntroToDatabases {

	private static final Scanner scanner = new Scanner(System.in);

	private static boolean emailValido(String pEmail) {
		if (pEmail == null || pEmail.isEmpty()) {
			return false;
		}
		String regex = "^(.+)@gmail.com";
		return pEmail.matches(regex);
		// String regex = "^(.+)@(.+)$";

//		Pattern pattern = Pattern.compile(regex);
//		 Matcher matcher = pattern.matcher(pEmail);
//		return matcher.matches();
	}

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		List<String> vListNomes = new ArrayList();
		for (int NItr = 0; NItr < N; NItr++) {
			String[] firstNameEmailID = scanner.nextLine().split(" ");

			String firstName = firstNameEmailID[0];

			String emailID = firstNameEmailID[1];

			if (emailValido(emailID)) {
				vListNomes.add(emailID);
			}
		}

		scanner.close();

		Collections.sort(vListNomes);

		for (String vTemp : vListNomes) {
			System.out.println(vTemp);
		}
	}

}
