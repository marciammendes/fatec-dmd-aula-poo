package jogoDaVelha;

//PACOTES IMPORTADOS
import java.util.Scanner;

public class JogoDaVelha {
	
	//FLUXO PRINCIPAL
	public static void main (String[] args) {
		
		System.out.println("=========================");
		System.out.println("      JOGO DA VELHA      ");
		System.out.println("=========================");
		
		iniciarTabuleiro();
		jogadorAtual = 'X';
		boolean jogoEmAndamento = true;
		
		while (jogoEmAndamento) {
			exibirTabuleiro();
			realizarJogada();
			if (verificarVitoria()) {
				exibirTabuleiro();
				System.out.println("Parábens, você venceu!");
				jogoEmAndamento = false;
			} else if (tabuleiroCompleto()) {
				exibirTabuleiro();
				System.out.println("A partida terminou empatada.");
				jogoEmAndamento = false;
			} else {
				trocarJogador();
			}
		}	
		sc.close();
	}
			
	//EXIBIR TABULEIRO
	private static void exibirTabuleiro() {
		
		System.out.println("\n  1   2   3");
		
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + " ");
			for (int j = 0; j < 3; j++) {
				System.out.print(tabuleiro[i][j]);
				if (j < 2) System.out.print(" | "); 
			}
			System.out.println();
			if (i < 2) System.out.println(" ---+---+---");
		}
		
		System.out.println();
	}
	
	//REALIZAR JOGADA
	private static void realizarJogada() {
		
		int linha = - 1;
		int coluna = - 1;
		boolean posicaoValida = false;
		
		//POSIÇÃO VÁLIDA
		while(!posicaoValida) {
			System.out.print("\nJogador " + jogadorAtual + ", informe a linha: ");
			linha = lerEntrada() - 1;
			System.out.print("Jogador " + jogadorAtual + ", informe a coluna: ");
			coluna = lerEntrada() - 1;
			
			if (!posicaoDentroDoTabuleiro(linha,coluna)) {
				System.out.println("Posição inválida. Digite uma posição entre 1 e 3.");
			} else if (!posicaoLivre(linha, coluna)) {
				System.out.println("Posição ocupada. Escolha outra posição.");
			} else {
				posicaoValida = true;
			}
		}
		
		tabuleiro[linha][coluna] = jogadorAtual;
	}
	
	//VERIFICAR VITORIA
	private static boolean verificarVitoria() {
		
		for (int i = 0; i < 3; i++) {
			
			if (tabuleiro[i][0] == jogadorAtual &&
					tabuleiro[i][1] == jogadorAtual &&
					tabuleiro[i][2] == jogadorAtual) {
				return true;
			}
			
			if (tabuleiro[0][i] == jogadorAtual &&
					tabuleiro[1][i] == jogadorAtual &&
					tabuleiro[2][1] == jogadorAtual) {
				return true;
			}
		}
		
		if (tabuleiro[0][0] == jogadorAtual &&
				tabuleiro[1][1] == jogadorAtual
				&& tabuleiro[2][2] == jogadorAtual) {
			return true;
		}
		
		if (tabuleiro[0][2] == jogadorAtual &&
				tabuleiro[1][1] == jogadorAtual &&
				tabuleiro[2][0] == jogadorAtual) {
			return true;
		}
		
		return false;
	}
	
	//TABULEIRO COMPLETO
	private static boolean tabuleiroCompleto() {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tabuleiro[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}
	
	//TROCAR JOGADOR
	private static void trocarJogador() {
		jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
	    }
	
	
//=========================== METODOS ADICIONAIS ===========================
	
	private static void iniciarTabuleiro() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabuleiro[i][j] = ' ';
			}
		}
	}
	
//..........................................................................
	
	private static int lerEntrada() {
		while(!sc.hasNextInt()) {
			System.out.println("Entrada inválida. Digite um número inteiro.");
			sc.next();
		}
		return sc.nextInt();
	}
	
//..........................................................................
	
	private static boolean posicaoDentroDoTabuleiro(int linha, int coluna) {
		return linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3;
	    }
	
//..........................................................................
	
	private static boolean posicaoLivre(int linha, int coluna) {
        return tabuleiro[linha][coluna] == ' ';
    }
	
//..........................................................................
	
	private static char [][] tabuleiro = new char [3][3];
	private static Scanner sc = new Scanner (System.in);
	private static char jogadorAtual;
}