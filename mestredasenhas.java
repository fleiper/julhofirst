package junhofirst;
import java.util.Scanner;
public class mestredasenhas {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int primeiro, segundo,soma, senha,tentativa;
		
		System.out.println("utilizando APENAS numeros, cadastre uma senha: ");
		senha = ler.nextInt();
		System.out.println("Qual o primeiro valor da conta?: ");
		primeiro = ler.nextInt();
		
		System.out.println("Qual o segundo valor da conta?: ");
		segundo = ler.nextInt();
		
		soma = primeiro+segundo;
		
		System.out.println("escreva a senha para a soma ser desbloqueada ");
		tentativa = ler.nextInt();
		
		if (tentativa == senha);
			System.out.println("A soma é de: " +soma);
	
		if (tentativa != senha);
			System.out.println("SENHA ERRADA");
	
		}
	}


