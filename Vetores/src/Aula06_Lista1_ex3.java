import java.util.Scanner;

public class Aula06_Lista1_ex3 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		String[] Nomes = new String[10];
		String busca;
		
		for(int i=0; i<10;i++) {
			System.out.println("Digite nome "+(i+1)+":");
			Nomes[i]= e.next();
		}
		
		System.out.println("Digite nome para busca: ");
		busca= e.next();
		
		for(int i=0;i<10; i++) {
			if(Nomes[i].equalsIgnoreCase(busca)) {
				System.out.println("Achei"+" - Posi��o:"+ (i+1));
			}else {
				System.out.println("N�o Achei");
			}
		}

	}

}
