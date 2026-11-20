package lista5;

public class exerc02 {

	public static void main(String[] args) {
		mostrarResultado();
	}
	
	private static int somar() {
		int n1 = 10;
		int n2 = 20;
		int soma = n1 + n2;
		return soma;
	}
	
	private static void mostrarResultado() {
		System.out.println(somar());
	}
}
