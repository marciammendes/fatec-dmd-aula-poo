package lista5;
import java.util.Scanner;

public class exerc10 {

	private static Scanner sc = new Scanner (System.in);
	private static String usuario, senha;
	
	public static void main(String[] args) {
		System.out.print("LOGIN");
		lerUsuario();
		lerSenha();
		System.out.println();
		mostrarResultado();
	}
	
	private static void lerUsuario() {
		System.out.print("\nUsuário: ");
		usuario = sc.nextLine();
	}
	
	private static void lerSenha() {
		System.out.print("Senha: ");
		senha = sc.nextLine();
	}
	
	private static void validarLogin() {
		if ("admin".equals(usuario) && "0000".equals(senha)) {
			System.out.print("Login realizado com sucesso!");
		} else if (!"admin".equals(usuario) && "0000".equals(senha)) {
			System.out.print("Usuário inválido.");
		} else if ("admin".equals(usuario) && !"0000".equals(senha)) {
			System.out.print("Senha inválida.");
		} else {
			System.out.print("Dados inválidos.");
		}
	}
	
	private static void mostrarResultado() {
		validarLogin();
	}
}
