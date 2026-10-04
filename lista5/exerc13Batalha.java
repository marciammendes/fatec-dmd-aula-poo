package lista5;
import java.util.Scanner;
import java.util.Random;

public class exerc13Batalha {
	private static Scanner sc = new Scanner (System.in);
	private static Random rd = new Random ();
	private static String personagem, jogadorAtual;
	private static int vida, vidaMaxima, ataque, cura;
	private static int vidaMaquina, vidaMaxMaq, ataqueMaq, curaMaq;	
	
	public static void main(String[] args) {
		criarPersonagem();
		jogador2();
		jogadorAtual = personagem;
		
		System.out.println("\n\nINICIANDO COMBATE...");
		mostrarStatus();		
		
		int batalha = 1;
		while (vida > 0 && vidaMaquina > 0) {
			System.out.println("\nBatalha " + batalha + ": Jogada de " + jogadorAtual);
			
			int dano = atacar();
			receberDano(dano);
			System.out.println(jogadorAtual + " atacou e causou " + dano + " de dano");
			
			curar();
			mostrarStatus();
			
			if(jogadorAtual.equals(personagem)) {
				jogadorAtual = "Máquina";
			} else {
				jogadorAtual = personagem;
			}
			batalha++;
		}
		if (vida > 0) {
			System.out.println("\n" + personagem + " venceu a Máquina");
		} else {
			System.out.println("\nA Máquina venceu");
		}
	}
	
	private static String criarPersonagem() {
		System.out.print("Nome do personagem: ");
		personagem = sc.nextLine();
		vida = 100;
		System.out.print("Pontos de vida: " + vida);
		vidaMaxima = vida;
		System.out.print("Ataque máximo: ");
		ataque = sc.nextInt();
		System.out.print("Cura: ");
		cura = sc.nextInt();
		return personagem;
	}
	
	private static void jogador2() {
		System.out.print("\nAdversário: Máquina");
		vidaMaquina = vida;
		vidaMaxMaq = vidaMaquina;
		System.out.print("\nPontos de vida: " + vidaMaxMaq);
		ataqueMaq = rd.nextInt(ataque) + 5;
		System.out.print("\nAtaque máximo: " + ataqueMaq);
		curaMaq = rd.nextInt(cura) + 5;
		System.out.print("\nCura: " + curaMaq);
	}
	
	private static void mostrarStatus() {
		System.out.print("\n" + personagem + ": " + vida + "/" + vidaMaxima);
		System.out.print("\nMáquina: " + vidaMaquina + "/" + vidaMaxMaq);
	}
	
	private static int atacar() {
		if (jogadorAtual.equals(personagem)) {
			return ataque;
		} else {
			return ataqueMaq;
		}	
	}
	
	private static void receberDano(int dano) {
		if (jogadorAtual.equals(personagem)) {
			vidaMaquina -= dano;
			if(vidaMaquina < 0) {
				vidaMaquina = 0;
			}
		} else {
			vida -= dano;
			if(vida < 0) {
				vida = 0;
			}
		}
	}
	
	private static void curar() {
		if (jogadorAtual.equals(personagem) && vida > 0) {
			vida += cura;
			if (vida > vidaMaxima) {
				vida = vidaMaxima;
			}
			System.out.println("\nCura aplicada: " + cura);
		} else if (jogadorAtual.equals("Máquina") && vidaMaquina > 0) {
			vidaMaquina += curaMaq;
			if (vidaMaquina > vidaMaxMaq) {
				vidaMaquina = vidaMaxMaq;
			}
			System.out.println("\nCura aplicada: " + curaMaq);
		}
	}
}
