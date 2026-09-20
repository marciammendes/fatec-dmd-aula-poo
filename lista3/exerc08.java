package lista3;

import java.util.Scanner;

public class exerc08 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("MÉDIA DE VALORES");
		System.out.println("================\n");
		System.out.println("Quantos números deseja informar: ");
		int num = sc.nextInt();
		double soma = 0;
		
		for (int n = 1; n <= num; n++) {
			System.out.println("Informe o " + n + "° número: ");
			double valor = sc.nextInt();
			
			soma += valor;
		}
		
		if (num > 0) {
			double media = soma / num;
			System.out.printf("%nMédia dos valores: %.2f%n", media);
		} else {
			System.out.printf("\nQuantidade inválida.");
		}
	}
}
