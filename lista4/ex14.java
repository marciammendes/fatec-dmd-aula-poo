package lista4;
import java.util.Arrays;
import java.util.Scanner;

public class exerc14 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		System.out.println("Digite 16 números: ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nExibição da matriz:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		int resultado = buscarMaior(matriz);
		System.out.print("\nMaior valor: " + resultado);
	}
	
	private static Scanner sc = new Scanner (System.in);
	
	private static int buscarMaior (int[][] num) {
		int maior = num[0][0];
		for(int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] > maior) {
					maior = num[i][j];
				}	
			}
		}
		return maior;
	}
}
