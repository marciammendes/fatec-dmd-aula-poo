package lista5;
import java.util.Scanner;

public class exerc04 {
	
	private static Scanner sc = new Scanner (System.in);
	private static double soma = 0;
	
	public static void main(String[] args) {
		lerNota();
		mostrarResultado();
	}
	
	private static void lerNota() {
		for (int i = 1; i <= 3; i++) {
			System.out.print("Digite a nota " + i + ": ");
			soma += sc.nextDouble();
		}
	}
	
	private static double calcularMedia() {
		double media = soma / 3;
		return media;
	}
	
	private static void verificarSituacao() {
		if (calcularMedia() >= 6) {
			System.out.println("\nAluno aprovado");
		} else if (calcularMedia() >= 5 || calcularMedia() < 6) {
			System.out.println("\nAluno em recuperação");
		} else {
			System.out.println("\nAluno reprovado");
		}
	}
	
	private static void mostrarResultado() {
		System.out.print("\nNota final: " + calcularMedia());
		verificarSituacao();
	}
}
