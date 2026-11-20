package lista4;
import java.util.Scanner;
import java.util.Arrays;

public class exerc23 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		System.out.println("Digite 9 números inteiros: ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		int[][] novaMatriz = girarMatriz(matriz);
		System.out.println("\nMatriz com rotação de 90°: ");
		for (int i = 0; i < novaMatriz.length; i++) {
			System.out.println(Arrays.toString(novaMatriz[i]));
		}
	}
	
	private static Scanner sc= new Scanner (System.in);
	
	private static int[][] girarMatriz (int[][] matriz) {
		int novaMatriz[][] = new int[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				novaMatriz[j][2 - i] = matriz[i][j];
			}
		}
		return novaMatriz;
	}
}
