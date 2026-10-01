package lista4;
import java.util.Arrays;
import java.util.Scanner;

public class exerc01 {
	
	public static void main(String[] args) {
		
		System.out.print("Insira 5 números inteiros separados por espaço: ");
		int[] dados = new int[5];
		for (int i = 0; i < dados.length; i++) {
			dados[i] = sc.nextInt();
		}
		
		System.out.print(Arrays.toString(dados));
	}
	
	private static Scanner sc  = new Scanner (System.in);
}
