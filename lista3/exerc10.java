package lista3;

import java.util.Scanner;

public class exerc10 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("SOMA ATÉ DIGITAR ZERO");
		System.out.println("=====================\n");
		boolean somatorio = true;
		int soma = 0;
		
		while (somatorio) {
			System.out.println("Digite um número: ");
			int num = sc.nextInt();
			if (num != 0) {			
			soma += num;
			} else {
				somatorio = false;
			}
		}
		System.out.println("\nSoma é igual a " + soma);
	}
}
