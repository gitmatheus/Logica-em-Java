import java.util.Scanner;

public class Aula01_ex01 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		
		String[] times = new String[5];
		
		//Carregar Vetor
		for(int i=0; i<5; i++) {
			System.out.println("Digite o time "+(i+1)+":");
			times[i]=e.next();
			
			
		}
		
		//exibir Vetor
		for(int i=0;i<5;i++) {
			System.out.println("Vetor de times["+i+"]: " + times[i]);
		
		}

	}

}
