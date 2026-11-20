package lista4;
import java.util.Scanner;

public class exerc07 {
	
	public static void main(String[] args) {
		System.out.println("Digite 10 números inteiros separados por espaço: ");
		int[] dados = new int[10];
		for (int i = 0; i < dados.length; i++) {
			dados[i] = sc.nextInt();
		}
		
		System.out.print("\nInsira o valor de X: ");
		int x = sc.nextInt();
		
		boolean encontrado = buscarElemento(dados, x);
		if (encontrado) {
			System.out.print("\nX (" + x + ") está presente no array");
		} else {
			System.out.print("\nX (" + x + ") não está presente no array");
		}
	}
	
	private static Scanner sc = new Scanner (System.in);
	
	private static boolean buscarElemento (int[] busca, int x) {
		
		for (int i = 0; i < busca.length; i++) {
			if (busca[i] == x) {
				return true;
			}
		}
		return false;
	}
}
