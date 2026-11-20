package lista2;

import java.util.Scanner;

public class exerc08 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("MAIOR DE TRÊS NÚMEROS");
		System.out.println("=====================");
		System.out.println("Insira três números (separados por vírgula)");
		sc.useDelimiter("[,\\s]+");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println();
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " é o maior número da sequência");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " é o maior número da sequência");
		} else {
			System.out.println(num3 + " é o maior número da sequência");
		}
	}
}
