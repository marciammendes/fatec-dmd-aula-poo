package lista4;
import java.util.Arrays;
import java.util.Scanner;

public class exerc05 {
	
	public static void main(String[] args) {
		System.out.println("Digite 10 números separados por espaço: ");
		int[] valores = new int[10];
		
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextInt();
		}
		System.out.print("\n" + Arrays.toString(valores));
		int totalPares = contarPares(valores);
		System.out.print("\nQtde de números pares: " + totalPares);
	}
	
	private static Scanner sc = new Scanner (System.in);
	
	private static int contarPares (int[] dados) {
		int pares = 0;
		for (int i = 0; i < dados.length; i++) {
			if (dados[i] % 2 == 0) {
				pares++;
			}
		}
		return pares;
	}
}
