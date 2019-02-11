import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		DecimalFormat FM = new DecimalFormat("R$ ###0.00");
		
		
		
		
		String resp="sim";
		int cont=1, cp=0;
		double pe= 0,total=0,valFinal = 0;
		
		
		
		//1° Gerencia compra
		while(resp.equalsIgnoreCase("Sim")) {
			
			System.out.println(cont+"° Compra");
			System.out.println();
			
			System.out.println("Digite PE: ");
			pe= e.nextDouble();
			
			//2° Gerencia item:
			
			while(pe!=0) {
				total+=pe;
				System.out.println("Digite PE");
				pe= e.nextDouble();
				
			} //fim 2
			
			System.out.println("Valor da Compra:" +total);
			System.out.println("Forma de Pagamento:");
			cp= e.nextInt();
			
			//validação forma de pagamento
			
			while(cp<1 || cp>4) {
				System.out.println("Digite a forma de pagamento");
				cp=e.nextInt();
			}
			
			if(cp==1) {
				valFinal = total * 0.9;
				System.out.println("Valor Final:"+valFinal);
			}else if(cp==2) {
				valFinal = total * 0.95;
				System.out.println("Valor Final:"+valFinal);
			}else if(cp==3) {
				valFinal = total/2;
				System.out.println("Valor Final:"+valFinal);
			}else {
				valFinal = (total *1.1)/3;
				System.out.println("Valor Final:"+valFinal);
			}
			
			total = 0;
			cont ++;
			System.out.println("Deseja Continuar?");
			resp=e.next();
			
		}

	}

}
