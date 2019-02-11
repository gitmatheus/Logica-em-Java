package Exercicios;

import java.util.Scanner;

public class Aula08_Lista04_Ex08 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {

		String[] Produtos = new String[] { "NoteBook", "Computadores", "tablets", "Servidores" };
		double[] MetaVendas = new double[] { 1000, 1000, 800, 200 };

		int[][] Vendas = produtosVendidos(Produtos);
		System.out.println("");

		int[] VendasPorProd = qtdVendasPorProd(Vendas);
		System.out.println("");
		System.out.println("");

		int[] VendasPorTri = qtdVendasPorTri(Vendas);
		System.out.println("");

		String[] Metas = atingirMeta(VendasPorProd, MetaVendas);
		System.out.println("");
		
		String[] RankVendasPorProd = rankingProdVendidos(VendasPorProd,Produtos);
		

	}

	//Métodos
	
	// A)
	public static int[][] produtosVendidos(String[] Produtos) {

		System.out.println("Digite a quantidade de Vendas dos produtos: ");

		int[][] vendas = new int[4][4];

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {
				System.out.print("Quantidade vendida de: " + Produtos[i] + " no " + (j + 1) + "º Trimestre: ");
				vendas[i][j] = e.nextInt();

			}

		}

		return vendas;

	}

	// B)
	public static int[] qtdVendasPorProd(int[][] Vendas) {

		int[] totVendasPorProd = new int[4];

		for (int l = 0; l < 4; l++) {

			for (int c = 0; c < 4; c++) {

				totVendasPorProd[l] += Vendas[l][c];

			}

		}

		return totVendasPorProd;

	}

	// C)
	public static int[] qtdVendasPorTri(int[][] Vendas) {

		int[] totVendasPorTri = new int[4];

		for (int l = 0; l < 4; l++) {

			for (int c = 0; c < 4; c++) {

				totVendasPorTri[l] += Vendas[c][l];

			}

		}

		return totVendasPorTri;

	}

	// D)
	public static String[] atingirMeta(int[] VendasPorProd, double[] MetaVendas) {
		String[] metasAtingidas = new String[4];

		for (int i = 0; i < 4; i++) {

			if (VendasPorProd[i] >= MetaVendas[i]) {
				metasAtingidas[i] = "Atingiu Meta ";
			} else {
				metasAtingidas[i] = "Não Atingiu";
			}
		}
		return metasAtingidas;
	}

	// E)
	public static String[] rankingProdVendidos(int[] VendasPorProd, String[] Produtos) {

		String[] ranking = new String[4];

		for (int i = 0; i < 4; i++) {

			int auxV = 0;
			String auxP = null;

			for (int j = 0; i < 3; i++) {
				if (VendasPorProd[j] < VendasPorProd[j + 1]) {
					auxV = VendasPorProd[j];
					VendasPorProd[j] = VendasPorProd[j + 1];
					VendasPorProd[j + 1] = auxV;

					auxP = Produtos[j];
					ranking[j] = Produtos[j + 1];
					ranking[j + 1] = auxP;

					
				}else {
					VendasPorProd[j] = VendasPorProd[j];
					ranking[j] = Produtos[j];
				}
			}
			
		}

		return ranking;

	}

	
	//Procedimentos
	
	public static void lerVetor(int[] vetor) {
		
		
		
	}
	
}
