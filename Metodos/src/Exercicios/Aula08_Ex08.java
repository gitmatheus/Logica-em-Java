package Exercicios;

import java.util.Scanner;

public class Aula08_Ex08 {

	static Scanner entrada = new Scanner(System.in);
	static int [] arrayQuant= new int[5];
	
	public static void main(String[] args) {
		
	String [] arrayCarros = new String[] {"Classic","Cobalt","Onix","Prisma","Cruze"};
	double [] arrayPreco = new double[] {33600,44900,37790,43150,55400}; 
	
	//A.
	int[][] vendas = carregar(arrayCarros);
	
	relatorioGerencial(arrayCarros, vendas,arrayPreco);
	
	}//Estrutura Principal
	
	
	public static int [][] carregar(String [] arrayCarros){
	
		int[][] vendas = new int [4][5]; 	
		
		for(int t=0;t<4;t++) {
			System.out.println((t+1)+"º Tri");
			for(int c=0;c<5;c++) {
				System.out.print(arrayCarros[c]+":");
				vendas[t][c]=entrada.nextInt();
			}
			
		}
		return vendas;
		
	}
	
	public static double [] calcular(double [] arrayPreco, int [][] vendas) {
		
		double [] total = new double[5];
		
		//Soma dos Carros
		for(int c=0;c<5;c++) {
			for(int t=0;t<4;t++) {
				arrayQuant[c]+=vendas[t][c];
			}
		}
		//Cálculo do Total 
		for(int c=0;c<5;c++) {
			total[c]=arrayQuant[c]*arrayPreco[c];
		}
					
		return total;
		
	}

	public static void relatorioGerencial(String[] arrayCarros,int[][]vendas,double[] arrayPreco) {
		double totGeral =0;
		
		System.out.println("Relatório Gerencial");
		
		//B.
		double [] total = calcular(arrayPreco,vendas);
		
		for(int i=0;i<5;i++) {
			System.out.println("Carro "+ arrayCarros[i]+"\t Quant: "+arrayQuant[i]+"\t Total: "+total[i]);
			totGeral+=total[i];
		}
		System.out.println("Total Geral: "+totGeral);
		
	}

}
