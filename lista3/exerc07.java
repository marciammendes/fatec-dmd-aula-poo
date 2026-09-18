package lista3;

import java.util.Scanner;

public class exerc07 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("POSITIVOS E NEGATIVOS");
		System.out.println("=====================\n");
		System.out.println("Digite dez números inteiros: ");
		int positivos = 0;
		int negativos = 0;
		int neutros = 0;
		
		for (int n = 1; n <= 10; n++) {
			 int num = sc.nextInt();
			 
			 if (num > 0) {
				 positivos++;				 
			 } else if (num < 0) {
				 negativos++;				 
			 } else {
				 neutros++;
			 }
		}	
		System.out.println("\nNúmeros positivos: " + positivos);
		System.out.println("Números negativos: " + negativos);
		System.out.println("Neutro(s): " + neutros);
	}
}
