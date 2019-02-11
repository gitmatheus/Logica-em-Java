package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		String[] arrProd = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "J", "L", "M" };

		String[] arrLoja = new String[] { "Loja A", "Loja B", "Loja C", "Loja D", "Loja E", };

		double[][] arrPrecos = new double[12][5];

		double precoMaior, precoMenor;
		int maiorProd, menorProd, lojaMenor, lojaMaior;

		for (int i = 0; i < arrProd.length; i++) {
			System.out.println("-------Produto: " + arrProd[i] + "----------");

			for (int j = 0; j < arrLoja.length; j++) {
				System.out.println("Informe o preço na loja " + arrLoja[j]);
				arrPrecos[i][j] = e.nextDouble();

				if (j == 0 && i==0) {
					precoMaior = arrPrecos[i][j];
					precoMenor = arrPrecos[i][j];
					maiorProd = 0;
					menorProd = 0;
					lojaMenor = 0;
					lojaMaior = 0;
					
				}

			}

		}

	}

}
