package lista4;
import java.util.Arrays;
import java.util.Scanner;

public class exerc06 {
	
	public static void main(String[] args) {
		System.out.println("Digite 5 números inteiros separados por espaço: ");
		int[] valores = new int [5];
		
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextInt();
		}
		int[] arrayInverso = inverterArray(valores);
		System.out.print("\nArray inverso: " + Arrays.toString(arrayInverso));
	}
	
	private static Scanner sc = new Scanner (System.in);
	
	private static int[] inverterArray (int[] dados) {
		int[] newArray = new int[dados.length];
		int j = 0;
		for (int i = dados.length - 1; i >= 0; i--) {
			newArray[j] = dados[i];
			j++;
		}
		return newArray;
	}
}
