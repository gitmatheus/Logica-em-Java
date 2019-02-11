import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		DecimalFormat FM = new DecimalFormat("R$ ###0.00");

		int cont=0,codCliente =0,codDvd=0,numLocacao =0,quantDvd=0;
		double valorLocacao = 0,valTotalDvd=0;
		char tipoDvd =' ';
		String locacao = "sim",alugaDvd = "sim";



		while (locacao.equalsIgnoreCase("sim")){
			numLocacao++;
			//System.out.println(numLocacao +"° Locação");


			System.out.println("Digite o codigo do cliente");
			codCliente= e.nextInt();

			while(alugaDvd.equalsIgnoreCase("sim") ) {

				quantDvd++;

				System.out.println("Digite o código do DVD");
				codDvd = e.nextInt();
				System.out.println("Digite o tipo do DVD");
				tipoDvd = e.next().toUpperCase().charAt(0);

				//Verifica o codigo e tipo do DVD usando encadeamento.

				/*
				if((codDvd <= 10) && (tipoDvd == 'A')){
					valorLocacao = 8;
				}else if((codDvd <= 10) && (tipoDvd == 'C')){
					valorLocacao = 12;
				}else if((codDvd <= 10) && (tipoDvd == 'D')){
					valorLocacao = 10;
				}else {
					if((codDvd <= 20) && (tipoDvd == 'A')) {
						valorLocacao = 5;
					}else if((codDvd <= 20) && (tipoDvd == 'C')){
						valorLocacao = 7;
					}else if((codDvd <= 20) && (tipoDvd == 'D')){
						valorLocacao = 9;
					}
				}*/
				//Verifica o codigo e tipo do DVD usando multipla escolha.
				switch(tipoDvd) {
				case 'A':
					if(codDvd <= 10) {
						valorLocacao = 8;
					}else {
						valorLocacao = 5;
					}
					break;
				case 'C':
					if(codDvd <= 10) {
						valorLocacao = 12;
					}else {
						valorLocacao = 7;
					}
					break;
				case 'D':
					if(codDvd <= 10) {
						valorLocacao = 10;
					}else {
						valorLocacao = 9;
					}
					break;
				} //fecha switch


				valTotalDvd += valorLocacao;




				System.out.println("Deseja Alugar outro DVD?");
				alugaDvd = e.next();	

			}


			//Aplica a Promoção
			if(quantDvd >= 4) {
				valTotalDvd = valTotalDvd * 0.95;
			}

			System.out.println("Aquantidade de DVDs é: "+ quantDvd);
			System.out.println("O Valor da Locação é de: "+ FM.format(valorLocacao));
			System.out.println();




			System.out.println("Aquantidae de DVDs é: " + quantDvd);


			System.out.println("Deseja Fazer uma nova locacão");
			locacao = e.next();
			if(locacao.equalsIgnoreCase("sim")) {
				alugaDvd = "sim";
			}




		}


		System.out.println("A quantidade de Locações foi: " + numLocacao);





		e.close();


	}

}
