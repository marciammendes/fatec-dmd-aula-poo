package lista2;

import java.util.Scanner;

public class exerc06 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("CLASSIFICAÇÃO POR IDADE");
		System.out.println("=======================");
		System.out.println("Insira uma idade: ");
		int idade = sc.nextInt();
		System.out.println();
		if (idade > 0 && idade < 13) {
			System.out.println("Criança");
		} else if (idade >= 13 && idade < 18) {
			System.out.println("Adolescente");
		} else if (idade >= 18 && idade < 60) {
			System.out.println("Adulto");
		} else if (idade >= 60) {
			System.out.println("Idoso");
		} else {
			System.out.println("Idade inválida. Encerrando análse.");
		}
	}

}
