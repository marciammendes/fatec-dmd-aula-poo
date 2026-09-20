package lista2;

import java.util.Scanner;

public class exerc11 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("CALCULADORA COM SWITCH");
		System.out.println("======================");
		System.out.println("Insira dois números (separados por vírgula)");
		sc.useDelimiter("[,\\s]+");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Insira um operador [+,-,*,/]: ");
		char oper = sc.next().charAt(0);
		System.out.println();
		float resultado;
		switch (oper) {
			case '+':
				resultado = num1 + num2;
				System.out.println("Resultado: " + resultado);
				break;
			case '-':
				resultado = num1 - num2;
				System.out.println("Resultado: " + resultado);
				break;
			case '*':
				resultado = num1 * num2;
				System.out.println("Resultado: " + resultado);
				break;
			case '/':
				if (num2 != 0 ) {
					resultado = (float) num1 / num2;
					System.out.printf("Resultado: %.2f%n", resultado);
				} else {
					System.out.println("Não é possível dividir por zero");
				}
					break;
			default:
				System.out.println("Operador inválido.");
				break;
		}
	}

}
