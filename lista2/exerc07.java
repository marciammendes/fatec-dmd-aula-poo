package lista2;

import java.util.Scanner;

public class exerc07 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("MÉDIA DO ALUNO");
		System.out.println("==============");
		System.out.println("Insira uma média: ");
		float media = sc.nextFloat();
		System.out.println();
		if (media >= 6) {
			System.out.println("Aprovado");
		} else if (media >= 4 && media < 6) {
			System.out.println("Recuperação");
		} else if (media < 4) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Média inválida. Encerrando análse.");
		}
	}

}
