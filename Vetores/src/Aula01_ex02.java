import java.util.Scanner;

public class Aula01_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);

		String[] atletas = new String[3];
		int[] idade = new int[3];
		int idadeSup = 0;

		for(int i=0;i<3;i++) {
			System.out.println("Digite o nome do atleta: ");
			atletas[i] = e.next();

			System.out.println("Digite a idade: ");
			idade[i]= e.nextInt();


		}
		
		//Exibir atletas com idade>21
		for(int i=0;i<3;i++) {
			if(idade[i]>21) {
				System.out.println("Atletas com idade superior a 21: "+ atletas[i]);
			}
		}




	}

}
