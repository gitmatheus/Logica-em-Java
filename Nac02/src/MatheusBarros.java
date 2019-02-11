import java.text.DecimalFormat;
import java.util.Scanner;

public class MatheusBarros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		DecimalFormat fm = new DecimalFormat("R$ ###0.00");

		String nome,codigo,venda;
		double valorProduto=0, valCompra=0;
		int numVendas = 0,quantParcelas,numVendasVista = 0,numVendasPrazo = 0,fp = 0;
		char compra;

		//inicialização de variaveis
		venda = "sim";

		

		while(venda.equalsIgnoreCase("sim")) {
			numVendas ++;
			compra = 's';

			System.out.println("Digite os dados da " + numVendas + "° Venda"  );

			System.out.println("Digite o nome do cliente: ");
			nome = e.next();

			while(compra=='s') {

				System.out.println("Digite o código do produto: ");
				codigo = e.next();

				System.out.println("Digite o valor do produto: ");
				valorProduto = e.nextDouble();

				System.out.println("Deseja continuar? Digite sim ou não ");
				compra = e.next().charAt(0);	

				valCompra = valCompra + valorProduto;

			}//fim 2º while COMPRA

			System.out.println("Valor da compra: "+fm.format(valCompra));
			System.out.println(" ");

			System.out.println("Formas de Pagamento");
			System.out.println("1 - À Vista");
			System.out.println("2 - À Prazo");
			System.out.println("Digite a forma de pagamento: ");
			fp = e.nextInt();

			while((fp != 1) && (fp != 2)){
				System.out.println("Digite a forma de pagamento correta: ");
				fp = e.nextInt();
			}


			//If de Controle forma de pagamento
			if(fp == 2) {
				numVendasPrazo++;
				System.out.println("Quantidade de parcelas para pagamento: ");
				quantParcelas = e.nextInt();

				while(quantParcelas <1 || quantParcelas > 12) {
					System.out.println("Numero de parcelas somente em até 12x. Digite o numero de parcelas: ");
					quantParcelas = e.nextInt();
				}

				for(int i=2;i<=quantParcelas;i++) {

					System.out.println("Em "+ i+"x parcelas de : "+ fm.format((valCompra + valCompra * 0.04)/i));
				}

			}else{
				numVendasVista++;
				System.out.println("O valor da compra é: "+ fm.format(valCompra - (valCompra*0.15)));
			}// fim If de Comtrole

			
			//Verifica se vai haver mais vendas e mostra a quantidade de vendas a vista e a prazo.
			System.out.println("Deseja cadastrar uma nova venda?");
			venda = e.next();
			if(venda.equalsIgnoreCase("sim")) {
				valCompra = 0;
			}else {
				System.out.println("A quantidade de Vendas a vista foi: "+ numVendasVista);
				System.out.println("A quantidade de Vendas a Prazo foi: "+ numVendasPrazo);		
			}


		} //fim 1º while VENDA
	}
}
