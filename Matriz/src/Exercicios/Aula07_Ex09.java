package Exercicios;

import java.util.Scanner;

public class Aula07_Ex09 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		int[][] medalhas = new int[5][4];

		String[] esportes = new String[] { "Natação", "Atletismo", "judô", "Ciclismo" };
		String[] paises = new String[] { "Brasil", "Russia", "Alemanha", "China" };
		int maiorMedalha = 0, maiorModalidade;

		for (int i = 0; i < 4; i++) {
			System.out.println("Digite a quantidade da: " + esportes[i]);

			for (int j = 0; j < 4; j++) {
				System.out.println("Digite as medalhas do Pais: " + paises[j]);
				medalhas[i][j] = e.nextInt();

				medalhas[4][i] += medalhas[j][i];
			}

		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

			}

		}
	}

}
