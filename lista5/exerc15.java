package lista5;
import java.util.Scanner;
import java.util.Random;

public class exerc15 {

	private static Scanner sc = new Scanner (System.in);
	private static Random rd = new Random();
	private static int fichas, pontosJogador, pontosCrupie;
	
	public static void main(String[] args) {
		iniciarJogo();
		distribuirCartas();
		novaJogada();
		verificarVitoria();
	}
	
	private static void iniciarJogo() {
		System.out.println("BLACKJACK");
		System.out.println("=========");
		System.out.print("Quantas fichas deseja apostar? ");
		fichas = sc.nextInt();
		sc.nextLine();
	}
	
	private static void distribuirCartas() {
		int c1Jogador = sortearCarta();
		int c2Jogador = sortearCarta();
		pontosJogador = c1Jogador + c2Jogador;
		
		if((c1Jogador == 1 && c2Jogador ==10) || (c1Jogador ==10 && c2Jogador == 1)) {
			pontosJogador = 21;
		}
		
		int c1Crupie = sortearCarta();
		int c2Crupie = sortearCarta();
		pontosCrupie = c1Crupie + c2Crupie;
		
		if((c1Crupie == 1 && c2Crupie ==10) || (c1Crupie ==10 && c2Crupie == 1)) {
			pontosCrupie = 21;
		}
		
		System.out.println("\nSua mão: 1° carta: " + c1Jogador + " | 2° carta: " + c2Jogador);
		System.out.println("Mão do Crupiê: 1° carta: " + c1Crupie + " | 2° carta: (CARTA OCULTA)");
	}
	
	private static int sortearCarta() {
		int carta = rd.nextInt(13) + 1;
		if (carta > 10) {
			return 10;
		}
		return carta;
	}
	
	private static void novaJogada() {
		System.out.print("\nDeseja pedir mais uma carta? [S/N]: ");
		String opcao = sc.nextLine().toUpperCase();
		
		if (opcao.equals("S")) {
			int novaCarta = sortearCarta();
			
			if (novaCarta == 1 && pontosJogador + 11 <= 21) {
				novaCarta = 11;
				}
			pontosJogador += novaCarta;
			System.out.println("Você tirou " + novaCarta + ". Total atual: " + pontosJogador);
		}
	}
	
	private static void verificarVitoria() {
		System.out.println("\nSeus pontos: " + pontosJogador);
		System.out.println("Pontos do Crupiê: " + pontosCrupie);
		if (pontosJogador > 21) {
			System.out.println("\nVocê estourou. Perdeu " + fichas + " fichas");
		} else if (pontosCrupie > 21 || pontosJogador > pontosCrupie) {
			System.out.println("\nVocê venceu! Ganhou " + (fichas * 2) + " fichas");
		} else if (pontosJogador < pontosCrupie) {
			System.out.println("\nO Crupiê venceu! Você perdeu " + fichas + " fichas");
		} else {
			System.out.println("\nEmpate. Fichas devolvidas");
		}
	}
}
