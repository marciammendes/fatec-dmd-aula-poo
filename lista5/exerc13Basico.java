package lista5;
import java.util.Scanner;

public class exerc13Basico {
	private static Scanner sc = new Scanner (System.in);
	private static String personagem;
	private static int vidaMaxima, vida, ataque, cura;
	
	public static void main(String[] args) {
		criarPersonagem();
		mostrarStatus();
		
		int dano = atacar();
		vida = receberDano(vida, dano);
		
		System.out.print("\nDano sofrido: " + dano);
		mostrarStatus();
		
		vida = curar(vida);
		
		System.out.println("\nCura aplicada: " + cura);
		mostrarStatus();
	}
	
	private static String criarPersonagem() {
		System.out.print("Nome do personagem: ");
		personagem = sc.nextLine();
		System.out.print("Pontos de vida: ");
		vida = sc.nextInt();
		vidaMaxima = vida;
		System.out.print("Ataque: ");
		ataque = sc.nextInt();
		System.out.print("Cura: ");
		cura = sc.nextInt();
		return personagem;
	}
	
	private static void mostrarStatus() {
		System.out.print("\n" + personagem + ": " + vida + "/" + vidaMaxima);
	}
	
	private static int atacar() {
		return ataque;
	}
	
	private static int receberDano(int vida, int dano) {
		vida = vidaMaxima - dano;
		if(vida < 0) {
			vida = 0;
		}
		return vida;
	}
	
	private static int curar(int vida) {
		vida = vida + cura;
		if (vida > vidaMaxima) {
			vida = vidaMaxima;
		}
		return vida;
	}
}
