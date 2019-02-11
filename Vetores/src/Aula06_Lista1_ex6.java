import java.util.Scanner;

public class Aula06_Lista1_ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);

		int numAluno = 0;

		String[] gabarito = new String[] {"A","A","A","A","A","A","A","A",};
		String[] respAluno = new String[8];
		int[] alunos = new int[3];
		int notaAluno=0, alunosAprov=0;




		/*for(int i=0;i<8;i++) {

			System.out.println("Digite a resposta da questão "+(i+1)+":");
			gabarito[i] = e.next();	
		}*/

		for(int i=0;i<3;i++) {
			System.out.println("Digite o numero do "+(i+1)+"°. aluno");
			alunos[i]=e.nextInt();

			System.out.println("----------ALUNO: " +alunos[i]+"-------------");



			for(int r=0;r<8; r++) {

				System.out.println("Resposta do aluno "+alunos[i]+" na  questão: "+(r+1)+" foi:");
				respAluno[i]= e.next();

				if(respAluno[i].equalsIgnoreCase(gabarito[i])) {
					notaAluno++;
				}
			}

			if(notaAluno > 6) {
				alunosAprov++;
			}
			System.out.println(alunosAprov);

			System.out.println("A nota do aluno "+alunos[i]+" foi: "+notaAluno);
			notaAluno= 0;

		}
		
		System.out.println("A porcentagem de alunos aprovados foi: "+  alunosAprov/3 );



	}

}
