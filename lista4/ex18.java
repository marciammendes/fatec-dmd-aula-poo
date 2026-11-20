package lista4;
import java.util.Arrays;
import java.util.Scanner;

public class exerc18 {

	public static void main(String[] args) {
		int[][] matriz1 = new int[3][3];
		int[][] matriz2 = new int[3][3];
		
		System.out.println("Digite 9 números inteiros para a primeira matriz:");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < matriz1.length; i++) {
			System.out.println(Arrays.toString(matriz1[i]));
		}
		
		System.out.println("\nDigite 9 números inteiros para a primeira matriz:");
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				matriz2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println(Arrays.toString(matriz2[i]));
		}
		
		int[][] matriz3 = matrizResultado(matriz1, matriz2);
		System.out.println("\nMatriz com elementos multiplicados");
		for (int i = 0; i < matriz3.length; i++) {
			System.out.println(Arrays.toString(matriz3[i]));
		}
	}
	
	private static Scanner sc = new Scanner (System.in);
	
	private static int[][] matrizResultado (int[][] m1, int[][] m2){
		int[][] resultado = new int[3][3];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0;j < m1.length; j++) {
				resultado[i][j] = m1[i][j] * m2[i][j];
			}
		}
		return resultado;
	}
	
}
