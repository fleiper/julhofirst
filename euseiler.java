package junhofirst;
import java.util.Scanner;
public class euseiler {

	public static void main(String[] args) {
		
		//instaciar ckasse Scanner
		Scanner ler = new Scanner (System.in);
		//variavel
		double numero;
		
		//entrada de dados
		System.out.print("informe um valor: ");
		numero = ler.nextDouble();
		
		//execução e comando
		if (numero % 5 ==0)
			System.out.println("O Numero "+numero+" é um multiplo de cinco");
		if (numero % 5 !=0)
			System.out.println(numero+" NÃO É MULTIPLO DE CINCO");
		}

	}
