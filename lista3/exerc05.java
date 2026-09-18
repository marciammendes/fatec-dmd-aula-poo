package lista3;

import java.util.Scanner;

public class exerc05 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("TABUADA");
		System.out.println("=======\n");
		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		System.out.println("\nTabuada do " + num + ":");
		
		for (int n = 1; n <= 10; n++) {
			int tabuada = num * n;
			System.out.println(num + " x " + n + " = " + tabuada);
		}
	}
}
