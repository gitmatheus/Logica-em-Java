package Exercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Aula07_Ex05 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		NumberFormat nf = new DecimalFormat ("R$ ###0.00");

		int[][] produtos = new int[5][3];
		int qtdEstoqueMaior =0, armazemMaior=0, armazemMenor=0,qtdEstoqueMenor=0;
		double produto1=0,produto2=0,produto3=0,armazem1=0,armazem2=0,armazem3=0,armazem4=0;
		int[] armazem = new int[4];

		for (int i = 0; i < 4; i++) {

			System.out.println("--- Estoque no Armazem ("  + (i + 1) +  ") ----");

			for (int j = 0; j < 3; j++) {

				System.out.print("--- Quantidade em estoque do produto ("  + (j + 1) +  "):");
				produtos[i][j] = e.nextInt();

				//verifica o armazem com menor estoque
				//Verifica o armazem com maior estoque do produto 2
				if(i ==0) {
					qtdEstoqueMenor= produtos[i][j];
					armazemMenor = i+1;

					qtdEstoqueMaior = produtos[i][1];
					armazemMaior = i+1;
				}else if(produtos[i][j] < qtdEstoqueMenor) {
					qtdEstoqueMenor = produtos[i][j];
					armazemMenor = i+1;
				}else if(produtos[i][1] > qtdEstoqueMaior) {
					qtdEstoqueMaior = produtos[i][1];
					armazemMaior =i+1;
				}
			}
		}

		System.out.println("");
		System.out.println("---- CUSTO DE CADA PRODUTO ----");
		System.out.println("");

		for (int i = 0; i < 3; i++) {
			System.out.print("--- informe o custo do produto ("  + (i + 1) +  "):");
			produtos[4][i] = e.nextInt();
		}

		//A quantidade de itens armazenados em cada armazém;
		System.out.println("");
		System.out.println("---- QUANTIDADE DE INTENS EM CADA ARMAZÉM ----");
		System.out.println("");

		for (int i = 0; i < 4; i++) {
			for(int j=0;j<3;j++) {
				armazem[i] += produtos[i][j];
			}
			System.out.println("--- Estoque no armazém ("  + (i + 1) +  "): "+armazem[i]);
		}

		//Qual armazém possui maior estoque do produto 2
		System.out.println("");
		System.out.println("---- ARMAZÉM COM MAIOR ESTOQUE DO PRODUTO 2 ----");
		System.out.println("");
		System.out.println("--- Armazém (" +armazemMaior+ ") - Quantidade em estoque: "+qtdEstoqueMaior);

		//Qual armazém possui menor estoque;
		System.out.println("");
		System.out.println("---- ARMAZÉM COM MENOR ESTOQUE ----");
		System.out.println("");
		System.out.println("--- Armazém (" +armazemMenor+ ") - Quantidade em estoque: "+qtdEstoqueMenor);

		//Qual o custo total de cada produto;
		System.out.println("");
		System.out.println("--- CUSTO TOTAL DE CADA PRODUTO  ----");
		System.out.println("");
		for (int i = 0; i < 4; i++) {
			produto1 += produtos[i][0];
			produto2 += produtos[i][1];
			produto3 += produtos[i][2];
		}
		System.out.println("Custo total do produto ( 1 ):"+nf.format(produto1*produtos[4][0]));
		System.out.println("Custo total do produto ( 2 ):"+nf.format(produto2*produtos[4][1]));
		System.out.println("Custo total do produto ( 3 ):"+nf.format(produto3*produtos[4][2]));

		//Qual o custo total de cada armazém.		
		System.out.println("");
		System.out.println("--- CUSTO TOTAL DE CADA ARMAZÉM  ----");
		System.out.println("");
		for (int j = 0; j < 3; j++) {
			armazem1 += produtos[0][j]*produtos[4][j];
			armazem2 += produtos[1][j]*produtos[4][j];
			armazem3 += produtos[2][j]*produtos[4][j];
			armazem4 += produtos[3][j]*produtos[4][j];
		}
		
		System.out.println("Estoque no Armazém ( 1 ):"+nf.format(armazem1));
		System.out.println("Estoque no Armazém ( 2 ):"+nf.format(armazem2));
		System.out.println("Estoque no Armazém ( 3 ):"+nf.format(armazem3));
		System.out.println("Estoque no Armazém ( 4 ):"+nf.format(armazem4));

	}

}
