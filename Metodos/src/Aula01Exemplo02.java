import java.util.Scanner;

public class Aula01Exemplo02 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {

		int num = 0;

		while (num != 5) {

			System.out.println(
					"Digite uma op��o:\n 1 - Adi��o \n " + "2 - Subtrair \n" + "3 - Multiplicar \n" + "4 - Dividir");

			num = e.nextInt();

			switch (num) {
			case 1:
				somar();
				break;
			case 2:
				subtratir();
				break;
			case 3:
				multiplicar();
				break;
			case 4:
				dividir();
				break;
			case 5:
				System.out.println("Fim do Programa");
				break;

			}

		}

	}//

	public static void somar() {
		System.out.println("Rotina Adi��o");
		int a = 0, b = 0;

		System.out.print("Digite um valor: ");
		a = e.nextInt();
		System.out.print("Digite outro valor: ");
		b = e.nextInt();
		System.out.println("Resultado � :" + (a + b) + "\n");
	}

	public static void subtratir() {
		System.out.println("Rotina Subtratir");
		int a = 0, b = 0;

		System.out.print("Digite um valor: ");
		a = e.nextInt();
		System.out.print("Digite outro valor: ");
		b = e.nextInt();
		System.out.println("Resultado � :" + (a - b) + "\n");

	}

	public static void multiplicar() {
		System.out.println("Rotina Multiplica��o");
		int a = 0, b = 0;

		System.out.print("Digite um valor: ");
		a = e.nextInt();
		System.out.print("Digite outro valor: ");
		b = e.nextInt();
		System.out.println("Resultado � :" + (a * b) + "\n");
	}

	public static void dividir() {
		System.out.println("Rotina Divis�o");
		int a = 0, b = 0;

		System.out.print("Digite um valor: ");
		a = e.nextInt();
		System.out.print("Digite outro valor: ");
		b = e.nextInt();
		System.out.println("Resultado � :" + (a / b) + "\n");
	}

}
