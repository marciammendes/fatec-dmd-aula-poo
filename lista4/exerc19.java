package lista4;

import java.util.Arrays;
import java.util.Scanner;

public class exerc19 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		System.out.println("Digite 9 números inteiros separados por espaço: ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nLeitura da matriz 3x3:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		if (matrizIdentidade(matriz)) {
			System.out.println("\nA matriz é uma matriz identidade");
		} else {
			System.out.println("\nA matriz não é uma matriz identidade");
		}
	}
	
	private static Scanner sc = new Scanner (System.in);
	
	private static boolean matrizIdentidade (int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j && matriz[i][j] != 1) {
					return false;
				}
				if (i != j && matriz[i][j] != 0) {
					return false;
				}
			}
		}
		return true; 
	}
}
