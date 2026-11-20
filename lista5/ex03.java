package lista5;
import java.util.Scanner;

public class exerc03 {
	
	private static Scanner sc = new Scanner (System.in);
	private static int numero;
	
	public static void main(String[] args) {
		System.out.print("Digite um número inteiro: ");
		lerNumero();
		mostrarResultado();
	}
	
	private static void lerNumero() {
		numero = sc.nextInt();
	}
	
	private static boolean ehPar() {
		return numero % 2 == 0;
	}
	
	private static void mostrarResultado() {
		if (ehPar()) {
			System.out.println("\nO número é par");
		} else {
			System.out.println("\nO número não é par");
		}
	}
}
