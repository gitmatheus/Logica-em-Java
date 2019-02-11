import java.util.Scanner;

public class Aula01Exemplo04 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {

		int num = 0;

		
		while (num !=5) {
			
			System.out.println(
					"Digite uma opção:\n 1 - Adição \n " + "2 - Subtrair \n" + "3 - Multiplicar \n" + "4 - Dividir");
			num = e.nextInt();
			int a = 0, b = 0;
			
			if(num>0 && num <5) {			
				System.out.print("Digite um valor: ");
				a = e.nextInt();
				System.out.print("Digite outro valor: ");
				b = e.nextInt();				
			}
			
			switch (num) {
			case 1:
				somar(a,b);
				break;
			case 2:
				subtratir(a,b);
				break;
			case 3:
				multiplicar(a,b);
				break;
			case 4:
				dividir(a,b);
				break;
			case 5:
				System.out.println("Fim do Programa");
				break;

			}

		}

	}//

	public static void somar(int a, int b) {

		System.out.println("Rotina Adição");	
		double r=0;
		r=a+b;
		System.out.println("Resultado é :" + r+"\n");
	}

	public static void subtratir(int a, int b) {
		System.out.println("Rotina Subtratir");
		double r=0;
		r=a-b;
		System.out.println("Resultado é :" + r +"\n");

	}

	public static void multiplicar(int a, int b) {
		System.out.println("Rotina Multiplicação");
		double r=0;
		r=a*b;
		System.out.println("Resultado é :" + r+"\n");
	}

	public static void dividir(int a, int b) {
		System.out.println("Rotina Divisão");
		double r=0;
		r=a/b;
		System.out.println("Resultado é :" + r+"\n");
	}

}
