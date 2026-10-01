package lista4;

import java.util.Arrays;
import java.util.Scanner;

public class exerc24 {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		System.out.println("Digite 25 números inteiros: ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		System.out.print("\nQual número deseja encontrar: ");
		int num = sc.nextInt();
		int[] posicao = buscaNum(matriz, num);
		
		if (posicao != null) {
			System.out.println("\nNúmero " + num + " encontrado na posição [" + posicao[0] + "][" + posicao[1] + "]");
		} else {
			System.out.println("\nNúmero " + num + " não foi encontrado na matriz");
		}
	}
	
	private static Scanner sc= new Scanner (System.in);
	
	private static int[] buscaNum (int[][] matriz, int num) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
					if (matriz[i][j] == num) {
						return new int[] {i, j};
					}
				}
			}
		return null;
	}
}
