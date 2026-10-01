package lista4;
import java.util.Scanner;

public class exerc08 {
	
	public static void main(String[] args) {
		System.out.println("Insira 10 números inteiros separados por espaço: ");
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.print("\nInsira um valor de X: ");
		int x = sc.nextInt();
		int resultado = contagem(num, x);
		System.out.print("\nO valor " + x + " aparece " + resultado + " vezes no array");
	}
	
	private static Scanner sc = new Scanner (System.in);
	
	private static int contagem (int[] dados, int x) {
		int contador = 0;
		for (int i = 0; i < dados.length; i++) {
			if (dados[i] == x) {
				contador++;
			}
		}
		return contador;
	}
}
