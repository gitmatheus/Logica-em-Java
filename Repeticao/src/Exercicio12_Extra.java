import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12_Extra {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		DecimalFormat fm = new DecimalFormat("R$ ###0.00");

		char refri, cat;
		double precoUnit=0, precoFinal = 0;
		int cont = 0;

		//

		while (cont < 1) {
			cont++;
			System.out.println("******PRODUTO N�"+cont +"********");
			
			


			System.out.println("Digite o Valor do produto");
			precoUnit = e.nextDouble();

			System.out.println("Refrigera��o??");
			refri = e.next().toUpperCase().charAt(0);

			while(refri != 'S' && refri != 'N') {

				System.out.println("Digite 'S' ou 'N' para Refrigera��o!!");
				refri = e.next().toUpperCase().charAt(0);
			}

			System.out.println("Categoria do produto ");
			System.out.println("A - Alimenta��o");
			System.out.println("L - Limpesa");
			System.out.println("v - Vestu�rio");
			cat = e.next().toUpperCase().charAt(0);

			while((cat != 'A' && cat != 'L') && cat != 'V')  {

				System.out.println("Digite 'A' , 'L' ou 'V' para Categoria!!");
				cat = e.next().toUpperCase().charAt(0);
			}

			if(precoUnit < 20 && refri == 's') {
				precoUnit = precoUnit;

			}else if(precoUnit < 20 && refri == 'N') {
				switch (cat) {
				case 'A':
					precoUnit += 2;
					break;
				case 'L':
					precoUnit += 3;
					break;
				case 'V':
					precoUnit += 4;
					break;
				}
			}else if(precoUnit >=20 && precoUnit <=50) {
				if(refri =='S') {
					precoUnit += 6;
				}else {
					precoUnit = precoUnit;
				}
			}else {
				if(refri == 'S') {
					switch (cat) {
					case 'A':
						precoUnit += 5;
						break;
					case 'L':
						precoUnit += 2;
						break;
					case 'V':
						precoUnit += 4;
						break;
					}
				}else {
					if(cat == 'A' || cat =='V') {
						precoUnit = precoUnit;
					}else {
						precoUnit += 1;
					}
				}
			}
			
			//Fim da verifica��o da Tabela
			
			//Aplica Imposto
			if(cat == 'A' && refri =='S') {
				
				precoFinal = precoUnit + precoUnit*0.04;
				
			}else {
				precoFinal = (precoUnit + precoUnit*0.02);
			}
			
		}
		
		System.out.println("O pre�o Final foi " + precoFinal);









	}

}
