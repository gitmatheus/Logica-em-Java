import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		int num[][] = new int[5][2];
		double val[][] = new double[5][2];
		double totGeral = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Produto " + (i + 1));

			System.out.println("Código:");
			num[i][0] = e.nextInt();

			System.out.println("Preço");
			val[i][0] = e.nextDouble();

			System.out.println("Quantidade: ");
			num[i][1] = e.nextInt();

			val[i][1] = val[i][0] * num[i][1];
			totGeral += val[i][1];
	
		}
		System.out.println("");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i][0]+"\t"+val[i][0]+
					"\t" +num[i][1]+ "\t"+val[i][1]);
					
					
			
		}
		System.out.println("Total geral: "+ totGeral);

	}

}
