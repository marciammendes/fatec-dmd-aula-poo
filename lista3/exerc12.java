package lista3;

import java.util.Scanner;

public class exerc12 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("MENU INTERATIVO");
		System.out.println("===============");
		boolean menu = true;
		
		while(menu) {
			System.out.println("\nMENU");
			System.out.println("[1] Somar");
			System.out.println("[2] Subtrair");
			System.out.println("[3] Sair");
			System.out.print("Digite uma opção [1/2/3]: ");
			int opcao = sc.nextInt();
			if (opcao != 3) {
				menu = true;
			} else {
				menu = false;
			}
		}
		System.out.println("\nEncerrando o programa.");
	}
}
