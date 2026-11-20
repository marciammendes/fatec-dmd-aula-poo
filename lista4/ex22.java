package lista4;
import java.util.Scanner;

public class exerc22 {
	
	public static void main(String[] args) {
		System.out.println("==================");
		System.out.println("      SUDOKU      ");
		System.out.println("==================");
		iniciarJogo();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				exibirSudoku();
				
				char valor = lerNumeroValido("Digite um número de 1-9 para a posição [" + i + "][" + j + "]: ");
				sudoku[i][j] = valor;
				System.out.println();
			}
		}
		exibirSudoku();
		
		if(duplicados()) {
			System.out.println("Há números duplicados na matriz. Fim de jogo!");
		} else {
			System.out.println("Você completou o jogo!");
		}
	}
	
	private static char[][] sudoku = new char[3][3];
	private static Scanner sc = new Scanner (System.in);
	
	private static void iniciarJogo() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sudoku[i][j] = ' ';
			}
		}
	}
	
	private static void exibirSudoku() {
		for (int i = 0; i < 3; i++) {
			System.out.print(" ");
			for (int j = 0; j < 3; j++) {
				System.out.print(sudoku[i][j]);
				if (j < 2) System.out.print(" | "); 
			}
			System.out.println();
			if (i < 2) System.out.println("---+---+---");
		}
		System.out.println();
	}
	
	private static boolean duplicados() {
		for (int i = 0; i < 3; i++) {
			if (duplicados(sudoku[i][0], sudoku[i][1], sudoku[i][2])) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean duplicados (char a, char b, char c) {
		return (a == b) || (a == c) || (b == c);
	}
	
	private static char lerNumeroValido(String mensagem) {
		while(true) {
			System.out.print(mensagem);
			String entrada = sc.next();
			if (entrada.length() == 1) {
				char ch = entrada.charAt(0);
				if (ch >= '1' && ch <= '9') {
					return ch;
				}
			}
			System.out.println("Entrada inválida. Digite um número de 1-9\n");
		}
	}
}
