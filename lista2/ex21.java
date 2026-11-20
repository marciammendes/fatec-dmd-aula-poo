package lista2;

import java.util.Scanner;

public class exerc21 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("SISTEMA COMPLETO");
		System.out.println("================");
		
		int tentativas = 0;
		float saldo = 0;
		boolean autenticacao = false;
		boolean atendimento = true;
				
		while (tentativas < 3) {
			System.out.println("\nLOGIN");
			System.out.println("Usuário: ");
			String usuario = sc.nextLine();
			System.out.println("Senha: ");
			int senha = sc.nextInt();
			sc.nextLine();
			
			if (usuario.equals("admin") && senha == 1234) {
				autenticacao = true;
				break;
			} else {
				tentativas++;
				System.out.println("Login inválido. Tentativas restantes: " + (3-tentativas));
			}
		}
				
			if (autenticacao) {
							
				while (atendimento) {
					System.out.println("\nMENU");
					System.out.println("[1] Ver saldo");
					System.out.println("[2] Depositar");
					System.out.println("[3] Sacar");
					System.out.println("[4] Sair");
					System.out.println("\nEscolha a opção desejada:");
					int opcao = sc.nextInt();
					
					switch (opcao) {
					case 1:
						System.out.printf("\nSaldo = %.2f%n", saldo);
						break;
					case 2:
						System.out.println("\nDigite o valor a depositar: ");
						float deposito = sc.nextFloat();
						if (deposito > 0) {
							saldo += deposito;
							System.out.printf("\nDepósito realizado! Saldo atualizado: %.2f%n", saldo);
						} else {
							System.out.println("\nValor de depósito inválido");
						}
						break;
					case 3: 
						System.out.println("\nDigite o valor a sacar: ");
						float saque = sc.nextFloat();
						if (saque > saldo) {
							System.out.println("\nSaldo insuficiente");
						} else if (saque <= 0) {
							System.out.println("\nValor inválido");
						} else {
							saldo -= saque;
							System.out.printf("\nSaque realizado! Saldo atualizado: %.2f%n", saldo);
						}
						break;
					case 4:
						System.out.println("\nSESSÃO ENCERRADA");
						atendimento = false;
						break;
					default:
						System.out.println("\nOpção inválida. Tente novamente");
						break;
					}
				}
					
			} else {
				System.out.println("\nConta bloqueada por excesso de tentativas");
			}
	}
}