import java.text.DecimalFormat;
import java.util.Scanner;


public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("###0.00");
		
		int voto = 0, cand1 =0, cand2=0,cand3=0,cand4=0,cand5=0,cand6=0;
		int contador = 0;
		double percNulos = 0, percBrancos = 0;
		
		System.out.println("Digite o voto: ");
		voto = e.nextInt();
		
		while(voto != 0) {
			switch(voto) {
			case 1:
				cand1++;
				break;
			case 2:
				cand2++;
				break;
			case 3:
				cand3++;
				break;
			case 4:
				cand4++;
				break;
			case 5:
				cand5++;
				break;
			case 6:
				cand6++;
				break;
				default:
					System.out.println("Digite o voto corretamente: ");
					voto = e.nextInt();
					contador--;
					System.out.println(contador);
			}
			
			contador++;
			System.out.println("Digite o voto:");
			voto = e.nextInt();
			
		}
		
		percNulos=(double) cand5 / contador *100;
		percBrancos=(double) cand6 / contador * 100;
		
		System.out.println("Candidato 1: " + cand1);
		System.out.println("Candidato 2: " + cand2);
		System.out.println("Candidato 3: " + cand3);
		System.out.println("Candidato 4: " + cand4);
		System.out.println("Votos Nulos: " + cand5);
		System.out.println("Votos em Branco: " + cand6);
		
		System.out.println("Porcentagem de votos nulos: "+ format.format(percNulos) +"%");
		System.out.println("Porcentagem de votos Brancos: "+ format.format(percBrancos) +"%");
		
		e.close();
		
		

	}

}
