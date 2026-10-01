package lista4;
import java.util.Arrays;
import java.util.Scanner;

public class exerc20 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		
		System.out.println("Digite 9 números inteiros:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
			}
		System.out.println();
		somaLinha(matriz);
		System.out.println();
		somaColuna(matriz);
	}
	
	private static Scanner sc = new Scanner (System.in);
	
	private static void somaLinha (int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			int somaLinha = 0;
			for (int j = 0; j < matriz.length; j++) {
				somaLinha += matriz[i][j];
			}
			System.out.println("Soma da linha " + (i + 1) + " = " + somaLinha);
		}
	}
	
	private static void somaColuna (int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			int somaColuna = 0;
			for (int j = 0; j < matriz.length; j++) {
				somaColuna += matriz[j][i];
			}
			System.out.println("Soma da coluna " + (i + 1) + " = " + somaColuna);
		}
	}
}
