package lista4;
import java.util.Arrays;
import java.util.Scanner;

public class exerc03 {
	
	public static void main(String[] args) {
		System.out.println("Insira 8 números separados por espaço: ");
		int[] dados = new int[8];
		for (int i = 0; i < dados.length; i++) {
			dados[i] = sc.nextInt();
		}
		System.out.print("\n" + Arrays.toString(dados));
		int[] resultados = buscarMaiorEMenor(dados);
		System.out.print("\nMaior valor: " + resultados[0]);
		System.out.print("\nMenor valor: " + resultados[1]);
	}
	
	private static Scanner sc = new Scanner (System.in);
	
	private static int[] buscarMaiorEMenor (int[] num) {
		int maior = num[0];
		int menor = num[0];
		for(int i = 0; i < num.length; i++) {
			if (num[i] > maior) {
				maior = num[i];
			}
			if (num[i] < menor) {
				menor = num[i];
			}
		}
		return new int[] {maior, menor};
	}
}
