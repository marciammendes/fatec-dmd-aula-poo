package lista2;

//Pacote Scanner
import java.util.Scanner;

public class exerc02 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.println("PAR OU ÍMPAR");
		System.out.println("============");
		System.out.println("Insira um número inteiro: ");
		int numero = sc.nextInt();
		System.out.println();
		if (numero % 2 == 0) {
			System.out.println("Par");
		} if (numero % 2 != 0) {
			System.out.println("Ímpar");
		}
	}
}
