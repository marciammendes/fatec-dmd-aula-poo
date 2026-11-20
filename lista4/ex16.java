package lista4;
import java.util.Arrays;
import java.util.Scanner;

public class exerc16 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		System.out.println("Digite 9 números inteiros:");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nMatriz original:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = i + 1; j < matriz[i].length; j++) {
				int temporaria = matriz[i][j];
				matriz[i][j] = matriz[j][i];
				matriz[j][i] = temporaria;
			}
		}
		
		System.out.println("\nMatriz transporta:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
	}
	
	private static Scanner sc = new Scanner (System.in);
}
