package lista5;
import java.util.Scanner;
import java.util.Random;

public class exerc12 {
	
	private static Scanner sc = new Scanner (System.in);
	private static Random random = new Random();
	private static int jogador, computador;
	
	public static void main(String[] args) {
		mostrarMenu();
		jogadaComputador();
		jogadaJogador();
		mostrarResultado();
	}
	
	private static void mostrarMenu() {
		System.out.print("VAMOS JOGAR");
		System.out.print("\n[1] Pedra\n[2] Papel\n[3] Tesoura");
	}

	private static void jogadaComputador() {
		computador = random.nextInt(3) + 1;
	}
	
	private static void jogadaJogador() {
		System.out.print("\nEscolha uma opcao [1/2/3]: ");
		jogador = sc.nextInt();
	}
	
	private static String correspondencia(int opcao) {
		if (opcao == 1) {
			return "Pedra";
		} else if (opcao == 2) {
			return "Papel";
		} else if (opcao == 3) {
			return "Tesoura";
		}
		return "Opção inválida";
	}
	
	private static  void verificarVencedor() {
		System.out.print("\nVocê escolheu: " + correspondencia(jogador));
		System.out.print("\nO computador escolheu: " + correspondencia(computador));
		if (computador == 1 && jogador == 3 ||
				computador == 2 && jogador == 1 ||
					computador == 3 && jogador == 2) {
			System.out.print("\n\nO computador venceu.");
		} else if (computador == jogador){
			System.out.print("\n\nO jogo empatou");
			} else {
				System.out.print("\n\nVocê venceu!");
				}
	}
	
	private static void mostrarResultado() {
		verificarVencedor();
	}
}
