package aula4;
import java.util.Arrays;

public class exerc02 {
	
	public static void main(String[] args) {
		int[][] matriz = new int[][] {
			new int[9],
			new int[10],
			new int[8],
			new int[12],
			new int[6],
			new int[2],
			new int[1],
			new int[8]
		};
		
		int valor = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = valor;
				valor++;
			}
		}
		
		for (int[] arrayInterno : matriz) {
			System.out.println(Arrays.toString(arrayInterno));
		}
	}

}
