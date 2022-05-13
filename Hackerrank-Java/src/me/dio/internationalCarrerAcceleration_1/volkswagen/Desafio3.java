package me.dio.internationalCarrerAcceleration_1.volkswagen;

import java.io.IOException;
import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) throws IOException {

		Scanner vInput = new Scanner(System.in);

		int vJumpHeight = vInput.nextInt();
		int vNumberOfPipes = vInput.nextInt();
		vInput.nextLine();
		String[] vPipesHeights = vInput.nextLine().split(" ");
		int vPipe = Integer.parseInt(vPipesHeights[0]);
		String vMsg = null;
		for (int i = 1; i < vNumberOfPipes; i++) {
			int vNextPipe = Integer.parseInt(vPipesHeights[i]);

			if (vNextPipe > (vPipe + vJumpHeight)) {
				vMsg = "GAME OVER";
				break;
			} else if (vNextPipe < (vPipe - vJumpHeight)) {
				vMsg = "GAME OVER";
				break;
			} else {
				vPipe = vNextPipe;
			}
		}

		if (vMsg == null) {
			System.out.println("YOU WIN");
		} else {
			System.out.println(vMsg);
		}
		vInput.close();
	}

}