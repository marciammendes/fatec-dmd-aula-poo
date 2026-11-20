package lista4;

import java.util.Arrays;
import java.util.Scanner;

public class exerc25 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int soma = 0;
		System.out.println("Digite 9 números inteiros:");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nExibição da matriz:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == (2 - i)) {
					soma += matriz[i][j];
				}
			}
		}
		System.out.println("\nSoma da diagonal secundaria: " + soma);
	}
	
	private static Scanner sc = new Scanner (System.in);
}
