package lista4;

import java.util.Arrays;
import java.util.Scanner;

public class exerc17 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		System.out.println("Digite 9 números inteiros:");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		System.out.print("\nDigite um número inteiro para multiplicação: ");
		int escalar = sc.nextInt();
		
		int[][] novaMatriz = novaMatriz(matriz,escalar);
		
		System.out.println("\nMatriz multiplicada por escalar:");
		for (int i = 0; i < novaMatriz.length; i++) {
			System.out.println(Arrays.toString(novaMatriz[i]));
		}
	}
	
	private static Scanner sc = new Scanner (System.in);
	
	private static int[][] novaMatriz (int[][] matriz, int escalar){
		int[][] novaMatriz = new int[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				novaMatriz[i][j] = matriz[i][j] * escalar; 
			}
		}
		return novaMatriz;
	}
}
