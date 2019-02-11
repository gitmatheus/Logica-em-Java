import java.util.Scanner;

public class Aula3_Ex10 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		int codProduto = 0, codPais = 0;
		double peso = 0,pesoEmGramas = 0,PrecoTotal = 0,valorImposto = 0,precoFinal = 0;



		System.out.println("Codigo do Produto");
		codProduto = e.nextInt();
		System.out.println("Peso dio Produto");
		peso = e.nextDouble();
		System.out.println("Codigo do Pais");
		codPais = e.nextInt();
		System.out.println();


		pesoEmGramas = peso * 1000;

		if(codProduto <= 4) {
			PrecoTotal = pesoEmGramas * 15;
		}else {
			if(codProduto <= 7) {
				PrecoTotal = pesoEmGramas *25;	
			}else {
				PrecoTotal = pesoEmGramas * 35;
			}
		}

		switch (codPais) {
		case 1:
			valorImposto = 0;
			break;
		case 2:
			valorImposto = PrecoTotal * 0.15;
			break;
		case 3:
			valorImposto = PrecoTotal * 0.25;
			break;
		default:
			break;
		}

		precoFinal = PrecoTotal +  valorImposto;

		System.out.println("Peso do Produto: " + pesoEmGramas);
		System.out.println("Preço total do produto: R$" + PrecoTotal);
		System.out.println("Valor do Imposto: R$" + valorImposto);
		System.out.println("Valor total do produto mais impostos: R$"+ precoFinal);


		e.close();
	}

}
