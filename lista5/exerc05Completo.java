package lista5;

import java.util.Scanner;

public class exerc05Completo {

	private static Scanner sc = new Scanner(System.in);
	private static boolean erro = false;

	public static void main(String[] args) {
		int opcao;

		do {
			opcao = mostrarMenu();

			if (opcao >= 1 && opcao <= 4) {
				erro = false;
				
				double num = lerNumero();
				double proximo = lerNumero();
				double resultado = calculo(opcao, num, proximo);

				if (!erro) {
					System.out.print("Deseja digitar outro número (S/N)? ");
					char continuar = sc.next().toUpperCase().charAt(0);

					while (continuar == 'S') {
						proximo = lerNumero();
						
						resultado = calculo(opcao, resultado, proximo);

						if (erro) {
							break;
						}
						System.out.print("Deseja digitar outro número (S/N)? ");
						continuar = sc.next().toUpperCase().charAt(0);
					}

					if (!erro) {
						if(resultado % 1 == 0) {
							System.out.print("\nResultado final: " + (long)resultado);
						} else {
							System.out.print("\nResultado final: " + resultado);
						}
						System.out.print("\nDeseja fazer outro cálculo (S/N)? ");
						char resposta = sc.next().toUpperCase().charAt(0);
						
						if (resposta == 'N') {
							opcao = 0;
						}
					}
				}

			} else if (opcao != 0) {
				System.out.println("Opção inválida! Tente novamente.\n");
			}

		} while (opcao != 0);

		System.out.println("\nCalculadora encerrada.");
	}

	private static int mostrarMenu() {
		System.out.println("CALCULADORA");
		System.out.println("[1] Somar");
		System.out.println("[2] Subtrair");
		System.out.println("[3] Multiplicar");
		System.out.println("[4] Dividir");
		System.out.println("[0] Sair");
		System.out.print("\nEscolha uma opção: ");
		return sc.nextInt();
	}

	private static double lerNumero() {
		System.out.print("Digite um número: ");
		return sc.nextDouble();
	}

	private static double somar(double a, double b) {
		return a + b;
	}

	private static double subtrair(double a, double b) {
		return a - b;
	}

	private static double multiplicar(double a, double b) {
		return a * b;
	}

	private static double dividir(double a, double b) {
		return a / b;
	}
	
	//FUNÇÕES ADICIONAIS
	private static double calculo(int opcao, double a, double b) {
		switch (opcao) {
		case 1:
			return somar(a, b);
		case 2:
			return subtrair(a, b);
		case 3:
			return multiplicar(a, b);
		case 4:
			if (b == 0) {
				System.out.println("\nErro: Não é possível dividir por zero.");
				erro = true;
				return 0;
			}
			return dividir(a, b);
		default:
			return 0;
		}
	}
}