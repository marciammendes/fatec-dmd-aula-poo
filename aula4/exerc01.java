package aula6;
import java.util.Arrays;

public class exerc01 {
	public static void main (String[] args) {
		int [][] sala = {
				{1,0,0,1,1,0},
				{1,1,0,0,0,0},
				{1,0,1,0,0,0},
				{1,0,0,0,0,0},
				{0,1,0,0,0,0},
				{0,1,1,1,1,1},
				{1,0,1,0,1,1},
				};
		int total = somaMatriz(sala);
		System.out.println("\nTotal de alunos = " + total);
	}
	
	private static int somaMatriz (int [][] m) {
		int soma = 0;
		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
			for (int j = 0; j < m[i].length; j++) {
				soma += m[i][j];
				}
		}
		return soma;
	}
	
	private static void soma (int[] m) {
		int soma = 0;
		}
}