import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		int arrNumeros[][] = new int [3][3];
		
		//for controla linha
		for(int linha=0;linha<3;linha++) {
			
			//for controla colunas
			for(int coluna=0;coluna<3;coluna++) {
				
				System.out.println("Informe o elemento da matriz - linha"
				+ linha +" - Coluna "+coluna+":");
				arrNumeros[linha][coluna]=e.nextInt();
				
			}
		}
		
		// exibir matriz
		for(int linha=0;linha<3;linha++) {
				
			for(int coluna=0;coluna<3;coluna++) {
				System.out.println("Matriz Números"+"["+linha+","+coluna+"] ="+arrNumeros[linha][coluna]);
			}
			
		}
		
		
		//exibir em matriz
		for(int linha=0;linha<3;linha++) {
			
			for(int coluna=0;coluna<3;coluna++) {
			
			System.out.print(arrNumeros[linha][coluna] +"\t");
			
			}
			
			System.out.println(" ");
		}
		
		

	}

}
