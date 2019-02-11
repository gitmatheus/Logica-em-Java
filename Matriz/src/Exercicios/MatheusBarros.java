package Exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MatheusBarros {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		DecimalFormat fm = new DecimalFormat("###0.00");

		int[][] matriz = new int[4][5];

		String[] ArrModelos = new String[] { "Classic", "Cobalt", "Cruze", "Onix", "Prisma" };
		String[] ArrConces = new String[] { "Santo André", "Mauá", "Guarulhos", "Aricanduva" };
		int[] ArrMetas = new int[] { 60, 100, 80, 100, 90 };
		int totalVenda = 0, MaiorVendaGua = 0;
		int melhorV = 0, piorV = 0, posMelhorV = 0, posPiorV = 0;
		int maiorPossicao = 0;
		double[] percent = new double[4];
		int[] somaA = new int[5];
		int meta=0;

		int[] totalPorMod = new int[5];

		// Alimenta a matriz
		for (int li = 0; li < 4; li++) {
			System.out.println("Concessionária " + ArrConces[li]);
			for (int co = 0; co < 5; co++) {
				System.out.print("Quantidade Vendida do Modelo " + ArrModelos[co] + ": ");
				matriz[li][co] = e.nextInt();

				totalVenda += matriz[li][co];
			}
		}

		System.out.println("Total carros vendidos no semestre: " + totalVenda);

		for (int l = 0; l < 4; l++) {

			for (int c = 0; c < 5; c++) {

				somaA[l] += matriz[l][c];

			}
			percent[l] = ((double) somaA[l] / totalVenda) * 100;
			// System.out.println(somaA[l]);
			System.out.println(ArrConces[l] + "  " + fm.format(percent[l]));

		}

		// B) Qual o modelo de carro na concessionária Guarulhos que teve melhor saída
		// de vendas

		for (int i = 0; i < 5; i++) {
			if (matriz[2][i] > MaiorVendaGua) {
				MaiorVendaGua = matriz[2][i];
				maiorPossicao = i;
			}
		}

		System.out.println("Modelo com maior Venda na Concess.Guarulhos foi: " + ArrModelos[maiorPossicao]);
		System.out.println("");

		// C) Identifique no Semestre o carro com melhor e pior vendas
		for (int co = 0; co < 5; co++) {

			for (int li = 0; li < 4; li++) {
				totalPorMod[co] += matriz[li][co];
			}
			if (co == 0 ) {
				melhorV = totalPorMod[co];
				piorV = totalPorMod[co];
				posMelhorV = co;
				posPiorV = co;
			} else {
				if (totalPorMod[co] > melhorV) {
					melhorV = totalPorMod[co];
					posMelhorV = co;
				} else if (totalPorMod[co] < piorV) {
					piorV = totalPorMod[co];
					posPiorV = co;
				}
			}
		}

		System.out.println("Melhor Vendas : " + ArrModelos[posMelhorV]);

		System.out.println("Pior Vendas : " + ArrModelos[posPiorV]);
		
		
		System.out.println("");
		//D) Liste os modelos que atingiram e não atingiram metas de venda no semestre
		
		System.out.println("carros que atingiram Meta");
		
		
		for (int co = 0; co < 5; co++) {
			meta=0;
			for (int li = 0; li < 4; li++) {	
				meta += matriz[li][co];
			}
			if(meta >= ArrMetas[co]) {
				System.out.println(ArrModelos[co]);			
			}
		}
		
		
System.out.println("carros que não atingiram Meta");
			
		for (int co = 0; co < 5; co++) {
			meta=0;
			for (int li = 0; li < 4; li++) {				
				meta += matriz[li][co];
			}
			if(meta < ArrMetas[co]) {
				System.out.println(ArrModelos[co]);
				
			}
		}	
	}

}
