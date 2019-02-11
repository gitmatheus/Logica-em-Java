import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double peso, altura, alturaInferior ;
		int idade , i,qtdpessoas = 0,olhosAzul=0,cabeloRuivo = 0;
		char corOlhos, corCabelo,idadeAlturaInferior = 0;

		for(i=0; i<3; ++i) {

			System.out.println("Digite sua Idade");
			idade= entrada.nextInt();

			System.out.println("Digite seu Peso");
			peso = entrada.nextDouble();

			System.out.println("Digite sua altura");
			altura= entrada.nextDouble();

			System.out.println("Digite a cor dos olhos");
			corOlhos = entrada.next().toUpperCase().charAt(0);


			System.out.println("Digite a cor do cabelo");
			corCabelo = entrada.next().toUpperCase().charAt(0);


			while(corOlhos != 'A' && corOlhos != 'B' && corOlhos != 'C' && corOlhos != 'D') {

				System.out.println("Digite uma cor dos Olhos Válida");
				corOlhos = entrada.next().toUpperCase().charAt(0);
			}
			
			while(corCabelo != 'P' && corCabelo != 'C' && corCabelo != 'L' && corCabelo != 'R') {

				System.out.println("Digite uma cor do cabelo Válida");
				corCabelo = entrada.next().toUpperCase().charAt(0);
			}
			
			if(idade < 50 && peso < 60) {
				
				qtdpessoas ++;
			}
			
			if(altura < 1.50 ) {
				idadeAlturaInferior ++;
			}
			
			if(corOlhos == 'A') {
				olhosAzul ++;
			}
			
			if(corCabelo == 'R') {
				cabeloRuivo ++;
			}


		}
		
		System.out.println(qtdpessoas);
		System.out.println(idadeAlturaInferior);


	}

}
