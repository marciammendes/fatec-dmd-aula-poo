package lista2;

import java.util.Scanner;

public class exerc15 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("IMC - ÍNDICE DE MASSA CORPORAL");
		System.out.println("==============================");
		System.out.println("Informe o peso [kg]: ");
		float peso = sc.nextFloat();
		System.out.println("Informe a altura [m]: ");
		float altura = sc.nextFloat();
		System.out.println();
		float imc = peso / (altura * altura);
		int classificacao;
		if (imc < 18.5) {
			classificacao = 1;
		} else if (imc >= 18.5 && imc < 25) {
			classificacao = 2;
		} else if (imc >= 25 && imc < 30) {
			classificacao = 3;
		} else {
			classificacao = 4;
		}
		
		switch (classificacao) {
		case 1:
			System.out.println("Abaixo do peso");
			break;
		case 2:
			System.out.println("Normal");
			break;
		case 3:
			System.out.println("Sobrepeso");
			break;
		case 4:
			System.out.println("Obesidade");
			break;
		}
	}
}
