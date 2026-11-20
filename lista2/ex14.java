package lista2;

import java.util.Scanner;

public class exerc14 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("TIPO DE TRIÂNGULO");
		System.out.println("=================");
		System.out.println("Insira três medidas de lados de um triângulo: ");
		sc.useDelimiter("[,\\s]+");
		int lado1 = sc.nextInt();
		int lado2 = sc.nextInt();
		int lado3 = sc.nextInt();
		System.out.println();
		boolean triangulo = (lado1 + lado2 > lado3) &&
							(lado1 + lado3 > lado2) &&
							(lado2 + lado3 > lado1);
		if (!triangulo) {
			System.out.println("Medidas informadas não formam um triângulo");
		} else {
			int tipo;
			if (lado1 == lado2 && lado2 == lado3) {
				tipo = 3;
			} else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
				tipo = 2;
			} else {
				tipo = 0;
			}
			
			switch (tipo) {
			case 3:
				System.out.println("Triângulo equilátero: todos os lados iguais");
				break;
			case 2:
				System.out.println("Triângulo isósceles: dois lados iguais");
				break;
			case 0:
				System.out.println("Triângulo escaleno: todos os lados diferentes");
				break;
			}
		}
	}
}
