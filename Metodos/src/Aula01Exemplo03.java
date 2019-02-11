import java.util.Scanner;

public class Aula01Exemplo03 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {

		String nome;
		double preco = 0;
		int quant = 0;
		
		System.out.println("Digite o nome: ");
		nome= e.next();
		System.out.println("Digite o nome: ");
		quant= e.nextInt();
		System.out.println("Digite o preço");
		preco= e.nextDouble();
		
		calcular(nome,quant,preco);

	}//
	
	
	public static void calcular(String nome, int quant, double preco) {
		
		System.out.println("Nome: "+nome);
		System.out.println("Resultado" + quant*preco);
		System.out.println(preco);
		
	}

}
