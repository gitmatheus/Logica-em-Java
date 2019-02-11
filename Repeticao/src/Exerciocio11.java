import java.util.Scanner;

public class Exerciocio11 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in); 

		int num=0, numMaior=0,numMenor=0;



		for(int i=1;i<5;i++) {
			System.out.println("Digite 10 numeros");
			num=e.nextInt();
			if(num>numMaior) {
				numMaior=num;
			}if(num<numMenor) {
				numMenor=num;
			}
			
			if(i==1) {
				numMenor = num;	
			}

		}

		System.out.println("Maior Número: " + numMaior);
		System.out.println("Menor Número: " + numMenor);

		e.close();



	}

}


