package aula2;

public class exercicio8FibonacciB {
	public static void main(String[] args) {
		int n1 = 0; //Fn - 2 (dois termos atras)
		int n2 = 1; //Fn - 1 (um termo atras)
		
		System.out.println("Numeros da sequência de Fibonacci menores que 100: ");
		
		while (n1 < 100) {
			System.out.print(n1);
			int sequencia = n1 + n2;
			n1 = n2;
			n2 = sequencia;
			
			if (n1 < 100) {
				System.out.print(", ");
				}
		}
	}
}

//COMENTARIOS:
//O valor da variavel atualiza antes de imprimir a virgula, entao o if da falso e a virgula nao e impressa
