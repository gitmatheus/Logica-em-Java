import java.util.Scanner;

public class Aula06_Lista2_ex10 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		String[] Vendedor = new String[4];
		double[] Vendas = new double[4];
		double[] Comissao = new double[4];
		String[] Estado = new String[4];
		
		
		for(int i=0;i<4;i++) {
			
			System.out.println("Digite o nome do vendedor: ");
			Vendedor[i]= e.nextLine();
			
			System.out.println("Digite o total das vendas: ");
			Vendas[i] = e.nextDouble()/100;
			
			System.out.println("Digite o percentual das comissões: ");
			Comissao[i] = e.nextDouble()/100;
			
			System.out.println(Comissao[i]);
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
