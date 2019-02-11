import java.util.Scanner;

public class Aula06_Lista1_ex2 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		double[] arrayTemp = new double[7];
		double somaTemp=0,media=0;
		int cont =0;
		//Carregar Temperaturas
		
		for(int i=0; i<7; i++) {
			System.out.println("Digite "+(i+1)+" Temperatura: ");
			arrayTemp[i]= e.nextDouble();
			somaTemp+=arrayTemp[1];
		}
		
		media=somaTemp/7;
		System.out.println("Media Temperaturas:" +media);
		
		//Verifica temperaturas da Semana
		
		for(int i=0; i<7;i++) {
			if(arrayTemp[i]>media) {
				cont++;
			}
		}
		
		System.out.println("Quant de Dias com Temperatura maior: "+cont);
		

	}

}
