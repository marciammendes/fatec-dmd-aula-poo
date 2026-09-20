package lista2;

import java.util.Scanner;

public class exerc03 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.println("MAIORIDADE");
		System.out.println("==========");
		System.out.println("Insira uma idade: ");
		int idade = sc.nextInt();
		System.out.println();
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} if (idade < 18) {
			System.out.println("Menor de idade");
		}
	}
}
