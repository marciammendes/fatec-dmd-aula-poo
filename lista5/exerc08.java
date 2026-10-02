package lista5;
import java.util.Scanner;

public class exerc08 {
	
	private static Scanner sc = new Scanner(System.in);
	private static String nome, cidade;
	private static int idade;
	
	public static void main(String[] args) {
		lerNome();
		lerIdade();
		lerCidade();
		mostrarResumo();
	}
	
	private static void lerNome() {
		System.out.print("Digite o nome: ");
		nome = sc.nextLine();
	}
	
	private static void lerIdade() {
		System.out.print("Digite a idade: ");
		idade = sc.nextInt();
		sc.nextLine();
	}
	
	private static void lerCidade() {
		System.out.print("Digite a cidade: ");
		cidade = sc.nextLine();
	}
	
	private static void mostrarResumo() {
		System.out.print("\nNome: " + nome);
		System.out.print("\nIdade: " + idade);
		System.out.print("\nCidade: " + cidade);
	}
}
