package lista3;

import java.util.Scanner;

public class exerc06 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("MAIOR NÚMERO");
		System.out.println("============\n");
		System.out.println("Digite cinco números inteiros: ");
		int num = sc.nextInt();
		
		for (int n = 2; n <= 5; n++) {
			int num2 = sc.nextInt();
			
			if (num2 > num) {
				num = num2;
			}
		}
		System.out.println("O maior número digitado foi: " + num);
	}
}
