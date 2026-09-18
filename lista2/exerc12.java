package lista2;

import java.util.Scanner;

public class exerc12 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("DIA DA SEMANA");
		System.out.println("=============");
		System.out.println("Insira um número de 1 a 7: ");
		int diadasemana = sc.nextInt();
		System.out.println();
		switch (diadasemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Entrada inválida");
		}
	}
}
