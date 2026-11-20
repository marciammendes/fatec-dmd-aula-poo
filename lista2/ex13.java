package lista2;

import java.util.Scanner;

public class exerc13 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("ANO BISSEXTO");
		System.out.println("============");
		System.out.println("Insira um ano [aaaa]: ");
		int ano = sc.nextInt();
		System.out.println();
		int bissexto = ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) ? 1 : 0;
		switch (bissexto) {
		case 1:
			System.out.println(ano + " é um ano bissexto");
			break;
		case 0:
			System.out.println(ano + " não é um ano bissexto");
			break;	
		}
	}
}
