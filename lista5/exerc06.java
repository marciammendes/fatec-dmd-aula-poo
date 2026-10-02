package lista5;
import java.util.Scanner;

public class exerc06 {

	private static Scanner sc = new Scanner (System.in);
	private static int num;
	
	public static void main(String[] args) {
		lerNumero();
		exibirTabuada();
	}
	
	private static void lerNumero() {
		System.out.println("TABUADA");
		System.out.print("\nDigite um número inteiro: ");
		num = sc.nextInt();
	}
	
	private static void mostrarLinha() {
		for (int i = 1; i <= 10; i++) {
			int resultado = num * i;
			System.out.println(num + " x " + i + " = " + resultado);
		}
	}
	
	private static void exibirTabuada() {
		for (int i = 1; i <= 10; i++) {
			mostrarLinha();
		}
	}
}
