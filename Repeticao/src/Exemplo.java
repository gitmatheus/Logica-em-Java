import java.util.Scanner;

public class Exemplo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		String nome;
		int idade =0, cont = 0, conto50=0, contIdade=0,contPeso=0;
		double peso=0, altura=0,somaAltura=0;
		
		
		
		
		while(cont<2) {
			System.out.println("Digite a Idade");
			idade= entrada.nextInt();
			System.out.println("Digite a altura");
			altura= entrada.nextInt();
			System.out.println("Digite o Peso");
			peso= entrada.nextDouble();
		}


	}

}
