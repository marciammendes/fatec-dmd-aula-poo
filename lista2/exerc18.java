package lista2;

import java.util.Scanner;

public class exer18 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		boolean executando = true;
		
		while (executando) {
			System.out.println("\nMENU INTERATIVO");
			System.out.println("===============");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3  Sair");
			System.out.println("\nDigite a opção desejada: ");
			int opcao = sc.nextInt();
			
			switch (opcao) {
				case 1:
					double totalSoma = 0;
					System.out.println("\nTutorial: Digite 0 (zero) para encerrar");
					while (true) {
						System.out.println("Digite um número: ");
						double num = sc.nextDouble();
						
						if (num == 0) {
							break;
						}
						
						totalSoma += num;
					}
					System.out.printf("Total da soma: %.2f%n", totalSoma);
					break;
					
				case 2:
					System.out.println("\nTutorial: Digite 0 (zero) para encerrar");
					System.out.print("Digite o número inicial: ");
					double totalSub = sc.nextDouble();
					
					while (executando) {
						System.out.println("Digite o número a subtrair: ");
						double num = sc.nextDouble();
						
						if (num == 0) {
							break;
						}
						
						totalSub -= num;
					}
					System.out.printf("Total da subtração: %.2f%n", totalSub);
					break;
						
				case 3:
					System.out.println("Encerrando o programa.");
					executando = false;
					break;
					
				default:
					System.out.println("\nOpção inválida! Escolha 1, 2 ou 3.");
					break;
			}
		}
	}
}
