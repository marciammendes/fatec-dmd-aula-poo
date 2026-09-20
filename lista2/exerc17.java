package lista2;

import java.util.Scanner;

public class exerc17 {
private static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		System.out.println("LOGIN COM TENTATIVAS");
		System.out.println("====================");
		int tentativas = 1;
		boolean loginSucesso = false;
		
		while (tentativas <= 3) {
			System.out.println("\nTentativa " + tentativas + " de 3");
			System.out.println("Login: ");
			String usuario = sc.nextLine();
			System.out.println("Senha: ");
			int senha = sc.nextInt();
			System.out.println();
			sc.nextLine();
			
			if (usuario.equals("admin") && senha == 1234) {
				System.out.println("Acesso permitido");
				loginSucesso = true;
				break;
			} else if (usuario.equals("admin") && senha != 1234){
				System.out.println("Acesso negado. Senha incorreta");
			} else if (!usuario.equals("admin") && senha == 1234){
				System.out.println("Acesso negado. Usuário incorreto");
			} else {
				System.out.println("Acesso negado");
			}
			tentativas++;
		}
			if(!loginSucesso) {
				System.out.println("Tentativas esgotadas. Encerrando o programa.");
			}
		sc.close();
	}
}
