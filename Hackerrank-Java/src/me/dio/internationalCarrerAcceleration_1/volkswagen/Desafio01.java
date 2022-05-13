package me.dio.internationalCarrerAcceleration_1.volkswagen;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) throws IOException {

		Scanner vInput = new Scanner(System.in);

		int vTotalAthlete = vInput.nextInt();
		vInput.nextLine();
		List<String> vReturn = new ArrayList<String>();

		String pattern = "#0.00";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);

		for (int vAthlete = 0; vAthlete < vTotalAthlete; vAthlete++) {
			String vName = vInput.nextLine();
			Double vDifficulty = Double.parseDouble(vInput.nextLine());
			String[] vArScore = vInput.nextLine().split(" ");

			List<Double> vListScore = new ArrayList<Double>();
			for (int i = 0; i < 7; i++) {
				Double vScore = Double.parseDouble(vArScore[i]);
				vListScore.add(vScore);
			}
			Collections.sort(vListScore);
			double vSum = 0;
			for (int i = 1; i < 6; i++) {
				vSum = vSum + vListScore.get(i);
			}
			vReturn.add(vName + " " + decimalFormat.format((vSum * vDifficulty)));
		}

		for (String vPrint : vReturn) {
			System.out.println(vPrint);
		}

		vInput.close();
	}

}