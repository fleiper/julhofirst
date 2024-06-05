package junhofirst;
import java.util.Scanner;
public class vetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a [] = new int [2];
		int b [] = new int [2];
		int c [] = new int [4];
		
		//ler vetor 1
		for(int i=0; i<2; i++) {
		System.out.println("informe o " +i + "° valor ");
		a[i] = ler.nextInt();
		System.out.println("informe o " +i + "° valor ");
		b[i] = ler.nextInt();
		}
		
		for(int i=0; i<2; i++) {
		c[i]= a[i];
		c[i+2]= b[i];
		}
		for (int i =0; i<4; i++) {
		System.out.println("informe o " +i+ "° valor "+c[i]);
		}
	}

}
}