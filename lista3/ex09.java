package lista3;

import java.util.Scanner;

public class exerc09 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("FATORIAL");
		System.out.println("========\n");
		System.out.println("Informe um número inteiro positivo: ");
		int num = sc.nextInt();
		int nfat = 1;
		
		for (int n = 1; n <= num; n++) {
				nfat *= num;
			}
		System.out.println("\nO fatorial de " + num + "! é " + nfat);
	}
}
