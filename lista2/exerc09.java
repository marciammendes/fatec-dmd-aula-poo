package lista2;

import java.util.Scanner;

public class exerc09 {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("LOGIN SIMPLES");
		System.out.println("=============");
		System.out.println("Usuário: ");
		String usuario = sc.nextLine();
		System.out.println("Senha: ");
		int senha = sc.nextInt();
		System.out.println();
		if (usuario.equals("admin") && senha == 1234) {
			System.out.println("Acesso permitido");
		} else if (usuario.equals("admin") && senha != 1234){
			System.out.println("Acesso negado. Senha incorreta");
		} else if (!usuario.equals("admin") && senha == 1234){
			System.out.println("Acesso negado. Usuário incorreto");
		} else {
			System.out.println("Acesso negado");
		}
	}
}
