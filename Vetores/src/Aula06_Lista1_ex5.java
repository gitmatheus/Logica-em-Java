import java.util.Scanner;

public class Aula06_Lista1_ex5 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		String[] Meses = new String[] {"Jan", "Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
		double[] Temp = new double[12];
		double maiorT=0,menorT =0;
		int maiorM=0,menorM=0;

		for(int i=0; i<12; i++) {
			System.out.println("Digite a Temperatura do Mes: "+Meses[i]+":");

			Temp[i]= e.nextDouble(); 



			if(i==0) {
				maiorT=Temp[i];
				menorT = Temp[i];
				maiorM = 0;
				menorM =0;
			}else if(Temp[i] > maiorT) {
				maiorT = Temp[i];
				maiorM = i;

			}else {
				if(Temp[i] < menorT) {
					menorT = Temp[i];
					menorM= i;
				}
			}
		}

		System.out.println("A maior temperatura foi: "+ maiorT +" no mes de " + Meses[maiorM]);
		System.out.println("A menor temperatura foi: "+ menorT +" no mes de " + Meses[menorM]);


	}

}
