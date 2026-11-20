package lista4;
import java.util.Arrays;
import java.util.Scanner;

public class exerc15 {
	
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int contador = 0;
		System.out.println("Digite 9 números inteiros:");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nVisualização da matriz:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] % 2 == 0) {
					contador++;
				}
			}
		}
		
		System.out.println("\nQuantidade de números pares: " + contador);
	}
	
	private static Scanner sc = new Scanner (System.in);
}
