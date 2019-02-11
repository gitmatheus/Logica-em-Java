package Exercicios;

import java.util.Random;

public class Ex_extra01 {

	public static void main(String[] args) {
		Random gerador = new Random();


		String[] arrMes= new String[] {"JAN","FEV","MAR","ABR","MAI","JUN","JUL","AGO","SET","OUT","NOV","DEZ"};
		int[] anos = new int[43];
		int[] consumoMes = new int[12];
		int[][] consumo = new int[anos.length][12];

		for(int i=0;i<anos.length;i++) {
			anos[i]=1970;
			anos[i] +=i;
		}

		for(int i=0;i< anos.length;i++) {
			for(int j=0; j<12;j++) {
				consumo[i][j] = gerador.nextInt(250);
			}
		}
		
		for(int i=0;i<12;i++) {
			for(int j=0; j<anos.length;j++) {
				consumoMes[i] += consumo[j][i]; 
			}
			
			System.out.println("O consumo de Mes de: " + arrMes[i]+" foi de: "+ consumoMes[i]);
		}
		
		
		

		
		/*for(int i=0;i<10;i++) {
			for(int j=0; j<12;j++) {
				System.out.print(consumo[i][j] +"\t");
			}	
			System.out.println("");
		}*/



	}

}
