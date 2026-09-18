package lista2;

import java.util.Scanner;

public class exerc16 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("CAIXA ELETRÔNICO");
		System.out.println("================");
		System.out.println("Valor do saque: ");
		int valor = sc.nextInt();
		System.out.println();
		
		if (valor < 1) {
			System.out.printf("Erro: Digite um valor válido maior ou igual a 1");
		} else {
			System.out.println("PROCESSANDO SAQUE...");
			}
		
		int notas100 = valor/100;
		valor = valor % 100;
		
		int notas50 = valor/50;
		valor = valor % 50;
		
		int notas20 = valor/20;
		valor = valor % 20;
		
		int notas10 = valor/10;
		valor = valor % 10;
		
		int notas5 = valor/5;
		valor = valor % 5;
		
		int notas2 = valor/2;
		valor = valor % 100;
		
		int notas1 = valor/1;
		valor = valor % 1;
		
		if (notas100 > 0) {
			System.out.printf("%d nota(s) de R$ 100%n", notas100);
		} if (notas50 > 0) {
			System.out.printf("%d nota(s) de R$ 50%n", notas50);
		} if (notas20 > 0) {
			System.out.printf("%d nota(s) de R$ 20%n", notas20);
		} if (notas10 > 0) {
			System.out.printf("%d nota(s) de R$ 10%n", notas10);
		} if (notas5 > 0) {
			System.out.printf("%d nota(s) de R$ 5%n", notas5);
		} if (notas2 > 0) {
			System.out.printf("%d nota(s) de R$ 2%n", notas2);
		} if (notas1 > 0) {
			System.out.printf("%d nota(s) de R$ 1%n", notas1);
		}
	}
}
