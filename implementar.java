package junhofirst;
import java.util.Scanner;
public class implementar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int fat = 1, num;

		System.out.print("informe o fatorial: ");
		num = ler.nextInt();

		if (num <0 ) {
			System.out.println("NÃO EXISTE FATORIAL DE NUMEROS NEGATIVOAS ");
		}
			if (num>0);
				for (int i = 1; i <= num; i++) {
					fat *= i;
				}
				System.out.println("O FATOIAL DE " + num+ " É "+fat);
			}
		}
	
	

