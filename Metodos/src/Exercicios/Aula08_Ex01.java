package Exercicios;

import java.util.Scanner;

public class Aula08_Ex01 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {

		

		System.out.print("Digite o nome do hóspede: ");
		String nome = e.next();
		System.out.println("Tipo de acomodaçao: ");
		int tipo = e.nextInt();
		System.out.println("Quantidade de diarias");
		int qtdDiaria = e.nextInt();

		Double valorEstadia = calcular(tipo, qtdDiaria);

		System.out.println("O valor da estadia é: " + valorEstadia);

		System.out.println("");

		System.out.println("Qual a forma de pagamento");
		
		char forma = e.next().toUpperCase().charAt(0);
		
		formaPagamento(forma, valorEstadia);

	}//

	public static Double calcular(double tipo, int qtdDiaria) {

		double valor;
		double valDiaria;
		if (tipo == 1) {
			valDiaria = 380;
		} else if (tipo == 2) {
			valDiaria = 450;
		} else {
			valDiaria = 560;
		}

		valor = valDiaria * qtdDiaria;

		return valor;
	}
	
	public static void formaPagamento(char forma, double valorEstadia ) {
		if(forma == 'V') {
			
			valorEstadia =  valorEstadia*0.90;
			System.out.println("valor total a paga é: "+ valorEstadia );
		}else {
			System.out.println("valor total a paga é: "+ valorEstadia );
		}
		
	}

}
