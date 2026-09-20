package lista2;

//Pacote Scanner
import java.util.Scanner;

public class exerc01 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.println("POSITIVO, NEGATIVO OU ZERO");
		System.out.println("==========================");
		System.out.println("Insira um número inteiro: ");
		int numero = sc.nextInt();
		System.out.println();
		if (numero > 0) {
			System.out.print("Positivo");
		} if (numero < 0) {
			System.out.print("Negativo");
		} if (numero == 0) {
			System.out.print("Zero");
		}
		sc.close();
	}
}
