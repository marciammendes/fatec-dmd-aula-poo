package lista3;

import java.util.Scanner;

public class exerc11 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("VALIDAÇÃO DE NÚMERO");
		System.out.println("===================\n");
		boolean executando = true;
		//int soma = 0;
		
		while (executando) {
			System.out.println("Digite um número de 1 a 10: ");
			int num = sc.nextInt();
			if (num != 2) {			
				executando = true;
			} else {
				executando = false;
			}
		}
		System.out.println("\nEncerrando o programa.");
	}
}
