import java.util.ArrayList;
import java.util.Arrays;

public class Ex9 {

	public static void main(String[] args) {
		
		int[] Vetor1 = new int[] {3,5,4,2,2,5,3,2,5,9};
		int[] Vetor2 = new int[] {7,15,20,0,18,4,55,23,8,6};
		int[] Vetor3 = new int[20];
		int j=0;
		
		//intercalar vetores
		for(int i=0;i<10;i++) {
			
			Vetor3[j]= Vetor1[i];
			j++;
			Vetor3[j]= Vetor2[i];
			j++;
			
		}
		
		System.out.println(Arrays.toString(Vetor3));
		
		
			
		
		
		
	
		//System.out.println(Vetor3);

	}

}
