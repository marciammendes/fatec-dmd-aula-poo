package lista5;
import java.util.Scanner;
import java.util.Random;

public class exerc11 {

	private static Scanner sc = new Scanner (System.in);
	private static Random random = new Random();
	private static int num, palpite;
	
	public static void main(String[] args) {
		sortearNumero();
		lerPalpite();
		verificarAcerto();
	}
	
	private static void sortearNumero() {
		num = random.nextInt(100);
	}
	
	private static void lerPalpite() {
		System.out.print("Digite um número de 1 a 100: ");
		palpite = sc.nextInt();
	}
	
	private static void verificarAcerto() {
		boolean vitoria = false;
		while (!vitoria) {
			if (palpite != num) {
				mostrarDica();
				lerPalpite();
			} else {
				mostrarVitoria();
				vitoria = true;
			}
		}
	}
	
	private static void mostrarDica() {
		if (palpite < num) {
			System.out.print("Dica: O número sorteado é maior que " + palpite);
			System.out.println("\n");
		} else {
			System.out.print("Dica: O número sorteado é menor que " + palpite);
			System.out.println("\n");
		}
	}
	
	private static void mostrarVitoria() {
		System.out.print("Você ganhou! Número sorteado = " + num);
	}
}
