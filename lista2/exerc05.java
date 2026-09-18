package lista2;

import java.util.Scanner;

public class exerc05 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("NÚMERO DENTRO DO INTERVALO");
		System.out.println("==========================");
		System.out.println("Insira um número: ");
		int numero = sc.nextInt();
		System.out.println();
		if (numero >= 10 && numero <= 50) {
			System.out.println("Número está no intervalo entre 10 e 50");
		} if (numero < 10 || numero > 50) {
			System.out.println("Número está fora do intervalo entre 10 e 50");
		}
	}
}
