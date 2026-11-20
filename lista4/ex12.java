package lista4;
import java.util.Arrays;
import java.util.Scanner;

public class exerc12 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		System.out.println("Digite 9 números inteiros:");
		int soma = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
				soma += matriz[i][j];
			}
		}
		System.out.println("\nExibição da matriz:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		System.out.println("\nSoma dos elementos: " + soma);
	}
	
	private static Scanner sc = new Scanner (System.in);
}
