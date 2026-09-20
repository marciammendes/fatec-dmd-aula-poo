package lista2;

import java.util.Scanner;

public class exerc20 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("SISTEMA DE IMPOSTO");
		System.out.println("===================");
		System.out.println("Insira o salário: ");
		float salario = sc.nextFloat();
		
		if (salario <= 2000) {
			System.out.println("Imposto isento");
		} else if (salario > 2000 && salario <= 5000) {
			float imposto = (float)(salario * 1.1); 
			System.out.printf("\nImposto: %.2f", imposto);
		} else {
			float imposto = (float)(salario * 1.2);
			System.out.printf("\nImposto: %.2f", imposto);
		}
	}
}
