package aula5;

import java.util.Scanner;

public class exerc02 {
	
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		int [][] sala = new int [7][6];
		sala[0][0] = 1;
		System.out.println("Aluno na posição [0][0] já está definido como Presente.");
		int pessoasPresentes = 0;
		
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				if (i ==0 && j ==0) {
					continue;
				}
				boolean entradaValida = false;
				while(!entradaValida) {
					System.out.print("Aluno na posição [" + i + "][" + j + "] presente? [S/N]: ");
					String resposta  = sc.nextLine().toUpperCase();
					
					if (resposta.equals("S")) {
						sala[i][j] = 1;
						entradaValida = true;
					} else if (resposta.equals("N")) {
						sala[i][j] = 0;
						entradaValida = true;
					}
				}
			}
		}
		
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				pessoasPresentes += sala[i][j];
			}
		}
		System.out.println("\nSão " +  pessoasPresentes + " pessoas presentes.");
	}
}
