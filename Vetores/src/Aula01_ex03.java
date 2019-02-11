import java.util.Arrays;
import java.util.Scanner;

public class Aula01_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		int[] num = new int[10];
		int total=0;
		
		for(int i=0; i<10;i++) {
			
			System.out.println("Numero: ");
			num[i] = e.nextInt();
			
			total += num[i];
			
		}
		
		System.out.println("A media é:" + total/10);
		
	
		
		
		
		

	}

}
