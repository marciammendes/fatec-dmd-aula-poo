package lista2;

import java.util.Scanner;

public class exerc04 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("MAIOR NÚMERO");
		System.out.println("============");
		System.out.println("Insira o primeiro número:");
		int num1 = sc.nextInt();
		System.out.println("Insira o segundo número: ");
		int num2 = sc.nextInt();
		System.out.println();
		if (num1 > num2) {
			System.out.println(num1 + " é maior que " + num2);
		} if (num2 > num1) {
			System.out.println(num2 + " é maior que " + num1);
		} if (num1 == num2) {
			System.out.println(num1 + " e " + num2 + " são iguais");
		}
	}
}
