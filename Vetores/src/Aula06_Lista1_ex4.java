import java.util.Scanner;

public class Aula06_Lista1_ex4 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		String[] Nomes = new String[10];
		String busca;
		int cont =0;
		
		for(int i=0; i<10;i++) {
			System.out.println("Digite nome "+(i+1)+":");
			Nomes[i]= e.next();
		}
		
		System.out.println("Digite nome para busca: ");
		busca= e.next();
		
		for(int i=0;i<10; i++) {
			if(Nomes[i].equalsIgnoreCase(busca)) {
				cont++;
			}
		}
		
		if(cont>0) {
			System.out.println("Achei");
		}else {
			System.out.println("Não Achei");
		}

	}

}
