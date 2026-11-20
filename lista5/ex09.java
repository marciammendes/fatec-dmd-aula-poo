package lista5;
import java.util.Scanner;

public class exerc09 {

	private static Scanner sc = new Scanner (System.in);
	private static int opcao;
	private static double saldoAtual = 0;
	
	public static void main(String[] args) {
		do {
			mostrarMenu();
			
			switch (opcao) {
				case 1: 
					depositar();
					break;
				case 2:
					sacar();
					break;
				case 3:
					consultarSaldo();
					break;
				default:
					System.out.print("\nOpção invalida! Tente novamente");
			}
			System.out.println();
		} while (true);
	}
	
	private static void mostrarMenu() {
		System.out.print("BANCO POO");
		System.out.print("\n[1] Depositar");
		System.out.print("\n[2] Sacar");
		System.out.print("\n[3] Consultar saldo");
		System.out.print("\n\nDigite a opção desejada: ");
		opcao = sc.nextInt();
	}
	
	private static void depositar() {
		System.out.print("Valor do depósito: R$ ");
		double deposito = sc.nextDouble();
			
		if (deposito > 0) {
			saldoAtual += deposito;
			System.out.print("Depósito realizado");
		} else {
			System.out.print("Depósito inválido");
		}
		System.out.println();
	}
	
	private static void sacar() {
		System.out.print("Valor do saque: R$ ");
		double saque = sc.nextDouble();
		if (saque > 0 && saque <= saldoAtual) {
			saldoAtual -= saque;
			System.out.print("Saque realizado com sucesso");
		} else if (saque > saldoAtual) {
			System.out.print("Saldo insuficiente");
		} else {
			System.out.print("Valor inválido");
		}
		System.out.println();
	}
	
	private static void consultarSaldo() {
		System.out.printf("Saldo atual: %.2f", saldoAtual);
		System.out.println();
	}
}
