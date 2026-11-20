package lista4;
import java.util.Arrays;
import java.util.Scanner;

public class exerc09 {

	public static void main(String[] args) {
		System.out.println("Digita 10 números inteiros separados por espaço: ");
		int[] dados = new int[10];
		for (int i = 0; i < dados.length; i++) {
			dados[i] = sc.nextInt();
		}
		int[] resultado = ordenarNumeros(dados);
		System.out.println("\nArray em ordem crescente: " + Arrays.toString(resultado));
	}
	
	private static Scanner sc = new Scanner (System.in);
	
	private static int[] ordenarNumeros (int[] dados) {
		for (int i = 0; i < dados.length - 1; i++) {
			for (int j = 0; j < dados.length - 1 - i; j++) {
				if (dados[j] > dados[j + 1]) {
					int varTemporaria = dados[j];
					dados[j] = dados[j + 1];
					dados[j + 1] = varTemporaria;
				}
			}
		}
		return dados;
	}
}
