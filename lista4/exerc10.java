package lista4;
import java.util.Arrays;
import java.util.Scanner;

public class exerc10 {
	
	public static void main(String[] args) {
		System.out.println("Digite 10 números inteiros separados por espaço; ");
		int[] valores = new int[10];
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextInt();
		}
		int[] semDuplicados = removerDuplicados(valores);
		System.out.println("\nArray sem duplicadas: " + Arrays.toString(semDuplicados));
	}
	
	private static Scanner sc = new Scanner (System.in);
	
	private static int[] removerDuplicados (int[] dados) {
		int[] temp = new int[dados.length];
		int unicos = 0;
		for (int i = 0; i < dados.length; i++) {
			boolean encontrado = false;
			
			for (int j = 0; j < unicos; j++) {
				if (dados[i] == temp[j]) {
					encontrado = true;
					break;
				}
			}
			
			if (!encontrado) {
				temp[unicos] = dados[i];
				unicos++;
			}
		}
		
		int[] resultado = new int[unicos];
		for (int i = 0; i < unicos; i++) {
			resultado[i] = temp[i];
		}
		return resultado;
	}
}
