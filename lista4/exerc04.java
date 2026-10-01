package lista4;
import java.util.Arrays;
import java.util.Scanner;

public class exerc04 {
	
	public static void main(String[] args) {
		System.out.println("Digite 6 números inteiros separados por espaço: ");
		int[] num = new int [6];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.print("\n" + Arrays.toString(num));
		double resultado = media(num);
		System.out.printf("\nA média dos números é: %.2f", resultado);
	}
	
	private static Scanner sc = new Scanner (System.in);
	
	private static double media (int[] total) {
		int soma = 0;
		for (int i = 0; i < total.length; i++) {
			soma += total[i];
		}
		return (double) soma / total.length;
	}
}
