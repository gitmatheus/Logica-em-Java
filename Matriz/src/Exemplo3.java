import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		double somaNota = 0;
		double arrayNotas[][] = new double[3][4];
		
		
		//Controla Alunos (Linhas)
		
		for(int i=0;i<3;i++) {
			//for(int i=0;i<arrayNotas.length;i++){
			
			System.out.println("Aluno 0"+(i+1));
			
			//Controla Notas
			for(int j=0;j<3;j++) {
				//for(int i=0;i<arrayNotas.length[0]-1;i++){
				System.out.println("Nota Prova" +(j+1)+":");
				arrayNotas[i][j] = e.nextDouble();
				somaNota += arrayNotas[i][j];
			}//fecha o for de notas
			
			arrayNotas[i][3]= somaNota/3;
			somaNota=0;
			
			System.out.println("");
			
		}//fecha alunos
		System.out.println("");
		System.out.println("Relatório de notas");
		for(int i=0;i<arrayNotas.length;i++) {
			System.out.println("Aluno "+(i+1)+" - Média: "+arrayNotas[i][3] );
			
		}
		
		
		
	}
	
	
}
