import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		NumberFormat nf = new DecimalFormat ("R$ ###0.00");

		double divida = 0, total =0, juros = 0, valParc=0,valJuros =0;
		int numParc=0;
		
		

		System.out.println("Digite o valor");
		divida = e.nextDouble();
		
		//iniciando variaveis da primeira linha
				total = divida;
				numParc = 1;
				valParc = divida;

		System.out.println("Total: " + total + "juros" + "numero de parcelas: " +
				numParc + "Valor da Parcela: "+ valParc);
		
		juros = juros +10;
		numParc=numParc+2;
		
		for(int i=0; i<4; i++) {
			
			valJuros = (divida * juros)/100;
			
			total = divida + valJuros;
			
			valParc = total/numParc;
			
			System.out.println("Total: " + total + "juros" + "numero de parcelas: " +
					numParc + "Valor da Parcela: "+ nf.format(valParc));
			
			numParc = numParc +3;
			juros = juros+5;
		}

	}

}
