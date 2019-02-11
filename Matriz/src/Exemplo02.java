import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int arrNum[][] = new int[4][4];
		int somaLinha,somaColuna, totalGeral = 0;

		for (int linha = 0; linha < 4; linha++) {

			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println("Informe o elemento da matriz - linha" + linha + " - Coluna " + coluna + ":");
				arrNum[linha][coluna] = e.nextInt();
			}

		}

		for (int i = 0; i < 4; i++) {
			somaLinha = 0;
			somaColuna=0;
			for (int j = 0; j < 4; j++) {
				somaLinha += arrNum[i][j];
				somaColuna += arrNum[j][i];
			}
			
			System.out.println("A soma da linha " + i + ":" + somaLinha);
			System.out.println("A soma da Coluna " + i + ":" + somaColuna);
			totalGeral += somaLinha;
		}

		System.out.println("Total Geral:" + totalGeral);

	}

}
