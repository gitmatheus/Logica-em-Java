package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		int arr[][] = new int[4][5];

		Scanner e = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			
			
			System.out.println("Código do cliente: "+ (i+1));
			arr[i][0] = e.nextInt();
			System.out.println("Milhagem do Cliente: "+ (i+1));
			arr[i][1] = e.nextInt();
			System.out.println("Categoria do Cliente: "+ (i+1));

			arr[i][2] = e.nextInt();
			while (arr[i][2] != 1 && arr[i][2] != 2 && arr[i][2] != 3) {
				System.out.println("Categoria do Cliente: "+ (i+1));
				arr[i][2] = e.nextInt();
				
			}
			
			if(arr[i][2] == 1) {
				arr[i][3] = 10000;
			}else if(arr[i][2] == 2) {
				arr[i][3] = 5000;
			}else {
				arr[i][3] = 0;
			}
			
			arr[i][4]= arr[i][1] + arr[i][3];
			
		}
		
		for(int i =0;i<arr.length;i++) {
			
			System.out.println("Código do cliente: "+(i+1)+"\t"+ "Quant. Milhagem:"+arr[i][1]+"\t"+
					"Categoria:"+arr[i][2]+"\t"+"Bônus:"+arr[i][3]+ "\t" +"Milhagem Atual:"+arr[i][4]);
			
		}

		e.close();
	}

}
