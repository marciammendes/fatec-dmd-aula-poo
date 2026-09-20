package lista2;

import java.util.Scanner;

public class exerc19 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("CLASSIFICAÇÃO DE TEMPERATURA");
		System.out.println("============================");
		System.out.println("Digite a temperatura: ");
		float temp = sc.nextFloat();
		if (temp < 15) {
			System.out.println("Frio");
		} else if (temp >=15 && temp <= 25) {
			System.out.println("Temperatura Agradável");
		} else {
			System.out.println("Quente");
		}
	}
}
