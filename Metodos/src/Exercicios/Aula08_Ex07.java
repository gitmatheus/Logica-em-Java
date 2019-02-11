package Exercicios;

import java.util.Scanner;
public class Aula08_Ex07 {
	static Scanner e = new Scanner(System.in);
	public static void main(String[] args) {
		
	//Chama método carregar
		double[] numeros = carregar();
		
		//Chama método ordenar
		numeros = ordenar(numeros);
		for(int i=0;i<5;i++) {
			System.out.println(numeros[i]);
		}
		
		

	}// Fecha Principal
	
	public static double[] carregar() {
		
		double[] numeros = new double[5];
		
		
		
		for(int i=0;i<5;i++) {
			System.out.println("Digite o numero");
			numeros[i] = e.nextDouble();
		}
		
		return numeros;
	}

	
	public static double[] ordenar(double[] numeros) {
		double aux=0;
		for(int v=0; v<5;v++) {
			for(int c=0;c<4;c++) {
				if(numeros[c]>numeros[c+1]) {
					aux=numeros[c];
					numeros[c] = numeros[c+1];
					numeros[c+1]= aux;
				}
			}
		}
		return numeros;
		
	}
}
