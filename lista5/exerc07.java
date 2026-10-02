package lista5;

public class exerc07 {

	public static void main(String[] args) {
		mostrarNumeros();
		mostrarPares();
		mostrarImpares();
	}
	
	private static void mostrarNumeros() {
		System.out.print("Números: ");
		for (int i = 1; i <= 100; i++) {
			if (i < 100) {
				System.out.print(i + ", ");
			} else {
				System.out.print(i);
			}
		}
	}
	
	private static void mostrarPares() {
		System.out.print("\n\nPares: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i < 100) {
				System.out.print(i + ", ");
			} else if (i == 100) {
				System.out.print(i);
			}
		}
	}
	
	private static void mostrarImpares() {
		System.out.print("\n\nÍmpares: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1 && i < 99) {
				System.out.print(i + ", ");
			} else if (i == 99) {
				System.out.print(i);
			}
		}
	}
}
