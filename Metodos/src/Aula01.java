import java.util.Scanner;

public class Aula01 {
	
	//Para ser utilizado em todos os métodos
	static Scanner e = new Scanner(System.in);
	public static void main(String[] args) {
		
	
		verifica();
		


	}//fecha Main

	
	//Procedimento sempre vai ser Void
	public static void verifica() {
		int num = 0;
		
		System.out.print("Digite um numero: ");
		num = e.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}	
	}
	
	
	
}
