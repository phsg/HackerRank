package com.hackerrank;

import java.util.Scanner;

public class Day26NestedLogic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String vDataEntrega = sc.nextLine();
		String vDataPrevista = sc.nextLine();
		sc.close();

		String[] vTemp = vDataEntrega.split(" ");
		int vDiaEntrega = Integer.parseInt(vTemp[0]);
		int vMesEntrega = Integer.parseInt(vTemp[1]);
		int vAnoEntrega = Integer.parseInt(vTemp[2]);

		vTemp = vDataPrevista.split(" ");
		int vDiaPrevista = Integer.parseInt(vTemp[0]);
		int vMesPrevista = Integer.parseInt(vTemp[1]);
		int vAnoPrevista = Integer.parseInt(vTemp[2]);

		int vSaida = 0;

		if (vAnoEntrega > vAnoPrevista) {
			vSaida = 10000;
		} else if (vAnoEntrega == vAnoPrevista) {
			if (vMesEntrega > vMesPrevista) {
				vSaida = 500 * (vMesEntrega - vMesPrevista);
			} else if (vDiaEntrega > vDiaPrevista) {
				vSaida = 15 * (vDiaEntrega - vDiaPrevista);
			}
		}

		System.out.println(vSaida);
	}

}
