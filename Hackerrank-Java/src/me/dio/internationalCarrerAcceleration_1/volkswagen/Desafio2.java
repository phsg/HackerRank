package me.dio.internationalCarrerAcceleration_1.volkswagen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) throws IOException {

		Scanner vInput = new Scanner(System.in);
		String vExpression = vInput.nextLine();
		List<String> vListMsg = new ArrayList<String>();

		do {
			int vParenthesis = 0;
			for (int i = 0; i < vExpression.length(); i++) {
				char vTemp = vExpression.charAt(i);
				if (vTemp == '(') {
					vParenthesis++;
				} else if (vTemp == ')') {
					vParenthesis--;
					if (vParenthesis == -1) {
						break;
					}
				}

			}

			if (vParenthesis == 0) {
				vListMsg.add("correct");
			} else {
				vListMsg.add("incorrect");
			}
			vExpression = vInput.nextLine();
		} while (vExpression != null && !vExpression.equals(""));

		for (String vPrint : vListMsg) {
			System.out.println(vPrint);
		}

		vInput.close();
	}

}