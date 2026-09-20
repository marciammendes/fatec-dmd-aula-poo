package lista2;

import java.util.Scanner;

public class exerc10 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("DESCONTO EM COMPRA");
		System.out.println("==================");
		System.out.println("Insira o valor da compra: ");
		float compra = sc.nextFloat();
		System.out.println();
		if (compra >= 100) {
			System.out.printf("Desconto de 10%% concedido. Valor da compra: R$ %.2f%n", (compra * 0.9));
		} else {
			System.out.println("Sem desconto");
		}
	}
}
