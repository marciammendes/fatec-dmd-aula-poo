package lista4;

import java.util.Arrays;
import java.util.Scanner;

public class exerc02 {

public static void main(String[] args) {
		
		System.out.println("Insira 10 números inteiros separados por espaço: ");
		int[] dados = new int[10];
		for (int i = 0; i < dados.length; i++) {
			dados[i] = sc.nextInt();
		}
		System.out.print("\n" + Arrays.toString(dados));
		int resultado = soma(dados);
		System.out.print("\nSoma dos elementos: " + resultado);
	}
	
	private static Scanner sc  = new Scanner (System.in);
	
	private static int soma (int[] num) {
		int total = 0;
		for (int i = 0; i < num.length; i++) {
			total += num[i];
		}
		return total;
	}
}
